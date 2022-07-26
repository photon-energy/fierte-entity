package com.fierte.web.entity.products.products.banner;

public class BannerPhoto {

    private Long banner_photo_id;
    private Long banner_id;
    private String photo;

    public BannerPhoto(){}

    public BannerPhoto(Long banner_photo_id, Long banner_id, String photo) {
        this.banner_photo_id = banner_photo_id;
        this.banner_id = banner_id;
        this.photo = photo;
    }

    public Long getBanner_photo_id() {
        return banner_photo_id;
    }

    public void setBanner_photo_id(Long banner_photo_id) {
        this.banner_photo_id = banner_photo_id;
    }

    public Long getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(Long banner_id) {
        this.banner_id = banner_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
