package com.fierte.web.entity.payments.paymeuz.json.response;

import com.fierte.web.entity.payments.paymeuz.json.error.ErrorResult;
import com.fierte.web.entity.payments.paymeuz.json.result.ChangePasswordResult;

public class ChangePasswordResponse {

    private ErrorResult error;
    private ChangePasswordResult result;

    public ChangePasswordResponse(){}

    public ChangePasswordResponse(ErrorResult error, ChangePasswordResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public ChangePasswordResult getResult() {
        return result;
    }

    public void setResult(ChangePasswordResult result) {
        this.result = result;
    }
}
