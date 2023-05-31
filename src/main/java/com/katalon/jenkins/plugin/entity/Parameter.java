package com.katalon.jenkins.plugin.entity;

public class Parameter {

  private String command;

  private String ksVersion;

  private String ksLocation;

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getKsVersion() {
    return ksVersion;
  }

  public void setKsVersion(String ksVersion) {
    this.ksVersion = ksVersion;
  }

  public String getKsLocation() {
    return ksLocation;
  }

  public void setKsLocation(String ksLocation) {
    this.ksLocation = ksLocation;
  }
}
