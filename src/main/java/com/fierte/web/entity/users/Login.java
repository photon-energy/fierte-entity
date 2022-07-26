package com.fierte.web.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Login {

    private String phone;
    private String password;

}
