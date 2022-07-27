package com.fierte.web.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UpdateOrder {

    private Long order_id;
    private Integer state;
    private String payment;
    private Integer delivery;
    private Integer cancelled;


}
