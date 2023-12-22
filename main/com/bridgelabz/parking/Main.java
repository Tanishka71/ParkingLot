package main.com.bridgelabz.parking;

import models.Bike;
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
		Vehicle bike=new Bike("UP 1000","2:30");
		Vehicle handicap=new Car("UP 40 1000","12:30");

		//<-------------USE CASE 1------------->

		System.out.println("PARKING A CAR-------->");
		parkingLot.parkVehicle(car1);
		parkingLot.parkVehicle(car2);
		parkingLot.parkVehicle(car3);
		parkingLot.printOccupancy();
		System.out.println();
		
		
		//<-------------USE CASE 2------------->
	
		System.out.println("UNPARKING A CAR------->");
		parkingLot.unparkVehicle(car1);
		parkingLot.parkVehicle(car4);
		System.out.println();


		//<-------------USE CASE 3------------->
		System.out.println("CHECK IF PARKING IS FULL--->");
		parkingLot.parkVehicle(car5);
		System.out.println();

	
		//<-------------USE CASE 4------------->
		System.out.println("NOTIFY THE SECURITY-------->");
		parkingLot.notifyObservers();
		System.out.println();
		//<-------------USE CASE 5------------->
		System.out.println("NOTIFY THE OWNER FREE SPACE--------->");
		parkingLot.unparkVehicle(car5);
		parkingLot.notifyObservers();
		System.out.println();
		
		//<-----------USE CASE 6--------------->
		System.out.println("PROVIDE SLOT THROUGH PARKING ATTENDANT------>");
		parkingLot.parkVehicle(car6);
		System.out.println();
		
		//<-----------USE CASE 7--------------->
		System.out.println("DRIVER TO FIND HIS CAR----->");
		parkingLot.driverFindCar(car3);
		System.out.println();
		
		//<-----------USE CASE 8--------------->
		System.out.println("GET TIME BY OWNER---------->");
		String timeOfArrival=parkingLot.getTimeByOwner(car3);
		System.out.println(car3.licensePlate+ " arrived at "+ timeOfArrival);
		System.out.println();
		
		//<-----------USE CASE 10--------------->
		System.out.println("HANDICAP HELP FIND NEARBUY SPOTS------>");
		parkingLot.parkCarForHandicap(handicap);
		System.out.println();
		
		//<-----------USE CASE 11--------------->
		System.out.println("ALOT SPOT ACCORDING TO SIZE----------->");
		parkingLot.parkVehicle(bike);
		System.out.println();
	}
}
