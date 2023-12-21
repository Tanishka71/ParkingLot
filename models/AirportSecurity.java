package models;

public class AirportSecurity implements ParkingLotObserver {
    @Override
    public void notifyFull() {
        System.out.println("Security personnel notified: Parking lot is full. Redirecting security staff.");
    }

	@Override
	public void notifyAvailable() {
		// TODO Auto-generated method stub
		 System.out.println("Security personnel notified: Parking lot has space now!!Redirecting security staff.");
	}
}