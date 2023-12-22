package models;

import java.util.HashMap;
import java.util.Map;

public class ParkingAttendant {

    // ParkingLot instance associated with the ParkingAttendant
    ParkingLot parkingLot = new ParkingLot();

    // Static map to keep track of parked vehicles and their corresponding slots
    public static Map<Object, Integer> slots = new HashMap<>();

    /**
     * @desc: Allots a parking slot to the specified vehicle and prints the slot information.
     * @params: car - the Vehicle object to be parked, numberOfVehicle - the slot number to allot
     * @return: void
     */
    static void allotSlotToTheCar(Vehicle car, int numberOfVehicle) {
        slots.put(car.licensePlate, numberOfVehicle);
        System.out.println(car + " is parked at slot: A" + slots.get(car.licensePlate));
    }

    /**
     * @desc: Empties the parking slot for the specified vehicle and prints the slot information.
     * @params: car - the Vehicle object to be unparked, numberOfVehicle - the slot number to empty
     * @return: void
     */
    static void emptySlotForTheCar(Vehicle car, int numberOfVehicle) {
        System.out.println("UNparked at slot: A" + slots.get(car.licensePlate) + " " + car);
        slots.remove(car.licensePlate);
    }
}
