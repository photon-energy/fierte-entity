package com.fierte.entity.entity.payments.paymeuz.json.result;

public class CancelTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CancelTransactionItems result;

    public CancelTransactionResult(){}

    public CancelTransactionResult(String jsonrpc, Integer id, CancelTransactionItems result){
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

    public CancelTransactionItems getResult() {
        return result;
    }

    public void setResult(CancelTransactionItems result) {
        this.result = result;
    }
}
