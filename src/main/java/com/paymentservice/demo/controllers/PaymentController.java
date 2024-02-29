package com.paymentservice.demo.controllers;

import com.paymentservice.demo.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping
    public String initiatePayment(){
        return paymentService.initiatePayment();
    }

}
