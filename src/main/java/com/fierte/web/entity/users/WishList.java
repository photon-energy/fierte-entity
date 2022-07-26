package com.fierte.web.entity.users;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
public class WishList {

    private Long wish_id;
    private Long user_id;
    private Long product_id;
    private Long product_items_id;
    private String created_time;


}
