package org.example.parking.spot;

import org.example.parking.vehicles.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingSpotFinder
{
    static ParkingSpotFinder instance;

    private ParkingSpotFinder()
    {
    }

    public static ParkingSpotFinder getInstance()
    {

        if (instance == null)
        {
            instance = new ParkingSpotFinder();
        }
        return instance;
    }

    static ArrayList<ParkingFloor> floors = new ArrayList<>();


    /*
     * @param VehicleType as argument.
     * returns Optional of ParkingSpot
     * */
    public Optional<ParkingSpot> findParkingSpot(VehicleType vehicleType)
    {
        if (getFloors().isEmpty())
        {
            return Optional.empty();
        }

        for (ParkingFloor floor : getFloors())
        {
            List<ParkingSpot> spots = floor.getSpots().get(
                    SpotType.fromVehicleType(vehicleType));
            if (!spots.isEmpty())
            {
                return Optional.ofNullable(spots.get(0));
            }
        }
        return Optional.empty();
    }

    public static ArrayList<ParkingFloor> getFloors()
    {
        return floors;
    }

    public static void setFloors(ArrayList<ParkingFloor> floors)
    {
        ParkingSpotFinder.floors = floors;
    }
}
