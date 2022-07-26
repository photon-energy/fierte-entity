package com.fierte.entity.entity.users;

import io.swagger.v3.oas.annotations.media.Schema;

public class UserConfirmation {

    private Long confirmation_id;
    private String phone;
    private String code;
    private String expire_time;
    private String created_time;

    public UserConfirmation(){}

    public UserConfirmation(Long confirmation_id, String phone, String code, String expire_time, String created_time){
        this.confirmation_id = confirmation_id;
        this.phone = phone;
        this.code = code;
        this.expire_time = expire_time;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getConfirmation_id() {
        return confirmation_id;
    }

    @Schema(hidden = true)
    public void setConfirmation_id(Long confirmation_id) {
        this.confirmation_id = confirmation_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Schema(hidden = true)
    public String getCode() {
        return code;
    }

    @Schema(hidden = true)
    public void setCode(String code) {
        this.code = code;
    }

    @Schema(hidden = true)
    public String getExpire_time() {
        return expire_time;
    }

    @Schema(hidden = true)
    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    @Schema(hidden = true)
    public String getCreated_time() {
        return created_time;
    }

    @Schema(hidden = true)
    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
