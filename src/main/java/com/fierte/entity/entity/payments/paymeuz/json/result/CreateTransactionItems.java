package com.fierte.entity.entity.payments.paymeuz.json.result;

public class CreateTransactionItems {

    private Long create_time;
    private String transaction;
    private Integer state;

    public CreateTransactionItems(){}

    public CreateTransactionItems(Long create_time, String transaction, Integer state){
        this.create_time = create_time;
        this.transaction = transaction;
        this.state = state;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
