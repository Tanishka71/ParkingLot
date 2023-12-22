package models;

public class Bike extends Vehicle {
	/*
	 * @desc:Constructor for the child class of Vehicle
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	  public Bike(String licensePlate, String color) {
	        super(licensePlate, color, VehicleSize.Bike);
	    }

}
