package main.com.bridgelabz.parking;

import models.Car;
import models.Vehicle;
import models.ParkingLot;

public class Main {
	/*
	 * @desc:main method to display all the use cases
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	public static void main(String []args) {
		System.out.println("<-------------Welcome to parking lot----------------->");
		ParkingLot parkingLot = new ParkingLot();
		
		//<-------------USE CASE 1------------->
		Vehicle car=new Car("UP 32 4500","White");
		parkingLot.parkCar(car);
		parkingLot.printOccupancy();
	}
}
