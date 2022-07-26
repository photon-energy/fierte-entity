package com.fierte.entity.entity.warehouse;

import java.util.List;

public class ResponseWarehouse {

    private boolean success;
    private String message;
    private Integer total;
    private List<WarehouseList> data;

    public ResponseWarehouse(){}

    public ResponseWarehouse(boolean success, String message, Integer total, List<WarehouseList> data){
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

    public List<WarehouseList> getData() {
        return data;
    }

    public void setData(List<WarehouseList> data) {
        this.data = data;
    }
}
