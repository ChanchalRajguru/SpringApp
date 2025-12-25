package com.example.notification.manager;

import com.example.notification.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.send("Welcome to Spring");
    }
}
