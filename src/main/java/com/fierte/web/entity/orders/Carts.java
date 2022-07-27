package com.fierte.web.entity.orders;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
@Entity
public class Carts {

    private Long cart_id;
    private Long product_id;
    private Long product_items_id;
    private Long user_id;
    private Integer price;
    private Integer quantity;
    private String created_time;


}
