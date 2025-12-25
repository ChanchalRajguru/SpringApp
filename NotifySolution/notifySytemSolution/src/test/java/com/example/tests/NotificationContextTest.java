package com.example.tests;

import com.example.notification.config.AppConfig;
import com.example.notification.manager.NotificationManager;
import com.example.notification.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationContextTest {

    @Test
    void contextLoads_andBeansAreCreated(){
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationManager manager = context.getBean(NotificationManager.class);

        NotificationService service = context.getBean(NotificationService.class);

        assertNotNull(manager);
        assertNotNull(service);

        context.close();
    }
}
