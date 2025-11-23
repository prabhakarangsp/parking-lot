package org.example.parking.payment;

import org.example.parking.Ticket;

public class PaymentProcessor
{
    Payment paymentMethod;

    public PaymentProcessor(Payment paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public boolean processPaymentForTicket(Ticket ticket)
    {
        PaymentStatus currentStatus = ticket.getPaymentStatus();
        if (currentStatus != null && currentStatus != PaymentStatus.NONE)
        {
            currentStatus = this.paymentMethod.processPayment(ticket.calculateRate());
            return currentStatus == PaymentStatus.COMPLETED;
        }

        return false;
    }
}
