package com.fierte.web.entity.payments.paymeuz.json.error;

public class Error {

    private Integer code;
    private String message;

    public  Error(){}

    public  Error(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
