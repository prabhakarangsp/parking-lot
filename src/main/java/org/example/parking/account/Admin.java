package org.example.parking.account;

import org.example.parking.spot.ParkingFloor;
import org.example.parking.spot.ParkingSpot;
import org.example.parking.spot.ParkingSpotFinder;
import org.example.parking.spot.SpotType;

import java.util.List;

public class Admin
        extends Person
{
    @Override
    public void resetPassword()
    {
        System.out.println("Sent email to the configured email address. " + super.email);
    }

    public void addFloors(ParkingFloor floor)
    {
    }

    public void addSpots(SpotType spotType, List<ParkingSpot> spots, ParkingFloor floor)
    {

    }
}
