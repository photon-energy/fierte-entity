package com.fierte.entity.entity.products.products;

public class ProductParent {

    private Long product_id;
    private String product_name;
    private Long category_id;
    private String category_name;
    private Long subcategory_id;
    private String subcategory_name;
    private Integer total_quantity;
    private Integer total_product_type;
    private Integer is_have_promotion;
    private Integer status;
    private boolean delete_status;
    private String updated_time;

    public ProductParent(){}

    public ProductParent(Long product_id, String product_name, Long category_id, String category_name, Long subcategory_id, String subcategory_name,
                         Integer total_quantity, Integer total_product_type, Integer is_have_promotion, Integer status, boolean delete_status, String updated_time){
        this.product_id = product_id;
        this.product_name = product_name;
        this.category_id = category_id;
        this.category_name = category_name;
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.total_quantity = total_quantity;
        this.total_product_type = total_product_type;
        this.is_have_promotion = is_have_promotion;
        this.status = status;
        this.delete_status = delete_status;
        this.updated_time = updated_time;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
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

    public Integer getTotal_quantity() {
        return total_quantity;
    }

    public void setTotal_quantity(Integer total_quantity) {
        this.total_quantity = total_quantity;
    }

    public Integer getTotal_product_type() {
        return total_product_type;
    }

    public void setTotal_product_type(Integer total_product_type) {
        this.total_product_type = total_product_type;
    }

    public Integer getIs_have_promotion() {
        return is_have_promotion;
    }

    public void setIs_have_promotion(Integer is_have_promotion) {
        this.is_have_promotion = is_have_promotion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(boolean delete_status) {
        this.delete_status = delete_status;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

}
