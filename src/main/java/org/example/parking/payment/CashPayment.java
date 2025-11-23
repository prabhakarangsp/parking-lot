package org.example.parking.payment;

public class CashPayment
        implements Payment
{
    @Override
    public PaymentStatus processPayment(double amount)
    {
        System.out.printf("Collected %d amount from customer through cash.%n", amount);

        return PaymentStatus.COMPLETED;
    }
}
