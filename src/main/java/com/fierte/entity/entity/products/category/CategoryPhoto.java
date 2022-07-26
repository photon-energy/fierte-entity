package com.fierte.entity.entity.products.category;

public class CategoryPhoto {

    private Long category_photo_id;
    private Long category_id;
    private String photo;

    public CategoryPhoto(){}

    public CategoryPhoto(Long category_photo_id, Long category_id, String photo) {
        this.category_photo_id = category_photo_id;
        this.category_id = category_id;
        this.photo = photo;
    }

    public Long getCategory_photo_id() {
        return category_photo_id;
    }

    public void setCategory_photo_id(Long category_photo_id) {
        this.category_photo_id = category_photo_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
