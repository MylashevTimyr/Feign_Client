package org.example.notification_service.controller;

import org.example.order_service_api.request.NotificationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest notificationResult) {
        System.out.println("Notification send: " + notificationResult);
        return ResponseEntity.ok("Notification send successfully!");
    }
}
