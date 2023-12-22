package test.com.bridgelabz.parking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import models.Bike;
import models.Car;
import models.ParkingAttendant;
import models.ParkingLot;
import models.Vehicle;

class ParkingLotTest {

	ParkingLot parkingLot;
//	Vehicle car;
//	@BeforeEach
//	void setUp() {
//		parkingLot = new ParkingLot();
//		car=new Car("UP 32 4500","15:00");		
//	}
//
//	/*
//	 * @desc:to test park car functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void parkVehicleTest() {
//		parkingLot.parkVehicle(car);
//		assertEquals(ParkingAttendant.slots.size(),1,0);
//	}
//	
//	/*
//	 * @desc:to test unpark car functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void unparkVehicleTest() {
//		parkingLot.unparkVehicle(car);
//		assertEquals(ParkingAttendant.slots.size(),0,0);
//	}
//	
//	/*
//	 * @desc:to test isFull functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void ownerCheckWhenParkingIsFull() {
//		parkingLot.parkVehicle(car);
//		boolean check=parkingLot.isFull();
//		assertEquals(check,true);
//	}
//	
//	/*
//	 * @desc:to test notify securty personnel functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void notifySecurityPersonnelThatParkingIsFull() {
//		parkingLot.parkVehicle(car);
//		String check="Parking lot is full! Notifying security personnel.";
//		assertEquals(check,parkingLot.notifyObservers());
//	}
//	
//	/*
//	 * @desc:to test notify observer functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void notifyOwnerThatParkingHasSpaceAgain() {
//		parkingLot.unparkVehicle(car);
//		String check="Space is available again! Notifying the parking lot owner.";
//		assertEquals(check,parkingLot.notifyObservers());
//	}
//	
//	/*
//	 * @desc:to test parking attendant at a slot  functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void parkingAttendantIsGivingASlot() {
//		parkingLot.parkVehicle(car);
//		int slot=1;
//		assertEquals(slot,ParkingAttendant.slots.get(car.licensePlate),0);
//	}
//	
//	/*
//	 * @desc:to test finding the car by the driver  functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void findVehicleByDriver() {
//		parkingLot.parkVehicle(car);
//		int slot=2;
//		assertEquals(slot,ParkingAttendant.findMyCar(car),0);
//	}
//	
//	/*
//	 * @desc:to test the arrival time functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void  checkIfOwnerCanGetArivalTime(Vehicle car) {
//		String time="15:00";
//		String check=parkingLot.getTimeByOwner(car);
//		assertTrue(time.equals(check));
//	}
//	
//	/*
//	 * @desc:to test the handicap funcitonality functionality
//	 * 
//	 * @params:none
//	 * 
//	 * @return:none
//	 */
//	@Test
//	void  checkIfHandicapCarCanBeParked(Vehicle car) {
//		int slot=1;
//		parkingLot.parkVehicle(car);
//		parkingLot.unparkVehicle(car);
//		int check=parkingLot.parkCarForHandicap(car);
//		assertEquals(slot,check,0);
//	}
//	

	/*
	 * @desc:to test parking according to size functionality
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	@Test
	void vehicleIsParkedAccordingToSize() {
		Vehicle bike=new Bike("UP 1000","2:30");
		parkingLot.parkVehicle(bike);
		assertEquals(8,ParkingAttendant.slots.get(bike.licensePlate),0);
	}
}

