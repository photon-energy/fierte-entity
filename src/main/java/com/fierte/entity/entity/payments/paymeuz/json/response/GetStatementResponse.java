package com.fierte.entity.entity.payments.paymeuz.json.response;

import com.fierte.entity.entity.payments.paymeuz.json.error.ErrorResult;
import com.fierte.entity.entity.payments.paymeuz.json.result.GetStatementResult;

import java.util.List;

public class GetStatementResponse {

    private ErrorResult error;
    private List<GetStatementResult> result;

    public GetStatementResponse(){}

    public GetStatementResponse(ErrorResult error, List<GetStatementResult> result){
        this.error = error;
        this.result = result;
    }

    public ErrorResult getError() {
        return error;
    }

    public void setError(ErrorResult error) {
        this.error = error;
    }

    public List<GetStatementResult> getResult() {
        return result;
    }

    public void setResult(List<GetStatementResult> result) {
        this.result = result;
    }
}
