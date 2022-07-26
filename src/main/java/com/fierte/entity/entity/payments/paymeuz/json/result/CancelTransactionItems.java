package com.fierte.entity.entity.payments.paymeuz.json.result;

public class CancelTransactionItems {

    private String transaction;
    private Long cancel_time;
    private Integer state;

    public CancelTransactionItems(){}

    public CancelTransactionItems(String transaction, Long cancel_time, Integer state){
        this.transaction = transaction;
        this.cancel_time = cancel_time;
        this.state = state;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Long getCancel_time() {
        return cancel_time;
    }

    public void setCancel_time(Long cancel_time) {
        this.cancel_time = cancel_time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
