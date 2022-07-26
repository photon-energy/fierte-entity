package com.fierte.entity.entity.products.tags;

import java.util.List;

public class ResponseTags {

    private boolean success;
    private String message;
    private Integer total;
    private List<Tags> data;

    public ResponseTags(){}

    public ResponseTags(boolean success, String message, Integer total, List<Tags> data){
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

    public List<Tags> getData() {
        return data;
    }

    public void setData(List<Tags> data) {
        this.data = data;
    }
}
