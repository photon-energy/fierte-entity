package com.fierte.entity.entity.products.supplier;

import java.util.List;

public class ResponseSupplier {

    private boolean success;
    private String message;
    private Integer total;
    private List<Supplier> data;

    public ResponseSupplier(){}

    public ResponseSupplier(boolean success, String message, Integer total, List<Supplier> data){
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

    public List<Supplier> getData() {
        return data;
    }

    public void setData(List<Supplier> data) {
        this.data = data;
    }

}
