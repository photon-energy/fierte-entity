package com.fierte.entity.entity.auth;

public class UpdateUser {

    private UserCredentials[] credentials;

    public UpdateUser(){}

    public UpdateUser(UserCredentials[] credentials) {
        this.credentials = credentials;
    }

    public UserCredentials[] getCredentials() {
        return credentials;
    }

    public void setCredentials(UserCredentials[] credentials) {
        this.credentials = credentials;
    }
}
