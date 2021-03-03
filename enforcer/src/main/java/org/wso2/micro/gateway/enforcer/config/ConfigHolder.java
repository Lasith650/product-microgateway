/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.micro.gateway.enforcer.config;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.carbon.apimgt.common.gateway.dto.JWTConfigurationDto;
import org.wso2.gateway.discovery.config.enforcer.AmCredentials;
import org.wso2.gateway.discovery.config.enforcer.AuthService;
import org.wso2.gateway.discovery.config.enforcer.Cache;
import org.wso2.gateway.discovery.config.enforcer.Config;
import org.wso2.gateway.discovery.config.enforcer.EventHub;
import org.wso2.gateway.discovery.config.enforcer.Issuer;
import org.wso2.gateway.discovery.config.enforcer.JWTGenerator;
import org.wso2.micro.gateway.enforcer.config.dto.AuthServiceConfigurationDto;
import org.wso2.micro.gateway.enforcer.config.dto.CacheDto;
import org.wso2.micro.gateway.enforcer.config.dto.CredentialDto;
import org.wso2.micro.gateway.enforcer.config.dto.EventHubConfigurationDto;
import org.wso2.micro.gateway.enforcer.config.dto.JWKSConfigurationDTO;
import org.wso2.micro.gateway.enforcer.config.dto.TokenIssuerDto;
import org.wso2.micro.gateway.enforcer.constants.Constants;
import org.wso2.micro.gateway.enforcer.discovery.ConfigDiscoveryClient;
import org.wso2.micro.gateway.enforcer.exception.DiscoveryException;
import org.wso2.micro.gateway.enforcer.util.TLSUtils;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.net.ssl.TrustManagerFactory;

/**
 * Configuration holder class for Microgateway.
 */
public class ConfigHolder {

    // TODO: Resolve default configs
    private static final Logger logger = LogManager.getLogger(ConfigHolder.class);

    private static ConfigHolder configHolder;
    private EnvVarConfig envVarConfig = new EnvVarConfig();
    EnforcerConfig config = new EnforcerConfig();
    private KeyStore trustStore = null;
    private KeyStore trustStoreForJWT = null;
    private TrustManagerFactory trustManagerFactory = null;
    private ArrayList<TokenIssuerDto> configIssuerList;

    private ConfigHolder() {
        init();
    }

    public static ConfigHolder getInstance() {
        if (configHolder != null) {
            return configHolder;
        }
        configHolder = new ConfigHolder();
        return configHolder;
    }

    /**
     * Initialize the configuration provider class by reading the Mgw Configuration file.
     */
    private void init() {
        //Load Client Trust Store
        loadTrustStore();
        ConfigDiscoveryClient cds = new ConfigDiscoveryClient(envVarConfig, trustManagerFactory);

        try {
            Config cdsConfig = cds.requestInitConfig();
            parseConfigs(cdsConfig);
        } catch (DiscoveryException e) {
            logger.error("Error in loading configurations from Adapter", e);
            System.exit(1);
        }
    }

    /**
     * Parse configurations received from the CDS to internal configuration DTO.
     * This is done inorder to prevent complicated code changes during the initial development
     * of the mgw. Later we can switch to CDS data models directly.
     */
    private void parseConfigs(Config config) {
        // load EventHub
        populateEventHub(config.getEventhub());
        // load auth service
        populateAuthService(config.getAuthService());

        // Read jwt token configuration
        populateJWTIssuerConfiguration(config.getJwtTokenConfigList());

        //Read credentials used to connect with APIM services
        populateAPIMCredentials(config.getApimCredentials());

        // Read backend jwt generation configurations
        populateJWTGeneratorConfigurations(config.getJwtGenerator());

        // Read token caching configs
        populateCacheConfigs(config.getCache());

    }

    private void populateAuthService(AuthService cdsAuth) {
        AuthServiceConfigurationDto authDto = new AuthServiceConfigurationDto();
        authDto.setKeepAliveTime(cdsAuth.getKeepAliveTime());
        authDto.setPort(cdsAuth.getPort());
        authDto.setMaxHeaderLimit(cdsAuth.getMaxHeaderLimit());
        authDto.setMaxMessageSize(cdsAuth.getMaxMessageSize());

        AuthServiceConfigurationDto.ThreadPoolConfig threadPool = authDto.new ThreadPoolConfig();
        threadPool.setCoreSize(cdsAuth.getThreadPool().getCoreSize());
        threadPool.setKeepAliveTime(cdsAuth.getThreadPool().getKeepAliveTime());
        threadPool.setMaxSize(cdsAuth.getThreadPool().getMaxSize());
        threadPool.setQueueSize(cdsAuth.getThreadPool().getQueueSize());
        authDto.setThreadPool(threadPool);

        config.setAuthService(authDto);
    }

    private void populateEventHub(EventHub eventhub) {
        EventHubConfigurationDto eventHubDto = new EventHubConfigurationDto();
        eventHubDto.setEnable(eventhub.getEnabled());
        eventHubDto.setServiceUrl(eventhub.getServiceUrl());

        Properties jmsProps = new Properties();
        jmsProps.put(Constants.EVENT_HUB_EVENT_LISTENING_ENDPOINT,
                eventhub.getJmsConnectionParameters().getEventListeningEndpointsList());
        eventHubDto.setJmsConnectionParameters(jmsProps);

        config.setEventHub(eventHubDto);
    }

