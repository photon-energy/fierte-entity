package com.fierte.web.entity.users;

import com.fierte.web.entity.auth.Token;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
public class UsersList {

    private UUID user_id;
    private String first_name;
    private String last_name;
    private String username;
    private String phone;
    private Integer status;
    private Integer gender;
    private String email;
    private String region;
    private String address;
    private Token token;
    private String created_time;



}
