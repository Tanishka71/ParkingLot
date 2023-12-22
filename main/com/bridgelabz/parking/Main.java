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
		Vehicle car1=new Car("UP 32 4500","12:00");
		Vehicle car2=new Car("UP 33 7600","9:00");
		Vehicle car3=new Car("UP 34 1200","12:00");
		Vehicle car4=new Car("UP 35 8800","10:00");
		Vehicle car5=new Car("UP 36 9900","11:00");
		Vehicle car6=new Car("UP 37 1000","12:30");

		//<-------------USE CASE 1------------->

		parkingLot.parkCar(car1);
		parkingLot.parkCar(car2);
		parkingLot.parkCar(car3);
		parkingLot.printOccupancy();
		
		
		//<-------------USE CASE 2------------->
	
		parkingLot.unparkCar(car1);
		parkingLot.parkCar(car4);



		//<-------------USE CASE 3------------->
		parkingLot.parkCar(car5);

	
		//<-------------USE CASE 4------------->
		parkingLot.notifyObservers();

		//<-------------USE CASE 5------------->
		
		parkingLot.unparkCar(car5);
		parkingLot.notifyObservers();
		
		//<-----------USE CASE 6--------------->
		parkingLot.parkCar(car6);
		
		//<-----------USE CASE 7--------------->
		parkingLot.driverFindCar(car3);
		
		//<-----------USE CASE 8--------------->
		String timeOfArrival=parkingLot.getTimeByOwner(car3);
		System.out.println(car3.licensePlate+ " arrived at "+ timeOfArrival);
	}
}
