package com.fierte.entity.entity.payments.paymeuz.json.response;

import com.fierte.entity.entity.payments.paymeuz.json.result.PerformTransactionResult;
import com.fierte.entity.entity.payments.paymeuz.json.error.ErrorResult;

public class PerformTransactionResponse {

    private ErrorResult error;
    private PerformTransactionResult result;

    public PerformTransactionResponse(){}

    public PerformTransactionResponse(ErrorResult error, PerformTransactionResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public PerformTransactionResult getResult() {
        return result;
    }

    public void setResult(PerformTransactionResult result) {
        this.result = result;
    }
}
