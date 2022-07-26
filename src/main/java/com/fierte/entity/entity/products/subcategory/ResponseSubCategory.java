package com.fierte.entity.entity.products.subcategory;

import java.util.List;

public class ResponseSubCategory {

    private boolean success;
    private String message;
    private Integer total;
    private List<SubCategoryList> data;

    public ResponseSubCategory(){}

    public ResponseSubCategory(boolean success, String message, Integer total, List<SubCategoryList> data){
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

    public List<SubCategoryList> getData() {
        return data;
    }

    public void setData(List<SubCategoryList> data) {
        this.data = data;
    }

}
