package org.example.order_service_api.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NotificationRequest {
    private Long orderId;
    private String productName;
    private String userEmail;
}
