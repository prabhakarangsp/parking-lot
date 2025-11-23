package org.example.parking.vehicles;

public enum VehicleType
{
    CAR("Car"),
    TRUCK("Truck"),
    BIKE("Bike");

    private String typeName;

    VehicleType(String typeName)
    {
        this.typeName = typeName;
    }

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }
}
