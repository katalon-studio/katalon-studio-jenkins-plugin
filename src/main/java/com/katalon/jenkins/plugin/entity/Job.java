package com.katalon.jenkins.plugin.entity;

public class Job {

  private long id;

  private long buildNumber;

  private JobStatus status;

  private String queueAt;

  private String startTime;

  private long order;

  private TestProject testProject;

  private Parameter parameter;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(long buildNumber) {
    this.buildNumber = buildNumber;
  }

  public JobStatus getStatus() {
    return status;
  }

  public void setStatus(JobStatus status) {
    this.status = status;
  }

  public String getQueueAt() {
    return queueAt;
  }

  public void setQueueAt(String queueAt) {
    this.queueAt = queueAt;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public long getOrder() {
    return order;
  }

  public void setOrder(long order) {
    this.order = order;
  }

  public TestProject getTestProject() {
    return testProject;
  }

  public void setTestProject(TestProject testProject) {
    this.testProject = testProject;
  }

  public Parameter getParameter() {
    return parameter;
  }

  public void setParameter(Parameter parameter) {
    this.parameter = parameter;
  }
}
