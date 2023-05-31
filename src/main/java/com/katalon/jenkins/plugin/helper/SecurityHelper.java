package com.katalon.jenkins.plugin.helper;

import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.domains.DomainRequirement;
import hudson.security.ACL;
import hudson.util.Secret;
import jenkins.model.Jenkins;
import org.jenkinsci.plugins.plaincredentials.StringCredentials;

import java.util.Collections;
import java.util.List;

public class SecurityHelper {

    public static Secret getApiKey(String credentialsId) {
        if (credentialsId == null) {
            return null;
        }
        List<StringCredentials> creds = CredentialsProvider.lookupCredentials(StringCredentials.class, Jenkins.getInstance(), ACL.SYSTEM, Collections.<DomainRequirement>emptyList());
        StringCredentials credentials = null;
        for (StringCredentials c : creds) {
            if (credentialsId.matches(c.getId())) {
                credentials = c;
            }
        }
        return credentials == null ? null : credentials.getSecret();
    }
}
