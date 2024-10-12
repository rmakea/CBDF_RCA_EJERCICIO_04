package com.upiiz.orders.models;

import java.util.Date;

public class Orders {
    private Long id;
    private String order_date;
    private int customer_id;
    private float total;

    public Orders(Long id, String order_date, int customer_id, float total) {
        this.id = id;
        this.order_date = order_date;
        this.customer_id = customer_id;
        this.total = total;
    }

    public Orders() {
    }

    public Long getid() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_Date() {
        return order_date;
    }

    public void setOrder_Date(String order_date) {
        this.order_date = order_date;
    }

    public int getCustomer_Id() {
        return customer_id;
    }

    public void setCustomer_Id(int customer_id) {
        this.customer_id = customer_id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
