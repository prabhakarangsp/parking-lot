package org.example.parking;

import org.example.parking.spot.ParkingSpot;
import org.example.parking.spot.ParkingSpotFinder;
import org.example.parking.vehicles.Vehicle;

import java.util.Optional;

public class Entrance
{
    ParkingSpotFinder parkingSpotFinder = ParkingSpotFinder.getInstance();

    public Ticket entryParking(Vehicle vehicle)
            throws Exception
    {
        Optional<ParkingSpot> availableSpot = parkingSpotFinder.findParkingSpot(vehicle.getVehicleType());

        if (availableSpot.isEmpty())
        {
            throw new Exception("No spots available for the vehicle type..");
        }

        //Mark the spot as assigned and assign the ticket with available parking spot.
        ParkingSpot spot = availableSpot.get();
        spot.isFree = Boolean.FALSE;
        Ticket ticket = new Ticket(vehicle);
        ticket.setParkingSpot(spot);

        return ticket;
    }
}
