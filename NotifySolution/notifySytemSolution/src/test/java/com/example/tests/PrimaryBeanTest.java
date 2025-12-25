package com.example.tests;


import com.example.notification.config.AppConfig;
import com.example.notification.service.EmailNotificationService;
import com.example.notification.service.NotificationService;
import com.example.notification.service.SmsNotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class PrimaryBeanTest {

    @Test
    void primaryBeanIsInjected() {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationService service = context.getBean(NotificationService.class);

        assertTrue(service instanceof SmsNotificationService);
        context.close();
    }


}
