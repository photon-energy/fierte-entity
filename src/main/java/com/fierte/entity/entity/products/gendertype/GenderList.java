package com.fierte.entity.entity.products.gendertype;

import io.swagger.v3.oas.annotations.media.Schema;

public class GenderList {

    private Long gender_id;
    private String gender_name;
    private Integer status;
    private String created_time;

    public GenderList(){}

    public GenderList(Long gender_id, String gender_name, Integer status, String created_time) {
        this.gender_id = gender_id;
        this.gender_name = gender_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getGender_id() {
        return gender_id;
    }

    @Schema(hidden = true)
    public void setGender_id(Long gender_id) {
        this.gender_id = gender_id;
    }

    public String getGender_name() {
        return gender_name;
    }

    public void setGender_name(String gender_name) {
        this.gender_name = gender_name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
