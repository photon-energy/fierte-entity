package com.fierte.web.entity.payments.paymeuz.json.response;

import com.fierte.web.entity.payments.paymeuz.json.error.ErrorResult;
import com.fierte.web.entity.payments.paymeuz.json.result.CancelTransactionResult;

public class CancelTransactionResponse {

    private ErrorResult error;
    private CancelTransactionResult result;

    public CancelTransactionResponse(){}

    public CancelTransactionResponse(ErrorResult error, CancelTransactionResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public CancelTransactionResult getResult() {
        return result;
    }

    public void setResult(CancelTransactionResult result) {
        this.result = result;
    }
}
