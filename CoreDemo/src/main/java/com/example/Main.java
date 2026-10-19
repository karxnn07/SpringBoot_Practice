package com.example;

import com.example.Notification.EmailService;
import com.example.Notification.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            NotificationService notification = new EmailService();
            //OrderService order = new OrderService(notification);
            OrderService order = new OrderService();
            order.setNotification(notification);
            order.placeOrder();

    }
}