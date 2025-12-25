package com.example.notification;


import com.example.notification.config.AppConfig;
import com.example.notification.manager.NotificationManager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringNotificationApplication {
    static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationManager manager = context.getBean(NotificationManager.class);
        manager.notifyUser();
        context.close();
    }
}
