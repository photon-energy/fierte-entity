package com.fierte.entity.entity.payments.paymeuz.json.result;

public class CreateTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CreateTransactionItems result;

    public CreateTransactionResult(){}

    public CreateTransactionResult(String jsonrpc, Integer id, CreateTransactionItems result){
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

    public CreateTransactionItems getResult() {
        return result;
    }

    public void setResult(CreateTransactionItems result) {
        this.result = result;
    }
}
