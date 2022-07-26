package com.fierte.entity.entity.payments.clickuz;

public class PrepareResponse {

    private Integer click_trans_id;
    private String merchant_trans_id;
    private Integer merchant_prepare_id;
    private Integer error;
    private String error_note;

    public PrepareResponse(){}

    public PrepareResponse(Integer click_trans_id, String merchant_trans_id, Integer merchant_prepare_id, Integer error, String error_note){
        this.click_trans_id = click_trans_id;
        this.merchant_trans_id = merchant_trans_id;
        this.merchant_prepare_id = merchant_prepare_id;
        this.error = error;
        this.error_note = error_note;
    }

    public Integer getClick_trans_id() {
        return click_trans_id;
    }

    public void setClick_trans_id(Integer click_trans_id) {
        this.click_trans_id = click_trans_id;
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
}
