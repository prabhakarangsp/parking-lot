package org.example.parking.spot;

import org.example.parking.vehicles.VehicleType;

public enum SpotType
{
    BIKE("Bike Spot"),
    CAR("Car Spot"),
    TRUCK("Truck Spot"),
    NONE("None");

    private String type;

    SpotType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public static SpotType fromVehicleType(VehicleType vehicleType)
    {
        return switch (vehicleType)
        {
            case CAR -> CAR;
            case BIKE -> BIKE;
            case TRUCK -> TRUCK;
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        };
    }

    public boolean fitsVehicleType(VehicleType vehicleType)
    {
        return switch (this)
        {
            case CAR -> vehicleType == VehicleType.CAR;
            case BIKE -> vehicleType == VehicleType.BIKE;
            case TRUCK -> vehicleType == VehicleType.TRUCK;
            default -> false;
        };
    }
}
