package com.fierte.entity.entity.users;

import io.swagger.v3.oas.annotations.media.Schema;

public class Users {

    private Long user_id;
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


    public Users() {
    }

    public Users(Long user_id, String first_name, String last_name, String username, String password, String phone,
                 String email, String region, String address, Integer status, Integer gender, String created_time) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.status = status;
        this.gender = gender;
        this.email = email;
        this.region = region;
        this.address = address;
        this.created_time = created_time;
    }


    @Schema(hidden = true)
    public Long getUser_id() {
        return user_id;
    }

    @Schema(hidden = true)
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Schema(hidden = true)
    public String getCreated_time() {
        return created_time;
    }

    @Schema(hidden = true)
    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
