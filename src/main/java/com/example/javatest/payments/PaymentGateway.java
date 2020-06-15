package com.example.javatest.payments;

public interface PaymentGateway
{
   public PaymentResponse requestPayment(PaymentRequest request);

}
