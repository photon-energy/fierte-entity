package com.fierte.entity.entity.products.products.brand;

public class BrandPhoto {

    private Long brand_photo_id;
    private Long brand_id;
    private String photo;

    public BrandPhoto(){}

    public BrandPhoto(Long brand_photo_id, Long brand_id, String photo) {
        this.brand_photo_id = brand_photo_id;
        this.brand_id = brand_id;
        this.photo = photo;
    }

    public Long getBrand_photo_id() {
        return brand_photo_id;
    }

    public void setBrand_photo_id(Long brand_photo_id) {
        this.brand_photo_id = brand_photo_id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
