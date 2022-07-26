package com.fierte.web.entity.dashboard;

import com.fierte.web.entity.products.products.ProductItems;

public class TopSellingItems {

    private Long product_items_id;
    private ProductItems product_items;
    private String product_name;
    private Integer sell_amount;

    public TopSellingItems(){}

    public TopSellingItems(Long product_items_id, ProductItems product_items, String product_name, Integer sell_amount) {
        this.product_items_id = product_items_id;
        this.product_items = product_items;
        this.product_name = product_name;
        this.sell_amount = sell_amount;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public ProductItems getProduct_items() {
        return product_items;
    }

    public void setProduct_items(ProductItems product_items) {
        this.product_items = product_items;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getSell_amount() {
        return sell_amount;
    }

    public void setSell_amount(Integer sell_amount) {
        this.sell_amount = sell_amount;
    }
}
