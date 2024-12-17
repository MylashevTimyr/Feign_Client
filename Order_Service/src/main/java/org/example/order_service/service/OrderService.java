package org.example.order_service.service;

import lombok.RequiredArgsConstructor;
import org.example.order_service.client.NotificationClient;
import org.example.order_service.request.OrderRequest;
import org.example.order_service_api.request.NotificationRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final NotificationClient notificationClient;

    public void createOrder(OrderRequest orderRequest) {
        NotificationRequest notificationRequest = new NotificationRequest(
                orderRequest.getId(),
                orderRequest.getProductName(),
                orderRequest.getUserEmail()
        );

        try {
            notificationClient.sendNotification(notificationRequest);
        } catch (Exception e) {
            System.out.println("Failed to send notification: " + e.getMessage());
        }
    }
}
