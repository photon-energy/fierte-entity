package com.fierte.entity.entity.payments.paymeuz.json.request;

import com.fierte.entity.entity.payments.paymeuz.json.Account;

public class Params {

    private String id;
    private Integer amount;
    private Account account;
    private Long time;
    private Integer reason;
    private String password;
    private Long from;
    private Long to;

    public Params(){}

    public Params(String id, Integer amount, Account account, Long time, Integer reason, String password,
                  Long from, Long to){
        this.id = id;
        this.amount = amount;
        this.account = account;
        this.time = time;
        this.reason = reason;
        this.password = password;
        this.from = from;
        this.to = to;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }
}
