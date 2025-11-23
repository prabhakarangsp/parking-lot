package org.example.parking.price;

public enum VehicleParkingRate
{
    CAR("Car", ParkingRate.CAR), TRUCK("Truck", ParkingRate.TRUCK), BIKE("Bike", ParkingRate.BIKE);

    private String vehicleType;
    private ParkingRate parkingRate;

    VehicleParkingRate(String bike, ParkingRate parkingRate)
    {
        setVehicleType(bike);
        setParkingRate(parkingRate);
    }

    public static ParkingRate getParkingRateForVehicle(String vehicleType)
    {

        for (VehicleParkingRate rate : VehicleParkingRate.values())
        {
            if (rate.getVehicleType().equals(vehicleType))
            {
                return rate.getParkingRate();
            }
        }

        return ParkingRate.NONE;
    }


    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public ParkingRate getParkingRate()
    {
        return parkingRate;
    }

    public void setParkingRate(ParkingRate parkingRate)
    {
        this.parkingRate = parkingRate;
    }
}
