package com.fierte.web.entity.orders;


import com.fierte.web.entity.users.UsersList;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;


@Data
@RequiredArgsConstructor
@Entity
public class Orders {

    private Long order_id;
    private String order_number;
    private Long user_id;
    private UsersList user_data;
    private CartList[] carts;
    private Integer amount;
    private Integer state;
    private String payment;
    private Long transaction_id;
    private Integer delivery;
    private DeliveryAddress delivery_address;
    private String delivery_option;
    private Integer delivery_price;
    private String delivery_time;
    private String created_time;


}
