package org.example.parking.spot;

public class ParkingSpot
{
    private final String id;
    private final SpotType type;
    private boolean occupied;

    public ParkingSpot(String id, SpotType type)
    {
        this.id = id;
        this.type = type;
    }

    public String getId()
    {
        return id;
    }

    public SpotType getType()
    {
        return type;
    }

    public boolean isOccupied()
    {
        return occupied;
    }

    public void occupy()
    {
        this.occupied = true;
    }

    public void free()
    {
        this.occupied = false;
    }

    public boolean fitsVehicle(org.example.parking.vehicles.Vehicle vehicle)
    {
        return type.fitsVehicleType(vehicle.getVehicleType()) && !occupied;
    }
}