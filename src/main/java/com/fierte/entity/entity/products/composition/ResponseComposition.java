package com.fierte.entity.entity.products.composition;

import java.util.List;

public class ResponseComposition {

    private boolean success;
    private String message;
    private Integer total;
    private List<CompositionList> data;

    public ResponseComposition(){}

    public ResponseComposition(boolean success, String message, Integer total, List<CompositionList> data){
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

    public List<CompositionList> getData() {
        return data;
    }

    public void setData(List<CompositionList> data) {
        this.data = data;
    }
}
