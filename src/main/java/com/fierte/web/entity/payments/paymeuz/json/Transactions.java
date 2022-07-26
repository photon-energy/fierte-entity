package com.fierte.web.entity.payments.paymeuz.json;

import com.fierte.web.entity.payments.paymeuz.json.result.GetStatementResult;

import java.util.List;

public class Transactions {

    private List<GetStatementResult> transactions;

    public Transactions(){}

    public Transactions(List<GetStatementResult> transactions){
        this.transactions = transactions;
    }

    public List<GetStatementResult> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<GetStatementResult> transactions) {
        this.transactions = transactions;
    }
}
