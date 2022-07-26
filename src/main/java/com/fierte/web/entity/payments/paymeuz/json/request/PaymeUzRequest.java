package com.fierte.web.entity.payments.paymeuz.json.request;

public class PaymeUzRequest {

    private Integer id;
    private String method;
    private Params params;

    public PaymeUzRequest(){}

    public PaymeUzRequest(Integer id, String method, Params params){
        this.id = id;
        this.method = method;
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}
