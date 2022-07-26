package com.fierte.web.entity.languages;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@RequiredArgsConstructor
public class Language {

    private Long language_id;
    private String language_icon;
    private String language_locale;
    private String language_text;
    private Integer status;
    private String created_time;


}
