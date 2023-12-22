package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
<<<<<<< Updated upstream
    private static final int CAPACITY = 4;
    private List<Vehicle> parkedCars;
=======
    private static final int CAPACITY = 100;
    public List<Vehicle> parkedCars;
>>>>>>> Stashed changes
    
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
        return parkedCars.size() >= CAPACITY;
    }

    /*
   	 * @desc:park the car at a particular spot
   	 * 
   	 * @params:Vehicle object
   	 * 
   	 * @return:none
   	 */
    public void parkCar(Vehicle car) {
        if (!isFull()) {
            parkedCars.add(car);
            System.out.println("Car parked: " + car);
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
    public void unparkCar(Vehicle car) {
        if (parkedCars.remove(car)) {
            System.out.println("Car unparked: " + car);
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
        System.out.println("Occupancy: " + parkedCars.size() + "/" + CAPACITY);
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

}