package com.fierte.entity.entity.products.color;

import java.util.List;

public class ResponseColor {

    private boolean success;
    private String message;
    private Integer total;
    private List<ColorList> data;

    public ResponseColor(){}

    public ResponseColor(boolean success, String message, Integer total, List<ColorList> data){
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

    public List<ColorList> getData() {
        return data;
    }

    public void setData(List<ColorList> data) {
        this.data = data;
    }
}
