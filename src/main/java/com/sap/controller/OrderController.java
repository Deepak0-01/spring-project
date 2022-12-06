package com.sap.controller;

import com.sap.Entity.Customer;
import com.sap.dto.OrderRequest;
import com.sap.dto.OrderResponse;
import com.sap.repository.CustomerRepository;
import com.sap.repository.ProductRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerrepo;

    @Autowired
    private ProductRepository productrepo;

    @PostMapping("/newcustomer")

    public Customer saveNewCustomer(@RequestBody OrderRequest request){

       return customerrepo.save(request.getCustomer());


    }

    @GetMapping("/allcustomers")

    public List<Customer> getAllCustomers(){

        return customerrepo.findAll();
    }

    @GetMapping("/joininfo")

    public List<OrderResponse> getCustomerProducts(){

        return customerrepo.getJoinInfo();
    }
}
