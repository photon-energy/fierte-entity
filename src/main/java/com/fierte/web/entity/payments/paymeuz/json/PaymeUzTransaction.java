package com.fierte.web.entity.payments.paymeuz.json;

import java.sql.Timestamp;


public class PaymeUzTransaction {

    private Long paymeuz_transaction_id;
    private String paycomId;
    private Timestamp paycomTime;
    private Timestamp createTime;
    private Timestamp performTime;
    private Timestamp cancelTime;
    private Integer reason;
    private Integer state;
    private String order;
    private Integer amount;
    private String phone;


    public PaymeUzTransaction(){}

    public PaymeUzTransaction(Long paymeuz_transaction_id, String paycomId, Timestamp paycomTime, Timestamp createTime, Timestamp performTime, Timestamp cancelTime, Integer reason,
                              Integer state, String order, Integer amount, String phone){
        this.paymeuz_transaction_id = paymeuz_transaction_id;
        this.paycomId = paycomId;
        this.paycomTime = paycomTime;
        this.createTime = createTime;
        this.performTime = performTime;
        this.cancelTime = cancelTime;
        this.reason = reason;
        this.state = state;
        this.order = order;
        this.amount = amount;
        this.phone = phone;
    }

    public Long getPaymeuz_transaction_id() {
        return paymeuz_transaction_id;
    }

    public void setPaymeuz_transaction_id(Long paymeuz_transaction_id) {
        this.paymeuz_transaction_id = paymeuz_transaction_id;
    }

    public String getPaycomId() {
        return paycomId;
    }

    public void setPaycomId(String paycomId) {
        this.paycomId = paycomId;
    }

    public Timestamp getPaycomTime() {
        return paycomTime;
    }

    public void setPaycomTime(Timestamp paycomTime) {
        this.paycomTime = paycomTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getPerformTime() {
        return performTime;
    }

    public void setPerformTime(Timestamp performTime) {
        this.performTime = performTime;
    }

    public Timestamp getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Timestamp cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
