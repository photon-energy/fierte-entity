package com.fierte.entity.entity.payments.paymeuz.json.result;

public class GetStatementResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private GetStatementItems result;

    public GetStatementResult(){}

    public GetStatementResult(String jsonrpc, Integer id, GetStatementItems result){
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

    public GetStatementItems getResult() {
        return result;
    }

    public void setResult(GetStatementItems result) {
        this.result = result;
    }
}
