package com.fierte.entity.entity.warehouse;

import io.swagger.v3.oas.annotations.media.Schema;

public class Warehouse {

    private Long warehouse_id;
    private String warehouse_name;
    private String address;
    private Location location;
    private String phone;
    private Block[] block;
    private Integer status;
    private String created_time;

    public Warehouse(){}

    public Warehouse(Long warehouse_id, String warehouse_name, String address, Location location, String phone, Block[] block, Integer status, String created_time){
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.address = address;
        this.location = location;
        this.phone = phone;
        this.block = block;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getWarehouse_id() {
        return warehouse_id;
    }

    @Schema(hidden = true)
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Block[] getBlock() {
        return block;
    }

    public void setBlock(Block[] block) {
        this.block = block;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Schema(hidden = true)
    public String getCreated_time() {
        return created_time;
    }

    @Schema(hidden = true)
    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
