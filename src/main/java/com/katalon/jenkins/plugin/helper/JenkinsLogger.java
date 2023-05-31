package com.katalon.jenkins.plugin.helper;

import com.katalon.utils.Logger;
import hudson.model.TaskListener;

import java.time.LocalDateTime;

public class JenkinsLogger implements Logger {

    private TaskListener taskListener;

    public JenkinsLogger(TaskListener taskListener) {
        this.taskListener = taskListener;
    }

    @Override
    public void info(String message) {
        String timeNow = LocalDateTime.now().toString();
        taskListener.getLogger().println('[' + timeNow + "] " + message);
    }
}
