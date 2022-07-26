package com.fierte.entity.entity.products.websocket;

import java.util.Map;

public class ResponseProductParentWebSocketMessage {

    private boolean success;
    private String message;
    private String data_type;
    private Map user;
    private ResponseProductParent product_parent;

    public ResponseProductParentWebSocketMessage(){}

    public ResponseProductParentWebSocketMessage(boolean success, String message, String data_type,
                                                 Map user, ResponseProductParent product_parent){
        this.success = success;
        this.message = message;
        this.data_type = data_type;
        this.user = user;
        this.product_parent = product_parent;
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

    public ResponseProductParent getProduct_parent() {
        return product_parent;
    }

    public void setProduct_parent(ResponseProductParent product_parent) {
        this.product_parent = product_parent;
    }

}
