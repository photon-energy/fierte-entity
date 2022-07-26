package com.fierte.entity.entity.products.tags;

import io.swagger.v3.oas.annotations.media.Schema;

public class Tags {

    private Long tag_id;
    private String[] tag_name;
    private Long subcategory_id;
    private String subcategory_name;
    private Integer status;
    private String created_time;

    public Tags(){}

    public Tags(Long tag_id, String[] tag_name, Long subcategory_id, String subcategory_name, Integer status, String created_time){
        this.tag_id = tag_id;
        this.tag_name = tag_name;
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getTag_id() {
        return tag_id;
    }

    @Schema(hidden = true)
    public void setTag_id(Long tag_id) {
        this.tag_id = tag_id;
    }

    public String[] getTag_name() {
        return tag_name;
    }

    public void setTag_name(String[] tag_name) {
        this.tag_name = tag_name;
    }

    public Long getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(Long subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
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
