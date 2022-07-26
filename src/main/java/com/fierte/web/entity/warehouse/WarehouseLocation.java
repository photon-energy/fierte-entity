package com.fierte.web.entity.warehouse;

public class WarehouseLocation {

    private Long warehouse_id;
    private Integer block_id;
    private Integer row_number;
    private Integer bin;

    public WarehouseLocation(){}

    public WarehouseLocation(Long warehouse_id, Integer block_id, Integer row_number, Integer bin){
        this.warehouse_id = warehouse_id;
        this.block_id = block_id;
        this.row_number = row_number;
        this.bin = bin;
    }

    public Long getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Long warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Integer getBlock_id() {
        return block_id;
    }

    public void setBlock_id(Integer block_id) {
        this.block_id = block_id;
    }

    public Integer getRow_number() {
        return row_number;
    }

    public void setRow_number(Integer row_number) {
        this.row_number = row_number;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }
}
