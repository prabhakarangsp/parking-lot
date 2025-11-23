package org.example.parking.price;

public enum ParkingRate
{
    CAR(50),
    BIKE(20),
    TRUCK(100),
    NONE(10);

    private double rate;

    ParkingRate(double rate)
    {
        this.rate = rate;
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }
}
