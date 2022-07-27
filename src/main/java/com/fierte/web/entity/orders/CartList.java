package com.fierte.web.entity.orders;

import com.fierte.web.entity.products.products.StoreSingleProduct;
import lombok.Data;
import lombok.RequiredArgsConstructor;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CartList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private UUID cart_id;

    private UUID product_items_id;
    private StoreSingleProduct product_items;
    private UUID user_id;
    private Integer price;
    private Integer quantity;
    private String created_time;

}
