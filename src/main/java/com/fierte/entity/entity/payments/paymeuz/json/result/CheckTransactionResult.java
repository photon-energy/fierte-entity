package com.fierte.entity.entity.payments.paymeuz.json.result;

public class CheckTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CheckTransactionItems result;

    public CheckTransactionResult(){}

    public CheckTransactionResult(String jsonrpc, Integer id, CheckTransactionItems result){
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

    public CheckTransactionItems getResult() {
        return result;
    }

    public void setResult(CheckTransactionItems result) {
        this.result = result;
    }
}
