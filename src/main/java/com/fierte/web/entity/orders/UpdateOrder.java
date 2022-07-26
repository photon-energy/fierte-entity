package com.fierte.web.entity.orders;

public class UpdateOrder {

    private Long order_id;
    private Integer state;
    private String payment;
    private Integer delivery;
    private Integer cancelled;

    public UpdateOrder(){}

    public UpdateOrder(Long order_id, Long user_id, Integer state, String payment, Integer delivery, Integer cancelled) {
        this.order_id = order_id;
        this.state = state;
        this.payment = payment;
        this.delivery = delivery;
        this.cancelled = cancelled;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
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

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
}
