package com.fierte.entity.entity.payments.paymeuz.json.response;

import com.fierte.entity.entity.payments.paymeuz.json.error.ErrorResult;
import com.fierte.entity.entity.payments.paymeuz.json.result.CreateTransactionResult;

public class CreateTransactionResponse {

    private ErrorResult error;
    private CreateTransactionResult result;

    public CreateTransactionResponse(){}

    public CreateTransactionResponse(ErrorResult error, CreateTransactionResult result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public CreateTransactionResult getResult() {
        return result;
    }

    public void setResult(CreateTransactionResult result) {
        this.result = result;
    }
}
