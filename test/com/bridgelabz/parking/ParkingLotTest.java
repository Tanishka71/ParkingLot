package test.com.bridgelabz.parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import models.Car;
import models.ParkingAttendant;
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
		assertEquals(ParkingAttendant.slots.size(),1,0);
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
		assertEquals(ParkingAttendant.slots.size(),0,0);
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
		boolean check=parkingLot.isFull();
		assertEquals(check,true);
	}
	
	/*
	 * @desc:to test notify securty personnel functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void notifySecurityPersonnelThatParkingIsFull() {
		parkingLot.parkCar(car);
		String check="Parking lot is full! Notifying security personnel.";
		assertEquals(check,parkingLot.notifyObservers());
	}
	
	/*
	 * @desc:to test notify observer functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void notifyOwnerThatParkingHasSpaceAgain() {
		parkingLot.unparkCar(car);
		String check="Space is available again! Notifying the parking lot owner.";
		assertEquals(check,parkingLot.notifyObservers());
	}
	
	/*
	 * @desc:to test parking attendant at a slot  functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void parkingAttendantIsGivingASlot() {
		parkingLot.parkCar(car);
		int slot=1;
		assertEquals(slot,ParkingAttendant.slots.get(car.licensePlate),0);
	}
	
	/*
	 * @desc:to test finding the car by the driver  functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void findVehicleByDriver() {
		parkingLot.parkCar(car);
		int slot=2;
		assertEquals(slot,ParkingAttendant.findMyCar(car),0);
	}
}
