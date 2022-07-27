package com.fierte.web.entity.users;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@Entity(name = "user_confirmation")
public class UserConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "confirmation_id")
    private UUID confirmation_id;
    private String phone;
    private String code;
    private String expire_time;
    private String created_time;


}
