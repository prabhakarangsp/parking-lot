package org.example.parking.vehicles;

import org.example.parking.price.ParkingRate;

public class Car
        extends Vehicle
{
    public Car()
    {
        super.setRatePerHour(ParkingRate.CAR);
        super.setVehicleType(VehicleType.CAR);
    }
}
