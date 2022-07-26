package com.fierte.entity.entity.products.supplier;

import io.swagger.v3.oas.annotations.media.Schema;

public class Supplier {

    private Long supplier_id;
    private String company_name;
    private String first_name;
    private String last_name;
    private String gender;
    private String phone;
    private String address;
    private String email;
    private String region;
    private String country;
    private String zipcode;
    private String notes;
    private Integer status;
    private String created_time;

    public Supplier() {}

    public Supplier(Long supplier_id, String company_name, String first_name, String last_name, String gender,
                    String phone, String address, String email, String region, String country, String zipcode, String notes, Integer status, String created_time) {
        this.supplier_id = supplier_id;
        this.company_name = company_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.region = region;
        this.country = country;
        this.zipcode = zipcode;
        this.notes = notes;
        this.status = status;
        this.created_time = created_time;
    }

    @Schema(hidden = true)
    public Long getSupplier_id() {
        return supplier_id;
    }

    @Schema(hidden = true)
    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
