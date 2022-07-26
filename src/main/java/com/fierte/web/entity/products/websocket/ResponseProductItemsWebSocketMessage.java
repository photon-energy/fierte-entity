package com.fierte.web.entity.products.websocket;

import java.util.Map;

public class ResponseProductItemsWebSocketMessage {

    private boolean success;
    private String message;
    private String data_type;
    private Map user;
    private ResponseProductItems product_item;

    public ResponseProductItemsWebSocketMessage(){}

    public ResponseProductItemsWebSocketMessage(boolean success, String message, String data_type,
                                                 Map user, ResponseProductItems product_item){
        this.success = success;
        this.message = message;
        this.data_type = data_type;
        this.user = user;
        this.product_item = product_item;
    }

    public boolean getSuccess() {
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

    public ResponseProductItems getProduct_item() {
        return product_item;
    }

    public void setProduct_item(ResponseProductItems product_item) {
        this.product_item = product_item;
    }
}
