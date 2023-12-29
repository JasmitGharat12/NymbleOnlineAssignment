package com.travelhut.model;

import java.util.List;

public class Destination {
	private String destinationName;
    private List<Activity> activities;
    

	public Destination() {
		super();
		
	}
  

	public Destination(String destinationName, List<Activity> activities) {
		super();
		this.destinationName = destinationName;
		this.activities = activities;
	}



	public String getDestinationName() {
		return destinationName;
	}



	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}



	public List<Activity> getActivities() {
		return activities;
	}



	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}



	public void printDetails() {
        // Implement logic to print activity details
    }
}
