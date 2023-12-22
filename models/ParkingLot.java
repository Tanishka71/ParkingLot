package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int CAPACITY = 100;
    private List<Vehicle> parkedCars;
    
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
	 * @desc:park the car at a particular spot
	 * 
	 * @params:Vehicle object
	 * 
	 * @return:none
	 */
    public void parkCar(Vehicle car) {
            parkedCars.add(car);
            System.out.println("Car parked: " + car);
    }

    /*
	 * @desc:print how many parking spots are occupied 
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
    public void printOccupancy() {
        System.out.println("Occupancy: " + parkedCars.size() + "/" + CAPACITY);
    }

}