package com.fierte.entity.entity.products.gemsettings;

import java.util.List;

public class ResponseGemSetting {

    private boolean success;
    private String message;
    private Integer total;
    private List<GemSettingList> data;

    public ResponseGemSetting() {
    }

    public ResponseGemSetting(boolean success, String message, Integer total, List<GemSettingList> data) {
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

    public List<GemSettingList> getData() {
        return data;
    }

    public void setData(List<GemSettingList> data) {
        this.data = data;
    }
}
