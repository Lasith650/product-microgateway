// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/throttle_agent.proto

package org.wso2.gateway.discovery.config.enforcer;

public final class ThrottleAgentProto {
  private ThrottleAgentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_config_enforcer_ThrottleAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_config_enforcer_ThrottleAgent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3wso2/discovery/config/enforcer/throttl" +
      "e_agent.proto\022\036wso2.discovery.config.enf" +
      "orcer\"\334\003\n\rThrottleAgent\022\033\n\023sslEnabledPro" +
      "tocols\030\001 \001(\t\022\017\n\007ciphers\030\002 \001(\t\022\021\n\tqueueSi" +
      "ze\030\003 \001(\005\022\021\n\tbatchSize\030\004 \001(\005\022\024\n\014corePoolS" +
      "ize\030\005 \001(\005\022\027\n\017socketTimeoutMS\030\006 \001(\005\022\023\n\013ma" +
      "xPoolSize\030\007 \001(\005\022\033\n\023keepAliveTimeInPool\030\010" +
      " \001(\005\022\034\n\024reconnectionInterval\030\t \001(\005\022\034\n\024ma" +
      "xTransportPoolSize\030\n \001(\005\022\032\n\022maxIdleConne" +
      "ctions\030\013 \001(\005\022\032\n\022evictionTimePeriod\030\014 \001(\005" +
      "\022\031\n\021minIdleTimeInPool\030\r \001(\005\022\"\n\032secureMax" +
      "TransportPoolSize\030\016 \001(\005\022 \n\030secureMaxIdle" +
      "Connections\030\017 \001(\005\022 \n\030secureEvictionTimeP" +
      "eriod\030\020 \001(\005\022\037\n\027secureMinIdleTimeInPool\030\021" +
      " \001(\005B\222\001\n*org.wso2.gateway.discovery.conf" +
      "ig.enforcerB\022ThrottleAgentProtoP\001ZNgithu" +
      "b.com/envoyproxy/go-control-plane/wso2/d" +
      "iscovery/config/enforcer;enforcerb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_config_enforcer_ThrottleAgent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_config_enforcer_ThrottleAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_config_enforcer_ThrottleAgent_descriptor,
        new java.lang.String[] { "SslEnabledProtocols", "Ciphers", "QueueSize", "BatchSize", "CorePoolSize", "SocketTimeoutMS", "MaxPoolSize", "KeepAliveTimeInPool", "ReconnectionInterval", "MaxTransportPoolSize", "MaxIdleConnections", "EvictionTimePeriod", "MinIdleTimeInPool", "SecureMaxTransportPoolSize", "SecureMaxIdleConnections", "SecureEvictionTimePeriod", "SecureMinIdleTimeInPool", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
