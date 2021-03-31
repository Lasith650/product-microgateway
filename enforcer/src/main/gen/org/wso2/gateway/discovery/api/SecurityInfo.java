// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/security_info.proto

package org.wso2.gateway.discovery.api;

/**
 * <pre>
 * Endpoint config model
 * </pre>
 *
 * Protobuf type {@code wso2.discovery.api.SecurityInfo}
 */
public final class SecurityInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.api.SecurityInfo)
    SecurityInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityInfo.newBuilder() to construct.
  private SecurityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityInfo() {
    password_ = "";
    customParameters_ = "";
    securityType_ = "";
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SecurityInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            customParameters_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            securityType_ = s;
            break;
          }
          case 32: {

            enabled_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.gateway.discovery.api.SecurityInfoProto.internal_static_wso2_discovery_api_SecurityInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.gateway.discovery.api.SecurityInfoProto.internal_static_wso2_discovery_api_SecurityInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.gateway.discovery.api.SecurityInfo.class, org.wso2.gateway.discovery.api.SecurityInfo.Builder.class);
  }

  public static final int PASSWORD_FIELD_NUMBER = 1;
  private volatile java.lang.Object password_;
  /**
   * <code>string password = 1;</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 1;</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMPARAMETERS_FIELD_NUMBER = 2;
  private volatile java.lang.Object customParameters_;
  /**
   * <code>string customParameters = 2;</code>
   * @return The customParameters.
   */
  @java.lang.Override
  public java.lang.String getCustomParameters() {
    java.lang.Object ref = customParameters_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customParameters_ = s;
      return s;
    }
  }
  /**
   * <code>string customParameters = 2;</code>
   * @return The bytes for customParameters.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomParametersBytes() {
    java.lang.Object ref = customParameters_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customParameters_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITYTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object securityType_;
  /**
   * <code>string securityType = 3;</code>
   * @return The securityType.
   */
  @java.lang.Override
  public java.lang.String getSecurityType() {
    java.lang.Object ref = securityType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityType_ = s;
      return s;
    }
  }
  /**
   * <code>string securityType = 3;</code>
   * @return The bytes for securityType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecurityTypeBytes() {
    java.lang.Object ref = securityType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLED_FIELD_NUMBER = 4;
  private boolean enabled_;
  /**
   * <code>bool enabled = 4;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int USERNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 5;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 5;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, password_);
    }
    if (!getCustomParametersBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, customParameters_);
    }
    if (!getSecurityTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, securityType_);
    }
    if (enabled_ != false) {
      output.writeBool(4, enabled_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, username_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, password_);
    }
    if (!getCustomParametersBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, customParameters_);
    }
    if (!getSecurityTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, securityType_);
    }
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enabled_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, username_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.gateway.discovery.api.SecurityInfo)) {
      return super.equals(obj);
    }
    org.wso2.gateway.discovery.api.SecurityInfo other = (org.wso2.gateway.discovery.api.SecurityInfo) obj;

    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getCustomParameters()
        .equals(other.getCustomParameters())) return false;
    if (!getSecurityType()
        .equals(other.getSecurityType())) return false;
    if (getEnabled()
        != other.getEnabled()) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + CUSTOMPARAMETERS_FIELD_NUMBER;
    hash = (53 * hash) + getCustomParameters().hashCode();
    hash = (37 * hash) + SECURITYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityType().hashCode();
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.gateway.discovery.api.SecurityInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.gateway.discovery.api.SecurityInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Endpoint config model
   * </pre>
   *
   * Protobuf type {@code wso2.discovery.api.SecurityInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.api.SecurityInfo)
      org.wso2.gateway.discovery.api.SecurityInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.gateway.discovery.api.SecurityInfoProto.internal_static_wso2_discovery_api_SecurityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.gateway.discovery.api.SecurityInfoProto.internal_static_wso2_discovery_api_SecurityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.gateway.discovery.api.SecurityInfo.class, org.wso2.gateway.discovery.api.SecurityInfo.Builder.class);
    }

    // Construct using org.wso2.gateway.discovery.api.SecurityInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      password_ = "";

      customParameters_ = "";

      securityType_ = "";

      enabled_ = false;

      username_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.gateway.discovery.api.SecurityInfoProto.internal_static_wso2_discovery_api_SecurityInfo_descriptor;
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.api.SecurityInfo getDefaultInstanceForType() {
      return org.wso2.gateway.discovery.api.SecurityInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.api.SecurityInfo build() {
      org.wso2.gateway.discovery.api.SecurityInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.gateway.discovery.api.SecurityInfo buildPartial() {
      org.wso2.gateway.discovery.api.SecurityInfo result = new org.wso2.gateway.discovery.api.SecurityInfo(this);
      result.password_ = password_;
      result.customParameters_ = customParameters_;
      result.securityType_ = securityType_;
      result.enabled_ = enabled_;
      result.username_ = username_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.gateway.discovery.api.SecurityInfo) {
        return mergeFrom((org.wso2.gateway.discovery.api.SecurityInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.gateway.discovery.api.SecurityInfo other) {
      if (other == org.wso2.gateway.discovery.api.SecurityInfo.getDefaultInstance()) return this;
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (!other.getCustomParameters().isEmpty()) {
        customParameters_ = other.customParameters_;
        onChanged();
      }
      if (!other.getSecurityType().isEmpty()) {
        securityType_ = other.securityType_;
        onChanged();
      }
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.gateway.discovery.api.SecurityInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.gateway.discovery.api.SecurityInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 1;</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customParameters_ = "";
    /**
     * <code>string customParameters = 2;</code>
     * @return The customParameters.
     */
    public java.lang.String getCustomParameters() {
      java.lang.Object ref = customParameters_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customParameters_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string customParameters = 2;</code>
     * @return The bytes for customParameters.
     */
    public com.google.protobuf.ByteString
        getCustomParametersBytes() {
      java.lang.Object ref = customParameters_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customParameters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string customParameters = 2;</code>
     * @param value The customParameters to set.
     * @return This builder for chaining.
     */
    public Builder setCustomParameters(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customParameters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string customParameters = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomParameters() {
      
      customParameters_ = getDefaultInstance().getCustomParameters();
      onChanged();
      return this;
    }
    /**
     * <code>string customParameters = 2;</code>
     * @param value The bytes for customParameters to set.
     * @return This builder for chaining.
     */
    public Builder setCustomParametersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customParameters_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object securityType_ = "";
    /**
     * <code>string securityType = 3;</code>
     * @return The securityType.
     */
    public java.lang.String getSecurityType() {
      java.lang.Object ref = securityType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string securityType = 3;</code>
     * @return The bytes for securityType.
     */
    public com.google.protobuf.ByteString
        getSecurityTypeBytes() {
      java.lang.Object ref = securityType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string securityType = 3;</code>
     * @param value The securityType to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string securityType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecurityType() {
      
      securityType_ = getDefaultInstance().getSecurityType();
      onChanged();
      return this;
    }
    /**
     * <code>string securityType = 3;</code>
     * @param value The bytes for securityType to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityType_ = value;
      onChanged();
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>bool enabled = 4;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>bool enabled = 4;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 5;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 5;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 5;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 5;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wso2.discovery.api.SecurityInfo)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.api.SecurityInfo)
  private static final org.wso2.gateway.discovery.api.SecurityInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.gateway.discovery.api.SecurityInfo();
  }

  public static org.wso2.gateway.discovery.api.SecurityInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityInfo>
      PARSER = new com.google.protobuf.AbstractParser<SecurityInfo>() {
    @java.lang.Override
    public SecurityInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SecurityInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SecurityInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.gateway.discovery.api.SecurityInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
