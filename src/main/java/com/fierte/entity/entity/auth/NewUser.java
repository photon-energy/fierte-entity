package com.fierte.entity.entity.auth;

import java.util.Map;

public class NewUser {

    private String username;
    private boolean enabled;
    private boolean emailVerified;
    private String firstName;
    private String lastName;
    private Map<String, String> attributes;
    private UserCredentials[] credentials;

    public NewUser(){}

    public NewUser(String username, boolean enabled, boolean emailVerified, String firstName, String lastName, Map<String, String> attributes, UserCredentials[] credentials){
        this.username = username;
        this.enabled = enabled;
        this.emailVerified = emailVerified;
        this.firstName = firstName;
        this.lastName = lastName;
        this.attributes = attributes;
        this.credentials = credentials;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public UserCredentials[] getCredentials() {
        return credentials;
    }

    public void setCredentials(UserCredentials[] credentials) {
        this.credentials = credentials;
    }
}
