package com.fierte.web.entity.warehouse;

public class Row {

    private Integer row_number;
    private Integer status;
    private Integer bin_count;

    public Row(){}

    public Row(Integer row_number, Integer status, Integer bin_count){
        this.row_number = row_number;
        this.status = status;
        this.bin_count = bin_count;
    }

    public Integer getRow_number() {
        return row_number;
    }

    public void setRow_number(Integer row_number) {
        this.row_number = row_number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBin_count() {
        return bin_count;
    }

    public void setBin_count(Integer bin_count) {
        this.bin_count = bin_count;
    }
}
