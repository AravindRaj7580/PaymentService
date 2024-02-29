package com.paymentservice.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;
    @Autowired
    public PaymentService(PaymentGatewayStrategyChooser paymentGatewayStrategyChooser){
        this.paymentGatewayStrategyChooser = paymentGatewayStrategyChooser;

    }

    public String initiatePayment(){
        return paymentGatewayStrategyChooser
                .getBestPaymentGateway()
                .generateLink();
    }

}
