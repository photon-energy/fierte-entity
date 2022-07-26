package com.fierte.web.entity.products.products.banner;

public class BannerList {

    private Long banner_id;
    private String banner_title;
    private String description;
    private String[] photo;
    private Integer status;
    private String created_time;

    public BannerList(){}

    public BannerList(Long banner_id, String banner_title, String description, String[] photo, Integer status, String created_time) {
        this.banner_id = banner_id;
        this.banner_title = banner_title;
        this.description = description;
        this.photo = photo;
        this.status = status;
        this.created_time = created_time;
    }

    public Long getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Long banner_id) {
        this.banner_id = banner_id;
    }

    public String getBanner_title() {
        return banner_title;
    }

    public void setBanner_title(String banner_title) {
        this.banner_title = banner_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPhoto() {
        return photo;
    }

    public void setPhoto(String[] photo) {
        this.photo = photo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
