package com.fierte.entity.entity.payments.paymeuz.json.result;

import com.fierte.entity.entity.payments.paymeuz.json.Account;

public class GetStatementItems {

    private Long id;
    private Long time;
    private Integer amount;
    private Account account;
    private Long create_time;
    private Long perform_time;
    private Long cancel_time;
    private String transaction;
    private Integer state;
    private Integer reason;

    public GetStatementItems(){}

    public GetStatementItems(Long id, Long time, Integer amount, Account account, Long create_time, Long perform_time,
                              Long cancel_time, String transaction, Integer state, Integer reason){
        this.id = id;
        this.time = time;
        this.amount = amount;
        this.account = account;
        this.create_time = create_time;
        this.perform_time = perform_time;
        this.cancel_time = cancel_time;
        this.transaction = transaction;
        this.state = state;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getPerform_time() {
        return perform_time;
    }

    public void setPerform_time(Long perform_time) {
        this.perform_time = perform_time;
    }

    public Long getCancel_time() {
        return cancel_time;
    }

    public void setCancel_time(Long cancel_time) {
        this.cancel_time = cancel_time;
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

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }
}
