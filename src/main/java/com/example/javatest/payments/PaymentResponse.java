package com.example.javatest.payments;

public class PaymentResponse {
    public PaymentStatus status;

    enum PaymentStatus {
        OK,ERROR

    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
