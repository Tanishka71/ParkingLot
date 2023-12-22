package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingLot {
    static final int CAPACITY = 10;

    
    public List<Vehicle> parkedCars;
    static int numberOfCar=0;
    static int numberOfBike=7;
    
    /*
	 * @desc:constructor for the class ParkingLot
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
    public ParkingLot() {
        this.parkedCars = new ArrayList<>();
    }
    
    /*
   	 * @desc:check whether the parking lot is full or not
   	 * 
   	 * @params:none
   	 * 
   	 * @return:boolean
   	 */
    public boolean isFull() {
        return ParkingAttendant.slots.size() >= CAPACITY;
    }

    /*
   	 * @desc:park the car at a particular spot
   	 * 
   	 * @params:Vehicle object
   	 * 
   	 * @return:none
   	 */
    public void parkVehicle(Vehicle car) {
        if (!isFull()) {
        	if(car.getSize() == VehicleSize.Car) {
        		 numberOfCar++;
                 ParkingAttendant.allotSlotToTheCar(car,numberOfCar);  		
        	} 
        	else {
        		 numberOfBike++;
                 ParkingAttendant.allotSlotToTheCar(car,numberOfBike);    		
        	}
        } else {
            System.out.println("Parking lot is full. Cannot park car.");
        }
    }

    
    /*
   	 * @desc:unpark the car 
   	 * 
   	 * @params:Vehicle object
   	 * 
   	 * @return:none
   	 */
    public void unparkVehicle(Vehicle car) {
        if (ParkingAttendant.slots.size() != 0) {
        	if(car.getSize() == VehicleSize.Car) {
                ParkingAttendant.emptySlotForTheCar(car);  		
       	} 
       	else {
                ParkingAttendant.emptySlotForTheCar(car);    		
       	}
        } else {
            System.out.println("Car not found in the parking lot.");
        }
    }

    /*
	 * @desc:print how many parking spots are occupied 
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
    public void printOccupancy() {
        System.out.println("Occupancy: " +ParkingAttendant.slots.size()+ "/" + CAPACITY);
    }

    /*
     * @desc: notify all observers when the parking lot is full
     *
     * @params: none
     *
     * @return: none
     */
    public String notifyObservers() {
        if (isFull()) {
            System.out.println("Parking lot is full! Notifying security personnel.");
            return ("Parking lot is full! Notifying security personnel.");
        }
        else {
            System.out.println("Space is available again! Notifying the parking lot owner.");
            return ("Space is available again! Notifying the parking lot owner.");
        }
    }
    
    /*
	 * @desc:help driver to find the car
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
    public void driverFindCar(Vehicle car) {
        if(ParkingAttendant.findMyCar(car)!= 0) {
    
        }
        else {
        	System.out.println("Your car is not parked here SORRY!!");
        }
    }

    /*
   	 * @desc:help owner to get the time on which the vehicle arrives
   	 * 
   	 * @params:none
   	 * 
   	 * @return:none
   	 */
	public String getTimeByOwner(Vehicle car) {
		return (car.gettime());
	}
	
    /*
   	 * @desc:help parking for handicap to the nearest slot
   	 * 
   	 * @params:none
   	 * 
   	 * @return:none
   	 */
	public int parkCarForHandicap(Vehicle car) {
		Collections.sort(ParkingAttendant.emptySpace);
		int nearestEmptySpot=ParkingAttendant.emptySpace.get(0);
		ParkingAttendant.allotSlotToTheCar(car, nearestEmptySpot);
		ParkingAttendant.emptySpace.remove(nearestEmptySpot);
		return nearestEmptySpot;
	}


}