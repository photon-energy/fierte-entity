package com.fierte.entity.entity.orders.websocket;

import java.util.Map;

public class ResponseOrderWebSocketMessage {

    private boolean success;
    private String message;
    private String data_type;
    private Map user;
    private ResponseSales sales;

    public ResponseOrderWebSocketMessage(){}

    public ResponseOrderWebSocketMessage(boolean success, String message, String data_type, Map user, ResponseSales sales) {
        this.success = success;
        this.message = message;
        this.data_type = data_type;
        this.user = user;
        this.sales = sales;
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

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public Map getUser() {
        return user;
    }

    public void setUser(Map user) {
        this.user = user;
    }

    public ResponseSales getSales() {
        return sales;
    }

    public void setSales(ResponseSales sales) {
        this.sales = sales;
    }
}
