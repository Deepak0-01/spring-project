package com.sap.Entity;

import javax.persistence.*;
import java.util.List;
import com.sap.Entity.Product;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name="cus_fk", referencedColumnName = "id")
     private List<Product> products;

    public Customer(){};

    public Customer(int id, String name, String email, List<Product> products) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
