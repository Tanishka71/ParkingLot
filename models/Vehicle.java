package models;

import java.util.ArrayList;

public abstract class Vehicle
{
      protected ArrayList<ParkingLot> ParkingLots =
                           new ArrayList<ParkingLot>();
      public String licensePlate;
      protected String time;
      protected VehicleSize size;
      /*
  	 * @desc:Constructor for the parent class Vehicle
  	 * 
  	 * @params:none
  	 * 
  	 * @return:none
  	 */
      Vehicle(String license,String time,VehicleSize size){
    	  this.licensePlate=license;
    	  this.time=time;
    	  this.size=size;
      }
 
      /*
  	 * @desc:get plate no
  	 * 
  	 * @params:none
  	 * 
  	 * @return:plate no
  	 */
      public String getLicensePlate() {
          return licensePlate;
      }

      /*
    	 * @desc:set plate no
    	 * 
    	 * @params:plate no
    	 * 
    	 * @return:none
    	 */
      public void setLicensePlate(String licensePlate) {
          this.licensePlate = licensePlate;
      }

      /*
  	 * @desc:get time of the car
  	 * 
  	 * @params:none
  	 * 
  	 * @return:time
  	 */

      public String gettime() {
          return time;
      }

      /*
  	 * @desc:set time
  	 * 
  	 * @params:time
  	 * 
  	 * @return:none
  	 */

      public void settime(String time) {
          this.time = time;
      }

      
      /*
  	 * @desc:get size
  	 * 
  	 * @params:none
  	 * 
  	 * @return:size
  	 */

      public VehicleSize getSize() {
          return size;
      }

      /*
    	 * @desc:set size
    	 * 
    	 * @params:size
    	 * 
    	 * @return:none
    	 */
      public void setSize(VehicleSize size) {
          this.size = size;
      }
      @Override
      public String toString() {
          return "Vehicle{" +
                  "licensePlate='" + licensePlate + '\'' +
                  ", time='" + time + '\'' +
                  ", size=" + size +
                  '}';
      }
  }
 