package com.example.notification.service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class EmailNotificationService implements NotificationService{

    @PostConstruct
    public void init(){
        System.out.println("EmailNotificationService initialized!");
    }

    @Override
    public void send(String msg) {
        System.out.println("Email sent = " + msg);
    }
}
