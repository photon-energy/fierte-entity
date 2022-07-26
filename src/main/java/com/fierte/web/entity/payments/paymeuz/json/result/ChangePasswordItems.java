package com.fierte.web.entity.payments.paymeuz.json.result;

public class ChangePasswordItems {

    private boolean success;

    public ChangePasswordItems(){}

    public ChangePasswordItems(boolean success){
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
