package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class B {
    private OrderService orderService;

    public B (@Qualifier("getOrder") OrderService orderService) {
        this.orderService = orderService;
    }
}