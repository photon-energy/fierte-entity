package com.fierte.web.entity.payments.paymeuz.json.response;

import com.fierte.web.entity.payments.paymeuz.json.error.ErrorResult;
import com.fierte.web.entity.payments.paymeuz.json.result.CheckTransactionResult;

public class CheckTransactionResponse {

    private ErrorResult error;
    private CheckTransactionResult result;

    public CheckTransactionResponse(){}

    public CheckTransactionResponse(ErrorResult error, CheckTransactionResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public CheckTransactionResult getResult() {
        return result;
    }

    public void setResult(CheckTransactionResult result) {
        this.result = result;
    }
}
