package com.fierte.web.entity.products.products.banner;

import java.util.List;

public class ResponseBanner {

    private boolean success;
    private String message;
    private Integer total;
    private List<BannerList> data;

    public ResponseBanner(){}

    public ResponseBanner(boolean success, String message, Integer total, List<BannerList> data){
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

    public List<BannerList> getData() {
        return data;
    }

    public void setData(List<BannerList> data) {
        this.data = data;
    }
}
