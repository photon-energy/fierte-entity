package com.fierte.entity.entity.products.category;

import java.util.List;

public class ResponseCategory {

    private boolean success;
    private String message;
    private Integer total;
    private List<CategoryList> data;

    public ResponseCategory(){}

    public ResponseCategory(boolean success, String message, Integer total, List<CategoryList> data){
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

    public List<CategoryList> getData() {
        return data;
    }

    public void setData(List<CategoryList> data) {
        this.data = data;
    }
}
