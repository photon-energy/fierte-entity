package com.fierte.web.entity.payments.paymeuz.json.result;

public class CheckPerformTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CheckPerformTransactionItems result;

    public CheckPerformTransactionResult(){}

    public CheckPerformTransactionResult(String jsonrpc, Integer id, CheckPerformTransactionItems result){
        this.jsonrpc = jsonrpc;
        this.id = id;
        this.result = result;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CheckPerformTransactionItems getResult() {
        return result;
    }

    public void setResult(CheckPerformTransactionItems result) {
        this.result = result;
    }
}