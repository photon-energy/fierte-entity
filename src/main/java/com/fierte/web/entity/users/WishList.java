package com.fierte.web.entity.users;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wish_id")
    private UUID wish_id;

    private UUID user_id;
    private UUID product_id;
    private UUID product_items_id;
    private String created_time;


}
