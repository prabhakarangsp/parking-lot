package org.example.parking;

import org.example.parking.payment.Payment;
import org.example.parking.payment.PaymentStatus;
import org.example.parking.price.ParkingRateCalculator;
import org.example.parking.spot.ParkingSpot;
import org.example.parking.vehicles.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket
{
    private Vehicle vehicle;
    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private PaymentStatus paymentStatus;
    private Double parkingRate;
    private ParkingRateCalculator rateCalculator;
    private long noOfHoursParked;
    private ParkingSpot parkingSpot;
    private Payment payment;

    public Ticket(Vehicle vehicle)
    {
        this.setVehicle(vehicle);
        this.setInTime(LocalDateTime.now());
        this.setOutTime(null);
        this.setPaymentStatus(PaymentStatus.NONE);
        this.setParkingRate(getVehicle().getRatePerHour().getRate());
        this.setNoOfHoursParked(0);
        this.setRateCalculator(ParkingRateCalculator.getInstance());
    }

    /*
     * This method checks the validity of the ticket.
     * */
    public boolean validateTicket()
    {
        return this.paymentStatus != PaymentStatus.COMPLETED;
    }

    /*
     * This method calculates the fare t be paid based on the number of hours.
     *  */
    public double calculateRate()
    {
        this.setOutTime(LocalDateTime.now());
        this.setNoOfHoursParked(Duration.between(this.getInTime(), this.getOutTime()).toHours());
        return getRateCalculator().calculateRate(this);
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public LocalDateTime getInTime()
    {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime)
    {
        this.inTime = inTime;
    }

    public LocalDateTime getOutTime()
    {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime)
    {
        this.outTime = outTime;
    }

    public PaymentStatus getPaymentStatus()
    {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus)
    {
        this.paymentStatus = paymentStatus;
    }

    public Double getParkingRate()
    {
        return parkingRate;
    }

    public void setParkingRate(Double parkingRate)
    {
        this.parkingRate = parkingRate;
    }

    public ParkingRateCalculator getRateCalculator()
    {
        return rateCalculator;
    }

    public void setRateCalculator(ParkingRateCalculator rateCalculator)
    {
        this.rateCalculator = rateCalculator;
    }

    public long getNoOfHoursParked()
    {
        return noOfHoursParked;
    }

    public void setNoOfHoursParked(long noOfHoursParked)
    {
        this.noOfHoursParked = noOfHoursParked;
    }

    public ParkingSpot getParkingSpot()
    {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot)
    {
        this.parkingSpot = parkingSpot;
    }

    public Payment getPayment()
    {
        return payment;
    }

    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }
}
