package com.example.Payment;

public class UpiPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("paying via UPI");
    }
}
