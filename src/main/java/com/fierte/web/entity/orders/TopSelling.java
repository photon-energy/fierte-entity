package com.fierte.web.entity.orders;

public class TopSelling {

    private Long top_selling_id;
    private Long product_items_id;
    private Integer quantity;

    public TopSelling(){}

    public TopSelling(Long top_selling_id, Long product_items_id, Integer quantity) {
        this.top_selling_id = top_selling_id;
        this.product_items_id = product_items_id;
        this.quantity = quantity;
    }

    public Long getTop_selling_id() {
        return top_selling_id;
    }

    public void setTop_selling_id(Long top_selling_id) {
        this.top_selling_id = top_selling_id;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
