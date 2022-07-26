package com.fierte.web.entity.warehouse;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Warehouse {

    private Long warehouse_id;
    private String warehouse_name;
    private String address;
    private Location location;
    private String phone;
    private Block[] block;
    private Integer status;
    private String created_time;


}
