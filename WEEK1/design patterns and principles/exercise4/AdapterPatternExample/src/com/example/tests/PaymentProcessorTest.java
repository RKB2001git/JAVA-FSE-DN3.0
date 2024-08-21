package com.example.tests;

import com.example.PaymentProcessor;
import com.example.adapters.PayPalAdapter;
import com.example.adapters.StripeAdapter;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        payPalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(200.0);
    }
}

