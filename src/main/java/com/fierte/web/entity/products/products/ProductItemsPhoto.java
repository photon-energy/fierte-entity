package com.fierte.web.entity.products.products;

public class ProductItemsPhoto {

    private Long product_items_photo_id;
    private Long product_items_id;
    private String photo;

    public ProductItemsPhoto(){}

    public ProductItemsPhoto(Long product_items_photo_id, Long product_items_id, String photo){
        this.product_items_photo_id = product_items_photo_id;
        this.product_items_id = product_items_id;
        this.photo = photo;
    }

    public Long getProduct_items_photo_id() {
        return product_items_photo_id;
    }

    public void setProduct_items_photo_id(Long product_items_photo_id) {
        this.product_items_photo_id = product_items_photo_id;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
