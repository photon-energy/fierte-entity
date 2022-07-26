package com.fierte.web.entity.payments.paymeuz.json.result;

public class PerformTransactionItems {

    private String transaction;
    private Long perform_time;
    private Integer state;

    public PerformTransactionItems(){}

    public PerformTransactionItems(String transaction, Long perform_time, Integer state){
        this.transaction = transaction;
        this.perform_time = perform_time;
        this.state = state;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Long getPerform_time() {
        return perform_time;
    }

    public void setPerform_time(Long perform_time) {
        this.perform_time = perform_time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
