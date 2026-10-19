package com.example.Notification;

public class EmailService implements NotificationService {

    @Override
    public void sendNotification() {
        // actual notification sent
        System.out.println("Email notification sent");
    }
}