package com.paymentservice.demo.services;

import com.paymentservice.demo.services.paymentgateway.PaymentGateway;
import com.paymentservice.demo.services.paymentgateway.RazorPayGateway;
import com.paymentservice.demo.services.paymentgateway.StripePaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategyChooser {
    private RazorPayGateway razorPayGateway;
    private StripePaymentGateway stripePaymentGateway;
    @Autowired
    public PaymentGatewayStrategyChooser(RazorPayGateway razorPayGateway, StripePaymentGateway stripePaymentGateway){
        this.razorPayGateway = razorPayGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway(){
//        return razorPayGateway;
        return stripePaymentGateway;
    }

}
