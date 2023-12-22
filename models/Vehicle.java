package models;

import java.util.ArrayList;

public abstract class Vehicle
{
      protected ArrayList<ParkingLot> ParkingLots =
                           new ArrayList<ParkingLot>();
      protected String licensePlate;
      protected String color;
      protected VehicleSize size;
      /*
  	 * @desc:Constructor for the parent class Vehicle
  	 * 
  	 * @params:none
  	 * 
  	 * @return:none
  	 */
      Vehicle(String license,String color,VehicleSize size){
    	  this.licensePlate=license;
    	  this.color=color;
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
  	 * @desc:get color of the car
  	 * 
  	 * @params:none
  	 * 
  	 * @return:color
  	 */

      public String getColor() {
          return color;
      }

      /*
  	 * @desc:set color
  	 * 
  	 * @params:color
  	 * 
  	 * @return:none
  	 */

      public void setColor(String color) {
          this.color = color;
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
                  ", color='" + color + '\'' +
                  ", size=" + size +
                  '}';
      }
  }
 