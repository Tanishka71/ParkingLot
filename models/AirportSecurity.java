package models;

public class AirportSecurity implements ParkingLotObserver {
    @Override
    public void notifyFull() {
        System.out.println("Security personnel notified: Parking lot is full. Redirecting security staff.");
    }
}