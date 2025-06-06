package com.example.payment_gateway_poc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payment_gateway_poc.model.Payment;


@Repository
public interface PaymentRepo  extends JpaRepository<Payment , String>{
    
    List<Payment> findAllByOrderByCreatedAtDesc();
    Payment findByMerchentOrderId(String merchentOrderId);
}
