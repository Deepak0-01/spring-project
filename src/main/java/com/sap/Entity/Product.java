package com.sap.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int pid;
    private String name;
    private int cost;
    private int qty;

    public Product(){


    }

    public Product(int pid, String name, int cost, int qty) {
        this.pid = pid;
        this.name = name;
        this.cost = cost;
        this.qty = qty;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
