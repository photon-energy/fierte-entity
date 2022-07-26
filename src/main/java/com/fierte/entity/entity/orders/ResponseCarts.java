package com.fierte.entity.entity.orders;

import java.util.List;

public class ResponseCarts {

    private boolean success;
    private String message;
    private Integer total;
    private List<CartList> data;
    private Integer total_price;

    public ResponseCarts(){}

    public ResponseCarts(boolean success, String message, Integer total, List<CartList> data, Integer total_price) {
        this.success = success;
        this.message = message;
        this.total = total;
        this.data = data;
        this.total_price = total_price;
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

    public List<CartList> getData() {
        return data;
    }

    public void setData(List<CartList> data) {
        this.data = data;
    }

    public Integer getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Integer total_price) {
        this.total_price = total_price;
    }
}
