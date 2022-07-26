package com.fierte.entity.entity.payments.paymeuz.json.response;

import com.fierte.entity.entity.payments.paymeuz.json.error.ErrorResult;

public class AuthResponse {

    private ErrorResult error;

    public AuthResponse(){}

    public AuthResponse(ErrorResult error){
        this.error = error;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

}
