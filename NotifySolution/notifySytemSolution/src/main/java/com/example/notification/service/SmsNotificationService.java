package com.example.notification.service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("smsService")
public class SmsNotificationService implements NotificationService{

    @PostConstruct
    public void init(){
        System.out.println("SmsNotificationService initialized!");
    }

    @Override
    public void send(String msg){
        System.out.println("SMS sent = " + msg);
    }
}
