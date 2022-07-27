package com.fierte.web.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID user_id;

    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String phone;
    private Integer status;
    private Integer gender;
    private String email;
    private String region;
    private String address;
    private String created_time;



}
