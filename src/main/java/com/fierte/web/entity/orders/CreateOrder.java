package com.fierte.web.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateOrder {

    private Long user_id;
    private String payment_type;
    private DeliveryAddress delivery_address;
    private String delivery_option;
    private Integer delivery_price;


}
