package org.example.parking.vehicles;

import org.example.parking.price.ParkingRate;

public class Bike
        extends Vehicle
{
    public Bike()
    {
        super.setRatePerHour(ParkingRate.BIKE);
        super.setVehicleType(VehicleType.BIKE);
    }
}
