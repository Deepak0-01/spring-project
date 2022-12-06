package com.sap.dto;

import com.sap.Entity.Customer;

public class OrderRequest {

    private Customer customer;

    public OrderRequest(){};

    public OrderRequest(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
