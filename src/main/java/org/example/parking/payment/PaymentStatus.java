package org.example.parking.payment;

public enum PaymentStatus
{
    COMPLETED("Completed"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    PENDING("Pending"),
    NONE("None");

    private String status;

    PaymentStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
