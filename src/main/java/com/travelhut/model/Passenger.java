package com.travelhut.model;

import java.util.List;

public class Passenger {
	private String passengerName;
    private int passengerNumber;
    private static int balance;
    private PassengerType passengerType;
    private List<Activity> signedUpActivities;
    
	public Passenger(String passengerName, int passengerNumber, int balance, PassengerType passengerType,
			List<Activity> signedUpActivities) {
		super();
		this.passengerName = passengerName;
		this.passengerNumber = passengerNumber;
		this.balance = balance;
		this.passengerType = passengerType;
		this.signedUpActivities = signedUpActivities;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public PassengerType getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(PassengerType passengerType) {
		this.passengerType = passengerType;
	}

	public List<Activity> getSignedUpActivities() {
		return signedUpActivities;
	}

	public void setSignedUpActivities(List<Activity> signedUpActivities) {
		this.signedUpActivities = signedUpActivities;
	}

	public void printDetails() {
        // Implement logic to print passenger details, including signed up activities
    }
}
