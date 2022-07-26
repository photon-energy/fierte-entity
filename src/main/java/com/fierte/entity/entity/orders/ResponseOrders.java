package com.fierte.entity.entity.orders;

import java.util.List;

public class ResponseOrders {

    private boolean success;
    private String message;
    private Integer total;
    private List<Orders> data;

    public ResponseOrders(){}

    public ResponseOrders(boolean success, String message, Integer total, List<Orders> data) {
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

    public List<Orders> getData() {
        return data;
    }

    public void setData(List<Orders> data) {
        this.data = data;
    }
}