    private void populateJWTIssuerConfiguration(List<Issuer> cdsIssuers) {
        configIssuerList = new ArrayList<>();
        try {
            setTrustStoreForJWT(KeyStore.getInstance(KeyStore.getDefaultType()));
            getTrustStoreForJWT().load(null);
        } catch (KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException e) {
            logger.error("Error while initiating the truststore for JWT related public certificates", e);
        }
        for (Issuer jwtIssuer : cdsIssuers) {
            TokenIssuerDto issuerDto = new TokenIssuerDto(jwtIssuer.getIssuer());

            JWKSConfigurationDTO jwksConfigurationDTO = new JWKSConfigurationDTO();
            jwksConfigurationDTO.setEnabled(StringUtils.isNotEmpty(jwtIssuer.getJwksURL()));
            jwksConfigurationDTO.setUrl(jwtIssuer.getJwksURL());
            issuerDto.setJwksConfigurationDTO(jwksConfigurationDTO);

            String certificateAlias = jwtIssuer.getCertificateAlias();
            if (certificateAlias != null) {
                try {
                    Certificate cert = TLSUtils.getCertificateFromFile(jwtIssuer.getCertificateFilePath());
                    getTrustStoreForJWT().setCertificateEntry(certificateAlias, cert);
                    issuerDto.setCertificate(cert);
                } catch (KeyStoreException | CertificateException | IOException e) {
                    logger.error("Error while adding certificates to the JWT related Truststore", e);
                }
            }

            issuerDto.setName(jwtIssuer.getName());
            issuerDto.setConsumerKeyClaim(jwtIssuer.getConsumerKeyClaim());
            issuerDto.setValidateSubscriptions(jwtIssuer.getValidateSubscription());
            config.getIssuersMap().put(jwtIssuer.getIssuer(), issuerDto);
            configIssuerList.add(issuerDto);
        }
    }

    private void loadTrustStore() {
        try {
            trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null);
            String truststoreFilePath = getEnvVarConfig().getTrustedAdapterCertsPath();
            TLSUtils.addCertsToTruststore(trustStore, truststoreFilePath);
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(trustStore);
        } catch (KeyStoreException | CertificateException | NoSuchAlgorithmException | IOException e) {
            logger.error("Error in loading certs to the trust store.", e);
        }
    }

    private void populateAPIMCredentials(AmCredentials cred) {
        String username = cred.getUsername();
        char[] password = cred.getPassword().toCharArray();
        CredentialDto credentialDto = new CredentialDto(username, password);
        config.setApimCredentials(credentialDto);
    }

    private void populateJWTGeneratorConfigurations(JWTGenerator jwtGenerator) {
        JWTConfigurationDto jwtConfigurationDto = new JWTConfigurationDto();
        jwtConfigurationDto.setEnabled(jwtGenerator.getEnable());
        jwtConfigurationDto.setJwtHeader(jwtGenerator.getHeader());
        jwtConfigurationDto.setConsumerDialectUri(jwtGenerator.getClaimDialect());
        jwtConfigurationDto.setSignatureAlgorithm(jwtGenerator.getSigningAlgorithm());
        jwtConfigurationDto.setEnableUserClaims(jwtGenerator.getEnableUserClaims());
        jwtConfigurationDto.setGatewayJWTGeneratorImpl(jwtGenerator.getGatewayGeneratorImpl());
        config.setPublicCertificatePath(jwtGenerator.getPublicCertificatePath());
        config.setPrivateKeyPath(jwtGenerator.getPrivateKeyPath());
        config.setJwtConfigurationDto(jwtConfigurationDto);
    }

    private void populateCacheConfigs(Cache cache) {
        CacheDto cacheDto = new CacheDto();
        cacheDto.setEnabled(cache.getEnable());
        cacheDto.setMaximumSize(cache.getMaximumSize());
        cacheDto.setExpiryTime(cache.getExpiryTime());
        config.setCacheDto(cacheDto);
    }

    public EnforcerConfig getConfig() {
        return config;
    }

    public void setConfig(EnforcerConfig config) {
        this.config = config;
    }

    public KeyStore getTrustStore() {
        return trustStore;
    }

    public KeyStore getTrustStoreForJWT() {
        return trustStoreForJWT;
    }

    public void setTrustStoreForJWT(KeyStore trustStoreForJWT) {
        this.trustStoreForJWT = trustStoreForJWT;
    }

    public TrustManagerFactory getTrustManagerFactory() {
        return trustManagerFactory;
    }

    public void setTrustManagerFactory(TrustManagerFactory trustManagerFactory) {
        this.trustManagerFactory = trustManagerFactory;
    }

    public EnvVarConfig getEnvVarConfig() {
        return envVarConfig;
    }

    public ArrayList<TokenIssuerDto> getConfigIssuerList() {
        return configIssuerList;
    }

    public void setConfigIssuerList(ArrayList<TokenIssuerDto> configIssuerList) {
        this.configIssuerList = configIssuerList;
    }
}