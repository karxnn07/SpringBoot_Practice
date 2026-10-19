package com.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A {
    private OrderService orderService;

    public A (@Qualifier("getOrder") OrderService orderService) {
        this.orderService = orderService;
    }
}
