package com.fierte.web.entity.payments.paymeuz.json.result;

public class PerformTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private PerformTransactionItems result;

    public PerformTransactionResult(){}

    public PerformTransactionResult(String jsonrpc, Integer id, PerformTransactionItems result){
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

    public PerformTransactionItems getResult() {
        return result;
    }

    public void setResult(PerformTransactionItems result) {
        this.result = result;
    }
}
