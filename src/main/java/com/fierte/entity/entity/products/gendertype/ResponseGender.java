package com.fierte.entity.entity.products.gendertype;

import java.util.List;

public class ResponseGender {

    private boolean success;
    private String message;
    private Integer total;
    private List<GenderList> data;

    public ResponseGender(){}

    public ResponseGender(boolean success, String message, Integer total, List<GenderList> data){
        this.success = success;
        this.message = message;
        this.total = total;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<GenderList> getData() {
        return data;
    }

    public void setData(List<GenderList> data) {
        this.data = data;
    }
}
