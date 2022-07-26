package com.fierte.entity.entity.reports;

public class InventoryReport {

    private Long inventory_report_id;
    private Long product_id;
    private Long product_items_id;
    private Integer purchase_price;
    private Long supplier_id;
    private String warehouse_location;
    private Integer quantity;
    private Integer approve_status;
    private String created_time;

    public InventoryReport(){}

    public InventoryReport(Long inventory_report_id, Long product_id, Long product_items_id, Integer purchase_price, Long supplier_id, String warehouse_location,
                           Integer quantity, Integer approve_status, String created_time){
        this.inventory_report_id = inventory_report_id;
        this.product_id = product_id;
        this.product_items_id = product_items_id;
        this.purchase_price = purchase_price;
        this.supplier_id = supplier_id;
        this.warehouse_location = warehouse_location;
        this.quantity = quantity;
        this.approve_status = approve_status;
        this.created_time = created_time;
    }

    public Long getInventory_report_id() {
        return inventory_report_id;
    }

    public void setInventory_report_id(Long inventory_report_id) {
        this.inventory_report_id = inventory_report_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getProduct_items_id() {
        return product_items_id;
    }

    public void setProduct_items_id(Long product_items_id) {
        this.product_items_id = product_items_id;
    }

    public Integer getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Integer purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getWarehouse_location() {
        return warehouse_location;
    }

    public void setWarehouse_location(String warehouse_location) {
        this.warehouse_location = warehouse_location;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getApprove_status() {
        return approve_status;
    }

    public void setApprove_status(Integer approve_status) {
        this.approve_status = approve_status;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
