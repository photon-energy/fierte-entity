package com.fierte.entity.entity.users;

import java.util.List;

public class ResponseUsers {

    private boolean success;
    private String message;
    private Integer total;
    private List<UsersList> data;

    public ResponseUsers(){}

    public ResponseUsers(boolean success, String message, Integer total, List<UsersList> data){
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

    public List<UsersList> getData() {
        return data;
    }

    public void setData(List<UsersList> data) {
        this.data = data;
    }
}
