package com.fierte.web.entity.payments.paymeuz.json.result;

public class CheckPerformTransactionItems {

    private boolean allow = false;

    public CheckPerformTransactionItems(){}

    public CheckPerformTransactionItems(boolean allow){
        this.allow = allow;
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }
}
