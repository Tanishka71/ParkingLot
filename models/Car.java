package models;

public class Car extends Vehicle {

	/*
	 * @desc:Constructor for the child class of Vehicle
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	  public Car(String licensePlate, String color) {
	        super(licensePlate, color, VehicleSize.Car);
	    }
}
