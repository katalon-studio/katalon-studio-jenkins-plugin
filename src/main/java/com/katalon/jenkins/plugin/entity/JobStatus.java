package com.katalon.jenkins.plugin.entity;

import java.util.Arrays;
import java.util.List;

public enum JobStatus {
  QUEUED, RUNNING, FAILED, SUCCESS, CANCELED, ERROR, WAIT_FOR_TRIGGER;

  public static List<JobStatus> getRunningStatuses() {
    return Arrays.asList(QUEUED, RUNNING);
  }

  public static List<JobStatus> getCompletedStatuses() {
    return Arrays.asList(FAILED, SUCCESS, CANCELED, ERROR, WAIT_FOR_TRIGGER);
  }
}
