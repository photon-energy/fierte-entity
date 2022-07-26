package com.fierte.web.entity.products.websocket;

import java.util.Map;

public class ResponseInventoryParentWebSocketMessage {

    private boolean success;
    private String message;
    private String data_type;
    private Map user;
    private ResponseInventoryParent inventory_parent;

    public ResponseInventoryParentWebSocketMessage(){}

    public ResponseInventoryParentWebSocketMessage(boolean success, String message, String data_type,
                                                 Map user, ResponseInventoryParent inventory_parent){
        this.success = success;
        this.message = message;
        this.data_type = data_type;
        this.user = user;
        this.inventory_parent = inventory_parent;
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

    public ResponseInventoryParent getInventory_parent() {
        return inventory_parent;
    }

    public void setInventory_parent(ResponseInventoryParent inventory_parent) {
        this.inventory_parent = inventory_parent;
    }
}
