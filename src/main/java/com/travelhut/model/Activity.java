package com.travelhut.model;

public class Activity {
	 	private String activityName;
	    private String activityDescription;
	    private int activityCost;
	    private static int capacity;
	    
	    
	    public Activity() {}
	    
		public Activity(String activityName, String activityDescription, int activityCost, int capacity) {
			super();
			this.activityName = activityName;
			this.activityDescription = activityDescription;
			this.activityCost = activityCost;
			this.capacity = capacity;
		}

		public String getActivityName() {
			return activityName;
		}

		public void setActivityName(String activityName) {
			this.activityName = activityName;
		}

		public String getActivityDescription() {
			return activityDescription;
		}

		public void setActivityDescription(String activityDescription) {
			this.activityDescription = activityDescription;
		}

		public int getActivityCost() {
			return activityCost;
		}

		public void setActivityCost(int activityCost) {
			this.activityCost = activityCost;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public void printDetails() {
	        // Implement logic to print activity details
	    }
}
