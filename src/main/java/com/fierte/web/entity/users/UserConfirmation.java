package com.fierte.web.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserConfirmation {

    private Long confirmation_id;
    private String phone;
    private String code;
    private String expire_time;
    private String created_time;


}
