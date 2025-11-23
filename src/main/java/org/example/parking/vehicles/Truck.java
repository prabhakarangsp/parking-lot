package org.example.parking.vehicles;

import org.example.parking.price.ParkingRate;

public class Truck
        extends Vehicle
{
    public Truck()
    {
        super.setRatePerHour(ParkingRate.TRUCK);
        super.setVehicleType(VehicleType.TRUCK);
    }
}
