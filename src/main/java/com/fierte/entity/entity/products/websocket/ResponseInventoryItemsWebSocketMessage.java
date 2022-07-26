package com.fierte.entity.entity.products.websocket;

import java.util.Map;

public class ResponseInventoryItemsWebSocketMessage {

    private boolean success;
    private String message;
    private String data_type;
    private Map user;
    private ResponseInventoryItems inventory_item;

    public ResponseInventoryItemsWebSocketMessage(){}

    public ResponseInventoryItemsWebSocketMessage(boolean success, String message, String data_type,
                                                Map user, ResponseInventoryItems inventory_item){
        this.success = success;
        this.message = message;
        this.data_type = data_type;
        this.user = user;
        this.inventory_item = inventory_item;
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

    public ResponseInventoryItems getInventory_item() {
        return inventory_item;
    }

    public void setInventory_item(ResponseInventoryItems inventory_item) {
        this.inventory_item = inventory_item;
    }
}
