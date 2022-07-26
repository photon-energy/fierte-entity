package com.fierte.web.entity.products.products.brand;

import java.util.List;

public class ResponseBrand {

    private boolean success;
    private String message;
    private Integer total;
    private List<Brand> data;

    public ResponseBrand(){}

    public ResponseBrand(boolean success, String message, Integer total, List<Brand> data){
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

    public List<Brand> getData() {
        return data;
    }

    public void setData(List<Brand> data) {
        this.data = data;
    }
}
