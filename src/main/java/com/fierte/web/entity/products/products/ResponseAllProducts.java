package com.fierte.web.entity.products.products;


import java.util.List;

public class ResponseAllProducts {

    private boolean success;
    private String message;
    private Integer total;
    private List<StoreProducts> data;

    public ResponseAllProducts(){}

    public ResponseAllProducts(boolean success, String message, Integer total, List<StoreProducts> data) {
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

    public List<StoreProducts> getData() {
        return data;
    }

    public void setData(List<StoreProducts> data) {
        this.data = data;
    }
}
