package com.paymentservice.demo.services.paymentgateway;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RazorPayGateway implements PaymentGateway{
    @Override
    public String generateLink() {
try {
    RazorpayClient razorpay = new RazorpayClient("rzp_test_jWgSovSJYo95Gv", "vrITVB51tsCak04snFvANw8J");
    JSONObject paymentLinkRequest = new JSONObject();
    paymentLinkRequest.put("amount", 1000);
    paymentLinkRequest.put("currency", "INR");
    paymentLinkRequest.put("accept_partial", false);
    paymentLinkRequest.put("first_min_partial_amount", 100);
    paymentLinkRequest.put("expire_by", 1709345942);
    paymentLinkRequest.put("reference_id", "TS4366");
    paymentLinkRequest.put("description", "Payment for policy no #23456");
    JSONObject customer = new JSONObject();
    customer.put("name", "Aravindraj");
    customer.put("contact", "+919751066096");
    customer.put("email", "raravindraj7590@gmail.com");
    paymentLinkRequest.put("customer", customer);
    JSONObject notify = new JSONObject();
    notify.put("sms", true);
    notify.put("email", true);
    paymentLinkRequest.put("notify", notify);

    paymentLinkRequest.put("callback_url", "https://google.com/");
    paymentLinkRequest.put("callback_method", "get");

    PaymentLink payment = razorpay.paymentLink.create(paymentLinkRequest);
    return payment.toString();
}catch(Exception e){
    System.out.println(e);
}
        return null;
    }
}
