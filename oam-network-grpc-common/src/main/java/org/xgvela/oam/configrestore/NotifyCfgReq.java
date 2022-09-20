// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: configrestore.proto

package org.xgvela.oam.configrestore;

/**
 * Protobuf type {@code configrestore.NotifyCfgReq}
 */
public  final class NotifyCfgReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:configrestore.NotifyCfgReq)
    NotifyCfgReqOrBuilder {
  // Use NotifyCfgReq.newBuilder() to construct.
  private NotifyCfgReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotifyCfgReq() {
    nfType_ = "";
    instanceId_ = "";
    configPath_ = "";
    configFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    xmlPath_ = "";
    xmlFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NotifyCfgReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            nfType_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            instanceId_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            configPath_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              configFileName_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            configFileName_.add(s);
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            xmlPath_ = s;
            break;
          }
          case 50: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              xmlFileName_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000020;
            }
            xmlFileName_.add(s);
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        configFileName_ = configFileName_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        xmlFileName_ = xmlFileName_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ConfigRestore.internal_static_configrestore_NotifyCfgReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ConfigRestore.internal_static_configrestore_NotifyCfgReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            NotifyCfgReq.class, Builder.class);
  }

  private int bitField0_;
  public static final int NFTYPE_FIELD_NUMBER = 1;
  private volatile Object nfType_;
  /**
   * <code>string NfType = 1;</code>
   */
  public String getNfType() {
    Object ref = nfType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      nfType_ = s;
      return s;
    }
  }
  /**
   * <code>string NfType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNfTypeBytes() {
    Object ref = nfType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      nfType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCEID_FIELD_NUMBER = 2;
  private volatile Object instanceId_;
  /**
   * <code>string InstanceId = 2;</code>
   */
  public String getInstanceId() {
    Object ref = instanceId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <code>string InstanceId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    Object ref = instanceId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIGPATH_FIELD_NUMBER = 3;
  private volatile Object configPath_;
  /**
   * <code>string ConfigPath = 3;</code>
   */
  public String getConfigPath() {
    Object ref = configPath_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      configPath_ = s;
      return s;
    }
  }
  /**
   * <code>string ConfigPath = 3;</code>
   */
  public com.google.protobuf.ByteString
      getConfigPathBytes() {
    Object ref = configPath_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      configPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIGFILENAME_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList configFileName_;
  /**
   * <code>repeated string ConfigFileName = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getConfigFileNameList() {
    return configFileName_;
  }
  /**
   * <code>repeated string ConfigFileName = 4;</code>
   */
  public int getConfigFileNameCount() {
    return configFileName_.size();
  }
  /**
   * <code>repeated string ConfigFileName = 4;</code>
   */
  public String getConfigFileName(int index) {
    return configFileName_.get(index);
  }
  /**
   * <code>repeated string ConfigFileName = 4;</code>
   */
  public com.google.protobuf.ByteString
      getConfigFileNameBytes(int index) {
    return configFileName_.getByteString(index);
  }

  public static final int XMLPATH_FIELD_NUMBER = 5;
  private volatile Object xmlPath_;
  /**
   * <code>string XmlPath = 5;</code>
   */
  public String getXmlPath() {
    Object ref = xmlPath_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      xmlPath_ = s;
      return s;
    }
  }
  /**
   * <code>string XmlPath = 5;</code>
   */
  public com.google.protobuf.ByteString
      getXmlPathBytes() {
    Object ref = xmlPath_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      xmlPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int XMLFILENAME_FIELD_NUMBER = 6;
  private com.google.protobuf.LazyStringList xmlFileName_;
  /**
   * <code>repeated string XmlFileName = 6;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getXmlFileNameList() {
    return xmlFileName_;
  }
  /**
   * <code>repeated string XmlFileName = 6;</code>
   */
  public int getXmlFileNameCount() {
    return xmlFileName_.size();
  }
  /**
   * <code>repeated string XmlFileName = 6;</code>
   */
  public String getXmlFileName(int index) {
    return xmlFileName_.get(index);
  }
  /**
   * <code>repeated string XmlFileName = 6;</code>
   */
  public com.google.protobuf.ByteString
      getXmlFileNameBytes(int index) {
    return xmlFileName_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNfTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nfType_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceId_);
    }
    if (!getConfigPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, configPath_);
    }
    for (int i = 0; i < configFileName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, configFileName_.getRaw(i));
    }
    if (!getXmlPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, xmlPath_);
    }
    for (int i = 0; i < xmlFileName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, xmlFileName_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNfTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nfType_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceId_);
    }
    if (!getConfigPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, configPath_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < configFileName_.size(); i++) {
        dataSize += computeStringSizeNoTag(configFileName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getConfigFileNameList().size();
    }
    if (!getXmlPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, xmlPath_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < xmlFileName_.size(); i++) {
        dataSize += computeStringSizeNoTag(xmlFileName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getXmlFileNameList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof NotifyCfgReq)) {
      return super.equals(obj);
    }
    NotifyCfgReq other = (NotifyCfgReq) obj;

    boolean result = true;
    result = result && getNfType()
        .equals(other.getNfType());
    result = result && getInstanceId()
        .equals(other.getInstanceId());
    result = result && getConfigPath()
        .equals(other.getConfigPath());
    result = result && getConfigFileNameList()
        .equals(other.getConfigFileNameList());
    result = result && getXmlPath()
        .equals(other.getXmlPath());
    result = result && getXmlFileNameList()
        .equals(other.getXmlFileNameList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NFTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getNfType().hashCode();
    hash = (37 * hash) + INSTANCEID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    hash = (37 * hash) + CONFIGPATH_FIELD_NUMBER;
    hash = (53 * hash) + getConfigPath().hashCode();
    if (getConfigFileNameCount() > 0) {
      hash = (37 * hash) + CONFIGFILENAME_FIELD_NUMBER;
      hash = (53 * hash) + getConfigFileNameList().hashCode();
    }
    hash = (37 * hash) + XMLPATH_FIELD_NUMBER;
    hash = (53 * hash) + getXmlPath().hashCode();
    if (getXmlFileNameCount() > 0) {
      hash = (37 * hash) + XMLFILENAME_FIELD_NUMBER;
      hash = (53 * hash) + getXmlFileNameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static NotifyCfgReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NotifyCfgReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NotifyCfgReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NotifyCfgReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NotifyCfgReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NotifyCfgReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NotifyCfgReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NotifyCfgReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static NotifyCfgReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static NotifyCfgReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static NotifyCfgReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NotifyCfgReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(NotifyCfgReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code configrestore.NotifyCfgReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:configrestore.NotifyCfgReq)
      NotifyCfgReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ConfigRestore.internal_static_configrestore_NotifyCfgReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ConfigRestore.internal_static_configrestore_NotifyCfgReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NotifyCfgReq.class, Builder.class);
    }

    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      nfType_ = "";

      instanceId_ = "";

      configPath_ = "";

      configFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      xmlPath_ = "";

      xmlFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ConfigRestore.internal_static_configrestore_NotifyCfgReq_descriptor;
    }

    public NotifyCfgReq getDefaultInstanceForType() {
      return NotifyCfgReq.getDefaultInstance();
    }

    public NotifyCfgReq build() {
      NotifyCfgReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public NotifyCfgReq buildPartial() {
      NotifyCfgReq result = new NotifyCfgReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.nfType_ = nfType_;
      result.instanceId_ = instanceId_;
      result.configPath_ = configPath_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        configFileName_ = configFileName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.configFileName_ = configFileName_;
      result.xmlPath_ = xmlPath_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        xmlFileName_ = xmlFileName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.xmlFileName_ = xmlFileName_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof NotifyCfgReq) {
        return mergeFrom((NotifyCfgReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(NotifyCfgReq other) {
      if (other == NotifyCfgReq.getDefaultInstance()) return this;
      if (!other.getNfType().isEmpty()) {
        nfType_ = other.nfType_;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        onChanged();
      }
      if (!other.getConfigPath().isEmpty()) {
        configPath_ = other.configPath_;
        onChanged();
      }
      if (!other.configFileName_.isEmpty()) {
        if (configFileName_.isEmpty()) {
          configFileName_ = other.configFileName_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureConfigFileNameIsMutable();
          configFileName_.addAll(other.configFileName_);
        }
        onChanged();
      }
      if (!other.getXmlPath().isEmpty()) {
        xmlPath_ = other.xmlPath_;
        onChanged();
      }
      if (!other.xmlFileName_.isEmpty()) {
        if (xmlFileName_.isEmpty()) {
          xmlFileName_ = other.xmlFileName_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureXmlFileNameIsMutable();
          xmlFileName_.addAll(other.xmlFileName_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      NotifyCfgReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (NotifyCfgReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object nfType_ = "";
    /**
     * <code>string NfType = 1;</code>
     */
    public String getNfType() {
      Object ref = nfType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nfType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string NfType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNfTypeBytes() {
      Object ref = nfType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nfType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string NfType = 1;</code>
     */
    public Builder setNfType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nfType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string NfType = 1;</code>
     */
    public Builder clearNfType() {
      
      nfType_ = getDefaultInstance().getNfType();
      onChanged();
      return this;
    }
    /**
     * <code>string NfType = 1;</code>
     */
    public Builder setNfTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nfType_ = value;
      onChanged();
      return this;
    }

    private Object instanceId_ = "";
    /**
     * <code>string InstanceId = 2;</code>
     */
    public String getInstanceId() {
      Object ref = instanceId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string InstanceId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string InstanceId = 2;</code>
     */
    public Builder setInstanceId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string InstanceId = 2;</code>
     */
    public Builder clearInstanceId() {
      
      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     * <code>string InstanceId = 2;</code>
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceId_ = value;
      onChanged();
      return this;
    }

    private Object configPath_ = "";
    /**
     * <code>string ConfigPath = 3;</code>
     */
    public String getConfigPath() {
      Object ref = configPath_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        configPath_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string ConfigPath = 3;</code>
     */
    public com.google.protobuf.ByteString
        getConfigPathBytes() {
      Object ref = configPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        configPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ConfigPath = 3;</code>
     */
    public Builder setConfigPath(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      configPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ConfigPath = 3;</code>
     */
    public Builder clearConfigPath() {
      
      configPath_ = getDefaultInstance().getConfigPath();
      onChanged();
      return this;
    }
    /**
     * <code>string ConfigPath = 3;</code>
     */
    public Builder setConfigPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      configPath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList configFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureConfigFileNameIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        configFileName_ = new com.google.protobuf.LazyStringArrayList(configFileName_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getConfigFileNameList() {
      return configFileName_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public int getConfigFileNameCount() {
      return configFileName_.size();
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public String getConfigFileName(int index) {
      return configFileName_.get(index);
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public com.google.protobuf.ByteString
        getConfigFileNameBytes(int index) {
      return configFileName_.getByteString(index);
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public Builder setConfigFileName(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConfigFileNameIsMutable();
      configFileName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public Builder addConfigFileName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureConfigFileNameIsMutable();
      configFileName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public Builder addAllConfigFileName(
        Iterable<String> values) {
      ensureConfigFileNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, configFileName_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public Builder clearConfigFileName() {
      configFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ConfigFileName = 4;</code>
     */
    public Builder addConfigFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureConfigFileNameIsMutable();
      configFileName_.add(value);
      onChanged();
      return this;
    }

    private Object xmlPath_ = "";
    /**
     * <code>string XmlPath = 5;</code>
     */
    public String getXmlPath() {
      Object ref = xmlPath_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        xmlPath_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string XmlPath = 5;</code>
     */
    public com.google.protobuf.ByteString
        getXmlPathBytes() {
      Object ref = xmlPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        xmlPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string XmlPath = 5;</code>
     */
    public Builder setXmlPath(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      xmlPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string XmlPath = 5;</code>
     */
    public Builder clearXmlPath() {
      
      xmlPath_ = getDefaultInstance().getXmlPath();
      onChanged();
      return this;
    }
    /**
     * <code>string XmlPath = 5;</code>
     */
    public Builder setXmlPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      xmlPath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList xmlFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureXmlFileNameIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        xmlFileName_ = new com.google.protobuf.LazyStringArrayList(xmlFileName_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getXmlFileNameList() {
      return xmlFileName_.getUnmodifiableView();
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public int getXmlFileNameCount() {
      return xmlFileName_.size();
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public String getXmlFileName(int index) {
      return xmlFileName_.get(index);
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public com.google.protobuf.ByteString
        getXmlFileNameBytes(int index) {
      return xmlFileName_.getByteString(index);
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public Builder setXmlFileName(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureXmlFileNameIsMutable();
      xmlFileName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public Builder addXmlFileName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureXmlFileNameIsMutable();
      xmlFileName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public Builder addAllXmlFileName(
        Iterable<String> values) {
      ensureXmlFileNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, xmlFileName_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public Builder clearXmlFileName() {
      xmlFileName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string XmlFileName = 6;</code>
     */
    public Builder addXmlFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureXmlFileNameIsMutable();
      xmlFileName_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:configrestore.NotifyCfgReq)
  }

  // @@protoc_insertion_point(class_scope:configrestore.NotifyCfgReq)
  private static final NotifyCfgReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NotifyCfgReq();
  }

  public static NotifyCfgReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotifyCfgReq>
      PARSER = new com.google.protobuf.AbstractParser<NotifyCfgReq>() {
    public NotifyCfgReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotifyCfgReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotifyCfgReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<NotifyCfgReq> getParserForType() {
    return PARSER;
  }

  public NotifyCfgReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
