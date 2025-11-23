package org.example.parking.spot;

import org.example.parking.price.ParkingRate;
import org.example.parking.price.VehicleParkingRate;

public enum VehicleSpotType
{
    CAR("Car", SpotType.CAR), TRUCK("Truck", SpotType.TRUCK), BIKE("Bike", SpotType.BIKE);

    private String vehicleType;
    private SpotType spotType;

    VehicleSpotType(String vehicleType, SpotType spotType)
    {
        setVehicleType(vehicleType);
        setSpotType(spotType);
    }

    public static SpotType getSpotTypeForVehicle(String vehicleType)
    {

        for (VehicleSpotType spot : VehicleSpotType.values())
        {
            if (spot.getVehicleType().equals(vehicleType))
            {
                return spot.getSpotType();
            }
        }

        return SpotType.NONE;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public SpotType getSpotType()
    {
        return spotType;
    }

    public void setSpotType(SpotType spotType)
    {
        this.spotType = spotType;
    }
}
