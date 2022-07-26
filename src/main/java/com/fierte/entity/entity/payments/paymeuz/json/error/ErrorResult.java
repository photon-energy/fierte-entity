package com.fierte.entity.entity.payments.paymeuz.json.error;

public class ErrorResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private Error error;

    public ErrorResult(){}

    public ErrorResult(String jsonrpc, Integer id, Error error){
        this.jsonrpc = jsonrpc;
        this.id = id;
        this.error = error;
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

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
