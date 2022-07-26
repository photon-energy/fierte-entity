package com.fierte.web.entity.auth;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
public class UpdateUser {

    private UserCredentials[] credentials;


}
