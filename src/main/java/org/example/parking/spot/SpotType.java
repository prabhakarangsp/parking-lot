package org.example.parking.spot;

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
}
