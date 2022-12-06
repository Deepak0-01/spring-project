package com.sap.repository;

import com.sap.Entity.Customer;
import com.sap.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

     @Query("SELECT new com.sap.dto.OrderResponse( c.name, p.name) FROM Customer c JOIN c.products p")
     public List<OrderResponse> getJoinInfo();
}
