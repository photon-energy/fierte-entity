package com.fierte.web.entity.orders;

public class CreateOrder {

    private Long user_id;
    private String payment_type;
    private DeliveryAddress delivery_address;
    private String delivery_option;
    private Integer delivery_price;

    public CreateOrder(){}

    public CreateOrder(Long user_id, String payment_type, DeliveryAddress delivery_address, String delivery_option, Integer delivery_price) {
        this.user_id = user_id;
        this.payment_type = payment_type;
        this.delivery_address = delivery_address;
        this.delivery_option = delivery_option;
        this.delivery_price = delivery_price;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public DeliveryAddress getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(DeliveryAddress delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getDelivery_option() {
        return delivery_option;
    }

    public void setDelivery_option(String delivery_option) {
        this.delivery_option = delivery_option;
    }

    public Integer getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(Integer delivery_price) {
        this.delivery_price = delivery_price;
    }
}
