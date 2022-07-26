package com.fierte.entity.entity.payments.clickuz;

public class CompleteRequest {

    private Integer click_trans_id;
    private Integer service_id;
    private Integer click_paydoc_id;
    private String merchant_trans_id;
    private Integer merchant_prepare_id;
    private Float amount;
    private Integer action;
    private Integer error;
    private String error_note;
    private String sign_time;
    private String sign_string;

    public CompleteRequest(){}

    public CompleteRequest(Integer click_trans_id, Integer service_id, Integer click_paydoc_id, String merchant_trans_id, Integer merchant_prepare_id,
                           Float amount, Integer action,
                          Integer error, String error_note, String sign_time, String sign_string){
        this.click_trans_id = click_trans_id;
        this.service_id = service_id;
        this.click_paydoc_id = click_paydoc_id;
        this.merchant_trans_id = merchant_trans_id;
        this.merchant_prepare_id = merchant_prepare_id;
        this.amount = amount;
        this.action = action;
        this.error = error;
        this.error_note = error_note;
        this.sign_time = sign_time;
        this.sign_string = sign_string;
    }

    public Integer getClick_trans_id() {
        return click_trans_id;
    }

    public void setClick_trans_id(Integer click_trans_id) {
        this.click_trans_id = click_trans_id;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Integer getClick_paydoc_id() {
        return click_paydoc_id;
    }

    public void setClick_paydoc_id(Integer click_paydoc_id) {
        this.click_paydoc_id = click_paydoc_id;
    }

    public String getMerchant_trans_id() {
        return merchant_trans_id;
    }

    public void setMerchant_trans_id(String merchant_trans_id) {
        this.merchant_trans_id = merchant_trans_id;
    }

    public Integer getMerchant_prepare_id() {
        return merchant_prepare_id;
    }

    public void setMerchant_prepare_id(Integer merchant_prepare_id) {
        this.merchant_prepare_id = merchant_prepare_id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getError_note() {
        return error_note;
    }

    public void setError_note(String error_note) {
        this.error_note = error_note;
    }

    public String getSign_time() {
        return sign_time;
    }

    public void setSign_time(String sign_time) {
        this.sign_time = sign_time;
    }

    public String getSign_string() {
        return sign_string;
    }

    public void setSign_string(String sign_string) {
        this.sign_string = sign_string;
    }
}
