package org.example.parking;

import org.example.parking.payment.PaymentProcessor;
import org.example.parking.payment.PaymentStatus;

public class Exit
{
    PaymentProcessor paymentProcessor;

    public boolean validateTicket(Ticket ticket)
            throws Exception
    {
        if (!ticket.validateTicket())
        {
            throw new Exception("Unable to validate ticket..");
        }

        return Boolean.TRUE;
    }

    public PaymentStatus processPayment(Ticket ticket)
    {
        if (ticket.getPayment() != null)
        {
            return ticket.getPayment().processPayment(ticket.calculateRate());
        }

        return PaymentStatus.FAILED;
    }
}
