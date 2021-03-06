// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: couponData.proto

package com.hzs.couponandroid;

public final class CouponDataProto {
  private CouponDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface CouponOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Coupon)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>optional int32 vendID = 2;</code>
     */
    int getVendID();

    /**
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string imgUri = 4;</code>
     */
    java.lang.String getImgUri();
    /**
     * <code>optional string imgUri = 4;</code>
     */
    com.google.protobuf.ByteString
        getImgUriBytes();

    /**
     * <code>optional string header = 5;</code>
     */
    java.lang.String getHeader();
    /**
     * <code>optional string header = 5;</code>
     */
    com.google.protobuf.ByteString
        getHeaderBytes();

    /**
     * <code>optional string text1 = 6;</code>
     */
    java.lang.String getText1();
    /**
     * <code>optional string text1 = 6;</code>
     */
    com.google.protobuf.ByteString
        getText1Bytes();

    /**
     * <code>optional string text2 = 7;</code>
     */
    java.lang.String getText2();
    /**
     * <code>optional string text2 = 7;</code>
     */
    com.google.protobuf.ByteString
        getText2Bytes();

    /**
     * <code>optional string text3 = 8;</code>
     */
    java.lang.String getText3();
    /**
     * <code>optional string text3 = 8;</code>
     */
    com.google.protobuf.ByteString
        getText3Bytes();

    /**
     * <code>optional string text4 = 9;</code>
     */
    java.lang.String getText4();
    /**
     * <code>optional string text4 = 9;</code>
     */
    com.google.protobuf.ByteString
        getText4Bytes();
  }
  /**
   * Protobuf type {@code Coupon}
   */
  public  static final class Coupon extends
      com.google.protobuf.GeneratedMessageLite<
          Coupon, Coupon.Builder> implements
      // @@protoc_insertion_point(message_implements:Coupon)
      CouponOrBuilder {
    private Coupon() {
      name_ = "";
      imgUri_ = "";
      header_ = "";
      text1_ = "";
      text2_ = "";
      text3_ = "";
      text4_ = "";
    }
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>optional int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>optional int32 type = 1;</code>
     */
    private void setType(int value) {
      
      type_ = value;
    }
    /**
     * <code>optional int32 type = 1;</code>
     */
    private void clearType() {
      
      type_ = 0;
    }

    public static final int VENDID_FIELD_NUMBER = 2;
    private int vendID_;
    /**
     * <code>optional int32 vendID = 2;</code>
     */
    public int getVendID() {
      return vendID_;
    }
    /**
     * <code>optional int32 vendID = 2;</code>
     */
    private void setVendID(int value) {
      
      vendID_ = value;
    }
    /**
     * <code>optional int32 vendID = 2;</code>
     */
    private void clearVendID() {
      
      vendID_ = 0;
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.String name_;
    /**
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>optional string name = 3;</code>
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value.toStringUtf8();
    }

    public static final int IMGURI_FIELD_NUMBER = 4;
    private java.lang.String imgUri_;
    /**
     * <code>optional string imgUri = 4;</code>
     */
    public java.lang.String getImgUri() {
      return imgUri_;
    }
    /**
     * <code>optional string imgUri = 4;</code>
     */
    public com.google.protobuf.ByteString
        getImgUriBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(imgUri_);
    }
    /**
     * <code>optional string imgUri = 4;</code>
     */
    private void setImgUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imgUri_ = value;
    }
    /**
     * <code>optional string imgUri = 4;</code>
     */
    private void clearImgUri() {
      
      imgUri_ = getDefaultInstance().getImgUri();
    }
    /**
     * <code>optional string imgUri = 4;</code>
     */
    private void setImgUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imgUri_ = value.toStringUtf8();
    }

    public static final int HEADER_FIELD_NUMBER = 5;
    private java.lang.String header_;
    /**
     * <code>optional string header = 5;</code>
     */
    public java.lang.String getHeader() {
      return header_;
    }
    /**
     * <code>optional string header = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHeaderBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(header_);
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void setHeader(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      header_ = value;
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void clearHeader() {
      
      header_ = getDefaultInstance().getHeader();
    }
    /**
     * <code>optional string header = 5;</code>
     */
    private void setHeaderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      header_ = value.toStringUtf8();
    }

    public static final int TEXT1_FIELD_NUMBER = 6;
    private java.lang.String text1_;
    /**
     * <code>optional string text1 = 6;</code>
     */
    public java.lang.String getText1() {
      return text1_;
    }
    /**
     * <code>optional string text1 = 6;</code>
     */
    public com.google.protobuf.ByteString
        getText1Bytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(text1_);
    }
    /**
     * <code>optional string text1 = 6;</code>
     */
    private void setText1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text1_ = value;
    }
    /**
     * <code>optional string text1 = 6;</code>
     */
    private void clearText1() {
      
      text1_ = getDefaultInstance().getText1();
    }
    /**
     * <code>optional string text1 = 6;</code>
     */
    private void setText1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text1_ = value.toStringUtf8();
    }

    public static final int TEXT2_FIELD_NUMBER = 7;
    private java.lang.String text2_;
    /**
     * <code>optional string text2 = 7;</code>
     */
    public java.lang.String getText2() {
      return text2_;
    }
    /**
     * <code>optional string text2 = 7;</code>
     */
    public com.google.protobuf.ByteString
        getText2Bytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(text2_);
    }
    /**
     * <code>optional string text2 = 7;</code>
     */
    private void setText2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text2_ = value;
    }
    /**
     * <code>optional string text2 = 7;</code>
     */
    private void clearText2() {
      
      text2_ = getDefaultInstance().getText2();
    }
    /**
     * <code>optional string text2 = 7;</code>
     */
    private void setText2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text2_ = value.toStringUtf8();
    }

    public static final int TEXT3_FIELD_NUMBER = 8;
    private java.lang.String text3_;
    /**
     * <code>optional string text3 = 8;</code>
     */
    public java.lang.String getText3() {
      return text3_;
    }
    /**
     * <code>optional string text3 = 8;</code>
     */
    public com.google.protobuf.ByteString
        getText3Bytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(text3_);
    }
    /**
     * <code>optional string text3 = 8;</code>
     */
    private void setText3(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text3_ = value;
    }
    /**
     * <code>optional string text3 = 8;</code>
     */
    private void clearText3() {
      
      text3_ = getDefaultInstance().getText3();
    }
    /**
     * <code>optional string text3 = 8;</code>
     */
    private void setText3Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text3_ = value.toStringUtf8();
    }

    public static final int TEXT4_FIELD_NUMBER = 9;
    private java.lang.String text4_;
    /**
     * <code>optional string text4 = 9;</code>
     */
    public java.lang.String getText4() {
      return text4_;
    }
    /**
     * <code>optional string text4 = 9;</code>
     */
    public com.google.protobuf.ByteString
        getText4Bytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(text4_);
    }
    /**
     * <code>optional string text4 = 9;</code>
     */
    private void setText4(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text4_ = value;
    }
    /**
     * <code>optional string text4 = 9;</code>
     */
    private void clearText4() {
      
      text4_ = getDefaultInstance().getText4();
    }
    /**
     * <code>optional string text4 = 9;</code>
     */
    private void setText4Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text4_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      if (vendID_ != 0) {
        output.writeInt32(2, vendID_);
      }
      if (!name_.isEmpty()) {
        output.writeString(3, getName());
      }
      if (!imgUri_.isEmpty()) {
        output.writeString(4, getImgUri());
      }
      if (!header_.isEmpty()) {
        output.writeString(5, getHeader());
      }
      if (!text1_.isEmpty()) {
        output.writeString(6, getText1());
      }
      if (!text2_.isEmpty()) {
        output.writeString(7, getText2());
      }
      if (!text3_.isEmpty()) {
        output.writeString(8, getText3());
      }
      if (!text4_.isEmpty()) {
        output.writeString(9, getText4());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (vendID_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, vendID_);
      }
      if (!name_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getName());
      }
      if (!imgUri_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getImgUri());
      }
      if (!header_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getHeader());
      }
      if (!text1_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getText1());
      }
      if (!text2_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getText2());
      }
      if (!text3_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getText3());
      }
      if (!text4_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(9, getText4());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.hzs.couponandroid.CouponDataProto.Coupon parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.hzs.couponandroid.CouponDataProto.Coupon prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code Coupon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.hzs.couponandroid.CouponDataProto.Coupon, Builder> implements
        // @@protoc_insertion_point(builder_implements:Coupon)
        com.hzs.couponandroid.CouponDataProto.CouponOrBuilder {
      // Construct using com.hzs.couponandroid.CouponDataProto.Coupon.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional int32 type = 1;</code>
       */
      public int getType() {
        return instance.getType();
      }
      /**
       * <code>optional int32 type = 1;</code>
       */
      public Builder setType(int value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <code>optional int32 type = 1;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      /**
       * <code>optional int32 vendID = 2;</code>
       */
      public int getVendID() {
        return instance.getVendID();
      }
      /**
       * <code>optional int32 vendID = 2;</code>
       */
      public Builder setVendID(int value) {
        copyOnWrite();
        instance.setVendID(value);
        return this;
      }
      /**
       * <code>optional int32 vendID = 2;</code>
       */
      public Builder clearVendID() {
        copyOnWrite();
        instance.clearVendID();
        return this;
      }

      /**
       * <code>optional string name = 3;</code>
       */
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>optional string name = 3;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <code>optional string imgUri = 4;</code>
       */
      public java.lang.String getImgUri() {
        return instance.getImgUri();
      }
      /**
       * <code>optional string imgUri = 4;</code>
       */
      public com.google.protobuf.ByteString
          getImgUriBytes() {
        return instance.getImgUriBytes();
      }
      /**
       * <code>optional string imgUri = 4;</code>
       */
      public Builder setImgUri(
          java.lang.String value) {
        copyOnWrite();
        instance.setImgUri(value);
        return this;
      }
      /**
       * <code>optional string imgUri = 4;</code>
       */
      public Builder clearImgUri() {
        copyOnWrite();
        instance.clearImgUri();
        return this;
      }
      /**
       * <code>optional string imgUri = 4;</code>
       */
      public Builder setImgUriBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setImgUriBytes(value);
        return this;
      }

      /**
       * <code>optional string header = 5;</code>
       */
      public java.lang.String getHeader() {
        return instance.getHeader();
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public com.google.protobuf.ByteString
          getHeaderBytes() {
        return instance.getHeaderBytes();
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder setHeader(
          java.lang.String value) {
        copyOnWrite();
        instance.setHeader(value);
        return this;
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder clearHeader() {
        copyOnWrite();
        instance.clearHeader();
        return this;
      }
      /**
       * <code>optional string header = 5;</code>
       */
      public Builder setHeaderBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setHeaderBytes(value);
        return this;
      }

      /**
       * <code>optional string text1 = 6;</code>
       */
      public java.lang.String getText1() {
        return instance.getText1();
      }
      /**
       * <code>optional string text1 = 6;</code>
       */
      public com.google.protobuf.ByteString
          getText1Bytes() {
        return instance.getText1Bytes();
      }
      /**
       * <code>optional string text1 = 6;</code>
       */
      public Builder setText1(
          java.lang.String value) {
        copyOnWrite();
        instance.setText1(value);
        return this;
      }
      /**
       * <code>optional string text1 = 6;</code>
       */
      public Builder clearText1() {
        copyOnWrite();
        instance.clearText1();
        return this;
      }
      /**
       * <code>optional string text1 = 6;</code>
       */
      public Builder setText1Bytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setText1Bytes(value);
        return this;
      }

      /**
       * <code>optional string text2 = 7;</code>
       */
      public java.lang.String getText2() {
        return instance.getText2();
      }
      /**
       * <code>optional string text2 = 7;</code>
       */
      public com.google.protobuf.ByteString
          getText2Bytes() {
        return instance.getText2Bytes();
      }
      /**
       * <code>optional string text2 = 7;</code>
       */
      public Builder setText2(
          java.lang.String value) {
        copyOnWrite();
        instance.setText2(value);
        return this;
      }
      /**
       * <code>optional string text2 = 7;</code>
       */
      public Builder clearText2() {
        copyOnWrite();
        instance.clearText2();
        return this;
      }
      /**
       * <code>optional string text2 = 7;</code>
       */
      public Builder setText2Bytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setText2Bytes(value);
        return this;
      }

      /**
       * <code>optional string text3 = 8;</code>
       */
      public java.lang.String getText3() {
        return instance.getText3();
      }
      /**
       * <code>optional string text3 = 8;</code>
       */
      public com.google.protobuf.ByteString
          getText3Bytes() {
        return instance.getText3Bytes();
      }
      /**
       * <code>optional string text3 = 8;</code>
       */
      public Builder setText3(
          java.lang.String value) {
        copyOnWrite();
        instance.setText3(value);
        return this;
      }
      /**
       * <code>optional string text3 = 8;</code>
       */
      public Builder clearText3() {
        copyOnWrite();
        instance.clearText3();
        return this;
      }
      /**
       * <code>optional string text3 = 8;</code>
       */
      public Builder setText3Bytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setText3Bytes(value);
        return this;
      }

      /**
       * <code>optional string text4 = 9;</code>
       */
      public java.lang.String getText4() {
        return instance.getText4();
      }
      /**
       * <code>optional string text4 = 9;</code>
       */
      public com.google.protobuf.ByteString
          getText4Bytes() {
        return instance.getText4Bytes();
      }
      /**
       * <code>optional string text4 = 9;</code>
       */
      public Builder setText4(
          java.lang.String value) {
        copyOnWrite();
        instance.setText4(value);
        return this;
      }
      /**
       * <code>optional string text4 = 9;</code>
       */
      public Builder clearText4() {
        copyOnWrite();
        instance.clearText4();
        return this;
      }
      /**
       * <code>optional string text4 = 9;</code>
       */
      public Builder setText4Bytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setText4Bytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Coupon)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.hzs.couponandroid.CouponDataProto.Coupon();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.hzs.couponandroid.CouponDataProto.Coupon other = (com.hzs.couponandroid.CouponDataProto.Coupon) arg1;
          type_ = visitor.visitInt(type_ != 0, type_,
              other.type_ != 0, other.type_);
          vendID_ = visitor.visitInt(vendID_ != 0, vendID_,
              other.vendID_ != 0, other.vendID_);
          name_ = visitor.visitString(!name_.isEmpty(), name_,
              !other.name_.isEmpty(), other.name_);
          imgUri_ = visitor.visitString(!imgUri_.isEmpty(), imgUri_,
              !other.imgUri_.isEmpty(), other.imgUri_);
          header_ = visitor.visitString(!header_.isEmpty(), header_,
              !other.header_.isEmpty(), other.header_);
          text1_ = visitor.visitString(!text1_.isEmpty(), text1_,
              !other.text1_.isEmpty(), other.text1_);
          text2_ = visitor.visitString(!text2_.isEmpty(), text2_,
              !other.text2_.isEmpty(), other.text2_);
          text3_ = visitor.visitString(!text3_.isEmpty(), text3_,
              !other.text3_.isEmpty(), other.text3_);
          text4_ = visitor.visitString(!text4_.isEmpty(), text4_,
              !other.text4_.isEmpty(), other.text4_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 8: {

                  type_ = input.readInt32();
                  break;
                }
                case 16: {

                  vendID_ = input.readInt32();
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  name_ = s;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  imgUri_ = s;
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  header_ = s;
                  break;
                }
                case 50: {
                  String s = input.readStringRequireUtf8();

                  text1_ = s;
                  break;
                }
                case 58: {
                  String s = input.readStringRequireUtf8();

                  text2_ = s;
                  break;
                }
                case 66: {
                  String s = input.readStringRequireUtf8();

                  text3_ = s;
                  break;
                }
                case 74: {
                  String s = input.readStringRequireUtf8();

                  text4_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.hzs.couponandroid.CouponDataProto.Coupon.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Coupon)
    private static final com.hzs.couponandroid.CouponDataProto.Coupon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Coupon();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.hzs.couponandroid.CouponDataProto.Coupon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Coupon> PARSER;

    public static com.google.protobuf.Parser<Coupon> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
