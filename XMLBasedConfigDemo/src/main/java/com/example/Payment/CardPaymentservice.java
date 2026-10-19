package com.example.Payment;

public class CardPaymentservice implements PaymentService{
    @Override
    public void pay() {
        System.out.println("paying via card");
    }
}
