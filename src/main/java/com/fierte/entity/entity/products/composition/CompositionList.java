package com.fierte.entity.entity.products.composition;

import io.swagger.v3.oas.annotations.media.Schema;

public class CompositionList {

    private Long composition_id;
    private String composition_name;
    private Integer status;
    private String created_time;

    public CompositionList(){}

    public CompositionList(Long composition_id, String composition_name, Integer status, String created_time){
        this.composition_id = composition_id;
        this.composition_name = composition_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getComposition_id() {
        return composition_id;
    }

    @Schema(hidden = true)
    public void setComposition_id(Long composition_id) {
        this.composition_id = composition_id;
    }

    public String getComposition_name() {
        return composition_name;
    }

    public void setComposition_name(String composition_name) {
        this.composition_name = composition_name;
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
