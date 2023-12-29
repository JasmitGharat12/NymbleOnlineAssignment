package com.travelhut.os;

import com.travelhut.model.Activity;
import com.travelhut.model.Passenger;
import com.travelhut.model.PassengerType;

public class Functionalities {

	public boolean chooseActivity(Passenger p, Activity activity) {
		if (p.getPassengerType() == PassengerType.GOLD) {
			if (p.getBalance() < activity.getActivityCost())
				return false;
			p.setBalance(p.getBalance() - activity.getActivityCost());
			p.getSignedUpActivities().add(activity);
		} else if (p.getPassengerType() == PassengerType.STANDARD) {
			int activityCost = activity.getActivityCost();
			int activityDiscountCost = activityCost - (activityCost * 10) / 100;
			if (p.getBalance() < activityDiscountCost)
				return false;
			p.setBalance(p.getBalance() - activityDiscountCost);
			p.getSignedUpActivities().add(activity);
		}
		return true;
	}
	
	public void printActivitiesWithSpacesAvailable() {
		
	}
}
