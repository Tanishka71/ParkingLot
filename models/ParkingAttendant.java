package models;

public class ParkingAttendant {
        public Vehicle assignParkingSpot(Vehicle car) {
            car.setParkingSpot(spot++);
            return car;
        }
    
}


