package org.example.parking.spot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingFloor
{
    private String name;
    private Map<SpotType, ArrayList<ParkingSpot>> spots;
    private static ParkingFloor instance;

    public ParkingFloor(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Map<SpotType, ArrayList<ParkingSpot>> getSpots()
    {
        return spots;
    }

    public void setSpots(
            Map<SpotType, ArrayList<ParkingSpot>> spots)
    {
        this.spots = spots;
    }

    public void addSpots(SpotType spotType, List<ParkingSpot> spots)
    {
        ArrayList<ParkingSpot> existingList = Optional.ofNullable(this.spots.get(spotType)).orElse(
                new ArrayList<ParkingSpot>());
        existingList.addAll(spots);
        this.spots.put(spotType, existingList);
    }
}
