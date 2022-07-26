package com.fierte.web.entity.products.websocket;

import com.fierte.web.entity.warehouse.WarehouseLocation;

public class WebSocketProductInfo {

    private Long product_id;
    private Long product_item_id;
    private WarehouseLocation warehouse_location;
    private Long supplier_id;
    private Integer quantity;
    private Integer purchase_price;

    public WebSocketProductInfo(){}

    public WebSocketProductInfo(Long product_id, Long product_item_id, WarehouseLocation warehouse_location, Long supplier_id, Integer quantity, Integer purchase_price){
        this.product_id = product_id;
        this.product_item_id = product_item_id;
        this.warehouse_location = warehouse_location;
        this.supplier_id = supplier_id;
        this.quantity = quantity;
        this.purchase_price = purchase_price;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getProduct_item_id() {
        return product_item_id;
    }

    public void setProduct_item_id(Long product_item_id) {
        this.product_item_id = product_item_id;
    }

    public WarehouseLocation getWarehouse_location() {
        return warehouse_location;
    }

    public void setWarehouse_location(WarehouseLocation warehouse_location) {
        this.warehouse_location = warehouse_location;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Integer purchase_price) {
        this.purchase_price = purchase_price;
    }
}
