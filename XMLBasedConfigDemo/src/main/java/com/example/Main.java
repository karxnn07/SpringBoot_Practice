package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//        Get bean by id/name :-
//        OrderService orderService = (OrderService) context.getBean("orderService");

//        Get bean by type :-
//        OrderService orderService = context.getBean(OrderService.class);

//        Best method :-
        OrderService orderService = context.getBean("orderService", OrderService.class);

//        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);

//        paymentService.pay();
        orderService.placeOrder();

        UserService userService = context.getBean(UserService.class);
    }
}