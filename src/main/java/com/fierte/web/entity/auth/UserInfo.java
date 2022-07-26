package com.fierte.web.entity.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserInfo {

    private String sub;
    private String[] roles;
    private String preferred_username;

}
