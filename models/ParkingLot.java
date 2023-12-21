package models;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private static final int CAPACITY = 100;
    private List<Vehicle> parkedCars;

    public ParkingLot() {
        this.parkedCars = new ArrayList<>();
    }

    public boolean isFull() {
        return parkedCars.size() >= CAPACITY;
    }

    public void parkCar(Vehicle car) {
        if (!isFull()) {
            parkedCars.add(car);
            System.out.println("Car parked: " + car);
        } else {
            System.out.println("Parking lot is full. Cannot park car.");
        }
    }
    
    public void unparkCar(Vehicle car) {
        if (parkedCars.remove(car)) {
            System.out.println("Car unparked: " + car);
        } else {
            System.out.println("Car not found in the parking lot.");
        }
    }

    // Other methods for parking strategies, valet service, compliance, etc.

    public void printOccupancy() {
        System.out.println("Occupancy: " + parkedCars.size() + "/" + CAPACITY);
    }

}