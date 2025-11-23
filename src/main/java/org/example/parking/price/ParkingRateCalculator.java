package org.example.parking.price;

import org.example.parking.Ticket;

public class ParkingRateCalculator
{
    static ParkingRateCalculator instance;

    private ParkingRateCalculator()
    {
    }

    public static ParkingRateCalculator getInstance()
    {
        if (instance == null)
        {
            instance = new ParkingRateCalculator();
        }
        return instance;
    }

    public double calculateRate(Ticket ticket)
    {
        return ticket.getParkingRate() * ticket.getNoOfHoursParked();
    }
}
