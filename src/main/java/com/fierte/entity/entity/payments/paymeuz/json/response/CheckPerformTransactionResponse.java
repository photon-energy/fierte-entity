package com.fierte.entity.entity.payments.paymeuz.json.response;

import com.fierte.entity.entity.payments.paymeuz.json.result.CheckPerformTransactionResult;
import com.fierte.entity.entity.payments.paymeuz.json.error.ErrorResult;

public class CheckPerformTransactionResponse {

    private ErrorResult error;
    private CheckPerformTransactionResult result;

    public CheckPerformTransactionResponse(){}

    public CheckPerformTransactionResponse(ErrorResult error, CheckPerformTransactionResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public CheckPerformTransactionResult getResult() {
        return result;
    }

    public void setResult(CheckPerformTransactionResult result) {
        this.result = result;
    }
}
