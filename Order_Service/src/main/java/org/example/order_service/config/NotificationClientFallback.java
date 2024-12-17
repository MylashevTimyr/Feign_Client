package org.example.order_service.config;

import org.example.order_service.client.NotificationClient;
import org.example.order_service_api.request.NotificationRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class NotificationClientFallback implements NotificationClient {

    @Override
    public void sendNotification(NotificationRequest request) {
        System.out.println("[" + LocalDateTime.now() + "] Notification service unavailable. Failed to send notification for: " + request);
    }
}
