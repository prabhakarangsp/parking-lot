package org.example.parking.payment;

public class CardPayment
        implements Payment
{
    @Override
    public PaymentStatus processPayment(double amount)
    {
        System.out.printf("Initiated card payment of %d amount from customer through card.", amount);
        return PaymentStatus.COMPLETED;
    }
}
