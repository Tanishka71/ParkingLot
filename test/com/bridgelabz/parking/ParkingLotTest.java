package test.com.bridgelabz.parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Car;
import models.ParkingLot;
import models.Vehicle;

class ParkingLotTest {

	ParkingLot parkingLot;
	Vehicle car;
	@BeforeEach
	void setUp() {
		parkingLot = new ParkingLot();
		car=new Car("UP 32 4500","White");		
	}

	/*
	 * @desc:to test park car functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void parkCarTest() {
		parkingLot.parkCar(car);
		assertEquals(parkingLot.parkedCars.size(),1,0);
	}
	
	/*
	 * @desc:to test unpark car functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void unparkCarTest() {
		parkingLot.unparkCar(car);
		assertEquals(parkingLot.parkedCars.size(),0,0);
	}
	
	/*
	 * @desc:to test isFull functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void ownerCheckWhenParkingIsFull() {
		parkingLot.parkCar(car);
		parkingLot.parkCar(car);
		parkingLot.parkCar(car);
		parkingLot.parkCar(car);
		parkingLot.parkCar(car);
		boolean check=parkingLot.isFull();
		assertEquals(check,true);
	}
}
