package com.fierte.web.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DeliveryAddress {

    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String postal_code;
    private String phone;
    private String email;


}
