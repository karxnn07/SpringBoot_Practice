package com.example;


import com.example.Payment.CardPayment;
import com.example.Payment.PaymentService;
import com.example.Payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Aditya", 28);
    }


    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment() {
        return new CardPayment();
    }

    @Bean
    @Qualifier("upi")
    public PaymentService createUpiPayment() {
        return new UpiPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("cp") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}