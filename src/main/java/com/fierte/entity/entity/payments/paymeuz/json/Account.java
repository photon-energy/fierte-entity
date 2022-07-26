package com.fierte.entity.entity.payments.paymeuz.json;

public class Account {

    private String order;
    private String phone;

    public Account(){}

    public Account(String order, String phone){
        this.order = order;
        this.phone = phone;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
