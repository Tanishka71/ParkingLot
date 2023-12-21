package models;

import java.util.ArrayList;

public abstract class Vehicle
{
      protected ArrayList<ParkingLot> ParkingLots =
                           new ArrayList<ParkingLot>();
      protected String licensePlate;
      protected int spotsNeeded;
      protected VehicleSize size;
 
      public int getSpotsNeeded()
      {
          return spotsNeeded;
      }
      public VehicleSize getSize()
      {
          return size;
      }
 
      /* Park vehicle in this spot (among others,
         potentially) */
      public void parkinSpot(ParkingLot s)
      {
          ParkingLots.add(s);
      }
 
 
      /* Remove vehicle from spot, and notify spot
         that it's gone */
      public void clearSpots(ParkingLot s) { 
    	  ParkingLots.remove(s);
      }
 
      /* Checks if the spot is big enough for the
         vehicle (and is available).
         This * compares the SIZE only.It does not
        check if it has enough spots. */
      public abstract boolean canFitinSpot(ParkingLot spot);
}
 