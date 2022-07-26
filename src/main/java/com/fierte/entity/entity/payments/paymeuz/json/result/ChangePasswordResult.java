package com.fierte.entity.entity.payments.paymeuz.json.result;

public class ChangePasswordResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private ChangePasswordItems result;

    public ChangePasswordResult(){}

    public ChangePasswordResult(String jsonrpc, Integer id, ChangePasswordItems result){
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

    public ChangePasswordItems getResult() {
        return result;
    }

    public void setResult(ChangePasswordItems result) {
        this.result = result;
    }
}
