package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int CAPACITY = 4;
    private List<Vehicle> parkedCars;
    private List<ParkingLotObserver> observers;
    
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
     * @desc: add an observer to be notified when the parking lot is full
     *
     * @params: ParkingLotObserver object
     *
     * @return: none
     */
    public void addObserver(ParkingLotObserver observer) {
        observers.add(observer);
    }

    /*
     * @desc: notify all observers when the parking lot is full
     *
     * @params: none
     *
     * @return: none
     */
    public void notifyObservers() {
        if (isFull()) {
            System.out.println("Parking lot is full! Notifying security personnel.");
            for (ParkingLotObserver observer : observers) {
                observer.notifyFull();
            }
        }
    }

}