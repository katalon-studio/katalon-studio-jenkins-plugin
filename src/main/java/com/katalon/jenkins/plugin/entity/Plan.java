package com.katalon.jenkins.plugin.entity;

public class Plan {

  private long id;

  private String name;

  private long projectId;

  private long teamId;

  private long testProjectId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getProjectId() {
    return projectId;
  }

  public void setProjectId(long projectId) {
    this.projectId = projectId;
  }

  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }

  public long getTestProjectId() {
    return testProjectId;
  }

  public void setTestProjectId(long testProjectId) {
    this.testProjectId = testProjectId;
  }
}
