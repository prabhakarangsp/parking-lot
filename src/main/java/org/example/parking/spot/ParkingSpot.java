package org.example.parking.spot;

public abstract class ParkingSpot
{
    public SpotType spot = SpotType.NONE;
    public boolean isFree = Boolean.TRUE;
    public int floorNo = 0;
    public String spotNo = null;
}
