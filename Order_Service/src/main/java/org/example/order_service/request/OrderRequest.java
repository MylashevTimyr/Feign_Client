package org.example.order_service.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long id;
    private String productName;
    private int quantity;
    private String userEmail;
    private String status;
}
