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
		Vehicle car1=new Car("UP 32 4500","White");
		Vehicle car2=new Car("UP 32 7600","Black");
		parkingLot.parkCar(car1);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car2);

		
		//<-------------USE CASE 2------------->
		parkingLot.unparkCar(car1);
		parkingLot.printOccupancy();

		//<-------------USE CASE 3------------->
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car2);
		parkingLot.notifyObservers();
		
	}
}
