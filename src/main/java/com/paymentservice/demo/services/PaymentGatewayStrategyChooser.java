package com.paymentservice.demo.services;

import com.paymentservice.demo.services.paymentgateway.PaymentGateway;
import com.paymentservice.demo.services.paymentgateway.RazorPayGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategyChooser {
    private RazorPayGateway razorPayGateway;
    @Autowired
    public PaymentGatewayStrategyChooser(RazorPayGateway razorPayGateway){
        this.razorPayGateway = razorPayGateway;
    }

    public PaymentGateway getBestPaymentGateway(){
        return razorPayGateway;
    }

}
