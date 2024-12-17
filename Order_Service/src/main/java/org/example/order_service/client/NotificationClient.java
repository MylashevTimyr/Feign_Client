package org.example.order_service.client;

import org.example.order_service.config.NotificationClientFallback;
import org.example.order_service_api.request.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "notification-service",
            url = "http://localhost:8081",
            fallback = NotificationClientFallback.class)
public interface NotificationClient {

    @PostMapping("/notifications")
    void sendNotification(NotificationRequest request);
}
