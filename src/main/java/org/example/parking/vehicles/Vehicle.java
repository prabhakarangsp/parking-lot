package org.example.parking.vehicles;

import org.example.parking.price.ParkingRate;

public abstract class Vehicle
{
    ParkingRate ratePerHour;
    public String registrationNumber = "";
    VehicleType vehicleType;

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }


    public ParkingRate getRatePerHour()
    {
        return ratePerHour;
    }

    public void setRatePerHour(ParkingRate ratePerHour)
    {
        this.ratePerHour = ratePerHour;
    }

    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }
}
