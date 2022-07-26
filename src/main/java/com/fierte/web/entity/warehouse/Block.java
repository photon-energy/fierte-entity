package com.fierte.web.entity.warehouse;

public class Block {

    private String block_name;
    private Integer status;
    private Row[] row;

    public Block(){}

    public Block(String block_name, Integer status, Row[] row){
        this.block_name = block_name;
        this.status = status;
        this.row = row;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Row[] getRow() {
        return row;
    }

    public void setRow(Row[] row) {
        this.row = row;
    }
}
