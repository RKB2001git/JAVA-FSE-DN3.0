package com.example.adapters; 

import com.example.PaymentProcessor;
import com.example.gateways.PayPalGateway;

public class PayPalAdapter implements PaymentProcessor {
     private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        this.payPalGateway = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
}

