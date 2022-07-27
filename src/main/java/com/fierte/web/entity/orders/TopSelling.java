package com.fierte.web.entity.orders;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
@Entity
public class TopSelling {

    private Long top_selling_id;
    private Long product_items_id;
    private Integer quantity;

}
