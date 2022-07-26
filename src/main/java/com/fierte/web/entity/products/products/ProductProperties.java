package com.fierte.web.entity.products.products;

public class ProductProperties {

    private Long color_id;
    private Long composition_id;
    private Long gemsetting_id;
    private Long gender_id;
    private Double weight;
    private Double[] length;
    private Double width;
    private Double height;
    private AdditionalValues[] additional_values;

    public ProductProperties() {
    }

    public ProductProperties(Long color_id, Long composition_id, Long gemsetting_id, Long gender_id, Double weight,
                             Double[] length, Double width, Double height, AdditionalValues[] additional_values) {
        this.color_id = color_id;
        this.composition_id = composition_id;
        this.gemsetting_id = gemsetting_id;
        this.gender_id = gender_id;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.additional_values = additional_values;
    }

    public Long getColor_id() {
        return color_id;
    }

    public void setColor_id(Long color_id) {
        this.color_id = color_id;
    }

    public Long getComposition_id() {
        return composition_id;
    }

    public void setComposition_id(Long composition_id) {
        this.composition_id = composition_id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getGemsetting_id() {
        return gemsetting_id;
    }

    public void setGemsetting_id(Long gemsetting_id) {
        this.gemsetting_id = gemsetting_id;
    }

    public Double[] getLength() {
        return length;
    }

    public void setLength(Double[] length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Long getGender_id() {
        return gender_id;
    }

    public void setGender_id(Long gender_id) {
        this.gender_id = gender_id;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public AdditionalValues[] getAdditional_values() {
        return additional_values;
    }

    public void setAdditional_values(AdditionalValues[] additional_values) {
        this.additional_values = additional_values;
    }
}
