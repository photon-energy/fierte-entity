package com.fierte.web.entity.warehouse;

public class WarehouseList {

    private Long warehouse_id;
    private String warehouse_name;
    private String address;
    private String phone;
    private Integer block_count;
    private Integer row_count;
    private Integer bin_count;
    private Integer status;

    public WarehouseList(){}

    public WarehouseList(Long warehouse_id, String warehouse_name, String address, String phone, Integer block_count, Integer row_count, Integer bin_count, Integer status){
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.address = address;
        this.phone = phone;
        this.block_count = block_count;
        this.row_count = row_count;
        this.bin_count = bin_count;
        this.status = status;
    }

    public Long getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Long warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getBlock_count() {
        return block_count;
    }

    public void setBlock_count(Integer block_count) {
        this.block_count = block_count;
    }

    public Integer getRow_count() {
        return row_count;
    }

    public void setRow_count(Integer row_count) {
        this.row_count = row_count;
    }

    public Integer getBin_count() {
        return bin_count;
    }

    public void setBin_count(Integer bin_count) {
        this.bin_count = bin_count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
