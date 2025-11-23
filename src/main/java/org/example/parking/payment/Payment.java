package org.example.parking.payment;

public interface Payment
{
    public PaymentStatus status = PaymentStatus.NONE;

    public PaymentStatus processPayment(double amount);
}
