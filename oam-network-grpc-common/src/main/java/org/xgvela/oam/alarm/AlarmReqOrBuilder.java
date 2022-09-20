// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: alarm.proto

package org.xgvela.oam.alarm;

public interface AlarmReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alarm.AlarmReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string neType = 1;</code>
   */
  String getNeType();
  /**
   * <code>string neType = 1;</code>
   */
  com.google.protobuf.ByteString
      getNeTypeBytes();

  /**
   * <code>string neId = 2;</code>
   */
  String getNeId();
  /**
   * <code>string neId = 2;</code>
   */
  com.google.protobuf.ByteString
      getNeIdBytes();

  /**
   * <code>string alarmId = 3;</code>
   */
  String getAlarmId();
  /**
   * <code>string alarmId = 3;</code>
   */
  com.google.protobuf.ByteString
      getAlarmIdBytes();

  /**
   * <code>uint64 alarmCurrentTime = 4;</code>
   */
  long getAlarmCurrentTime();

  /**
   * <code>uint32 alarmLevel = 5;</code>
   */
  int getAlarmLevel();

  /**
   * <code>uint32 alarmType = 6;</code>
   */
  int getAlarmType();

  /**
   * <pre>
   *0-active alarm 1-clear alarm
   * </pre>
   *
   * <code>uint32 alarmStatusType = 7;</code>
   */
  int getAlarmStatusType();

  /**
   * <code>string neName = 8;</code>
   */
  String getNeName();
  /**
   * <code>string neName = 8;</code>
   */
  com.google.protobuf.ByteString
      getNeNameBytes();

  /**
   * <code>string alarmName = 9;</code>
   */
  String getAlarmName();
  /**
   * <code>string alarmName = 9;</code>
   */
  com.google.protobuf.ByteString
      getAlarmNameBytes();

  /**
   * <code>string alarmObject = 10;</code>
   */
  String getAlarmObject();
  /**
   * <code>string alarmObject = 10;</code>
   */
  com.google.protobuf.ByteString
      getAlarmObjectBytes();

  /**
   * <code>string alarmLocationInfo = 11;</code>
   */
  String getAlarmLocationInfo();
  /**
   * <code>string alarmLocationInfo = 11;</code>
   */
  com.google.protobuf.ByteString
      getAlarmLocationInfoBytes();

  /**
   * <code>string alarmObjectName = 12;</code>
   */
  String getAlarmObjectName();
  /**
   * <code>string alarmObjectName = 12;</code>
   */
  com.google.protobuf.ByteString
      getAlarmObjectNameBytes();

  /**
   * <code>string specificProblem = 13;</code>
   */
  String getSpecificProblem();
  /**
   * <code>string specificProblem = 13;</code>
   */
  com.google.protobuf.ByteString
      getSpecificProblemBytes();

  /**
   * <code>string specificProblemId = 14;</code>
   */
  String getSpecificProblemId();
  /**
   * <code>string specificProblemId = 14;</code>
   */
  com.google.protobuf.ByteString
      getSpecificProblemIdBytes();

  /**
   * <code>string source = 15;</code>
   */
  String getSource();
  /**
   * <code>string source = 15;</code>
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>string rmUid = 16;</code>
   */
  String getRmUid();
  /**
   * <code>string rmUid = 16;</code>
   */
  com.google.protobuf.ByteString
      getRmUidBytes();

  /**
   * <code>string alarmDeviceType = 17;</code>
   */
  String getAlarmDeviceType();
  /**
   * <code>string alarmDeviceType = 17;</code>
   */
  com.google.protobuf.ByteString
      getAlarmDeviceTypeBytes();
}