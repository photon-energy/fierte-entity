package com.fierte.entity.entity.products.gemsettings;

import io.swagger.v3.oas.annotations.media.Schema;

public class GemSettingList {

    private Long gemsetting_id;
    private String gemsetting_name;
    private Integer status;
    private String created_time;

    public GemSettingList(Long gemsetting_id, String gemsetting_name, Integer status, String created_time) {
        this.gemsetting_id = gemsetting_id;
        this.gemsetting_name = gemsetting_name;
        this.status = status;
        this.created_time = created_time;
    }

    public GemSettingList() {
    }


    @Schema(hidden = true)
    public Long getGemsetting_id() {
        return gemsetting_id;
    }

    @Schema(hidden = true)
    public void setGemsetting_id(Long gemsetting_id) {
        this.gemsetting_id = gemsetting_id;
    }

    public String getGemsetting_name() {
        return gemsetting_name;
    }

    public void setGemsetting_name(String gemsetting_name) {
        this.gemsetting_name = gemsetting_name;
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
