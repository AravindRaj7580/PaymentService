package com.paymentservice.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.events.Event;

@RestController
@RequestMapping("stripewebhook")
public class StripeWebHookController {
    @PostMapping
    public void webhook(Event event){
        if(event.equals("Failed")){
            //dB update
        }else if(event.equals("Created")){
            //dB Update
        }
        System.out.println("Received webhook call");
    }
}
