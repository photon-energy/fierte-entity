package com.fierte.web.entity.users;

public class ConfirmResponse {

    private boolean success;


    public ConfirmResponse(){}

    public ConfirmResponse(boolean success){
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
