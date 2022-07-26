package com.fierte.entity.entity.orders;


import com.fierte.entity.entity.users.UsersList;

public class Orders {

    private Long order_id;
    private String order_number;
    private Long user_id;
    private UsersList user_data;
    private CartList[] carts;
    private Integer amount;
    private Integer state;
    private String payment;
    private Long transaction_id;
    private Integer delivery;
    private DeliveryAddress delivery_address;
    private String delivery_option;
    private Integer delivery_price;
    private String delivery_time;
    private String created_time;

    public Orders(){}

    public Orders(Long order_id, String order_number, Long user_id, UsersList user_data, CartList[] carts, Integer amount, Integer state, String payment, Long transaction_id, Integer delivery,
                  DeliveryAddress delivery_address, String delivery_option, Integer delivery_price, String delivery_time, String created_time) {
        this.order_id = order_id;
        this.order_number = order_number;
        this.user_id = user_id;
        this.user_data = user_data;
        this.carts = carts;
        this.amount = amount;
        this.state = state;
        this.payment = payment;
        this.transaction_id = transaction_id;
        this.delivery = delivery;
        this.delivery_address = delivery_address;
        this.delivery_option = delivery_option;
        this.delivery_price = delivery_price;
        this.delivery_time = delivery_time;
        this.created_time = created_time;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public UsersList getUser_data() {
        return user_data;
    }

    public void setUser_data(UsersList user_data) {
        this.user_data = user_data;
    }

    public CartList[] getCarts() {
        return carts;
    }

    public void setCarts(CartList[] carts) {
        this.carts = carts;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
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

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
