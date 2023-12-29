package com.travelhut.model;

import java.util.List;

public class TravelPackage {
	 	private String packageName;
	    private int passengerCapacity;
	    private List<Destination> destinationList;
	    private List<Passenger> passengerList;
	    
	    public TravelPackage() {
			
		}

		public TravelPackage(String packageName, int passengerCapacity, List<Destination> destinationList,
				List<Passenger> passengerList) {
			super();
			this.packageName = packageName;
			this.passengerCapacity = passengerCapacity;
			this.destinationList = destinationList;
			this.passengerList = passengerList;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public int getPassengerCapacity() {
			return passengerCapacity;
		}

		public void setPassengerCapacity(int passengerCapacity) {
			this.passengerCapacity = passengerCapacity;
		}

		public List<Destination> getDestinationList() {
			return destinationList;
		}

		public void setDestinationList(List<Destination> destinationList) {
			this.destinationList = destinationList;
		}

		public List<Passenger> getPassengerList() {
			return passengerList;
		}

		public void setPassengerList(List<Passenger> passengerList) {
			this.passengerList = passengerList;
		}

		public void printItinerary() {
	       System.out.println("Travel Package Name: "+this.packageName);
	       
	       System.out.println("Destinations Available: ");
	       for(Destination x: this.destinationList) {
	    	   
	    	   System.out.println(x.getDestinationName());
	    	   System.out.println("---------->");
	    	   System.out.println("Activities at "+x.getDestinationName());
	    	   for(Activity a:x.getActivities()) {
	    		   System.out.println("Name: "+a.getActivityName()+"**");
	    		   System.out.println("Description: "+a.getActivityDescription());
	    		   System.out.println("Cost: "+a.getActivityCost());
	    		   System.out.println("Capacity: "+a.getCapacity());
	    	   }
	       }
	      
	       
	    }

	    public void printPassengerList() {
	      for(Passenger p:this.passengerList) {
	    	  System.out.println("Name: "+p.getPassengerName());
	    	  System.out.println("Number: "+p.getPassengerNumber());
	    	  System.out.println("Balance: "+p.getBalance());
	    	  System.out.println("Activities Opted:");
	    	  for(Activity activity:p.getSignedUpActivities()) {
	    		  System.out.println(activity.getActivityName());
	    	  }
	    	  System.out.println("----------------");
	      }
	   
	    }

	    public void printAvailableActivities() {
	        // Implement logic to print details of activities with available spaces
	    }
}
