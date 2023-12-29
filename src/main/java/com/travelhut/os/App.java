package com.travelhut.os;

import java.util.ArrayList;
import java.util.List;

import com.travelhut.model.Activity;
import com.travelhut.model.Destination;
import com.travelhut.model.Passenger;
import com.travelhut.model.PassengerType;
import com.travelhut.model.TravelPackage;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("start");
    	
        //creating activities
    	Activity activity1 = new Activity("scubaDriving","fun driving below the water 30 m",2000,1);
    	Activity activity2 = new Activity("paraGliding","sealing from 900 m height in north goa",2500,2);
    	Activity activity3 = new Activity("bananaRide","enjoy the sea fun",1000,15);
    	Activity activity4 = new Activity("sightSeeing","enjoying the beauty of the nature",500,30);
    	Activity activity5 = new Activity("surfing","enjoying snow in authentic way",1500,10);
    	Activity activity6 = new Activity("bungeeJumping","enjoying your time here in more asthetic way around",200,1);
    	Activity activity7 = new Activity("trekking","this is one in a lifetime experience",400,50);
    	Activity activity8 = new Activity("hiking","enjoy every bit of it to the fullest",2300,20);
    	Activity activity9 = new Activity("birdWatching","one of the most beautiful activity around",500,8);
    	
    	//creating list of Activities for destinations;
    	List<Activity>	d1List = new ArrayList<>();
    	d1List.add(activity1);
    	d1List.add(activity2);
    	d1List.add(activity3);
    	List<Activity>	d2List = new ArrayList<>();
    	d2List.add(activity4);
    	d2List.add(activity5);
    	d2List.add(activity6);
    	List<Activity>	d3List = new ArrayList<>();
    	d3List.add(activity7);
    	d3List.add(activity8);
    	d3List.add(activity9);
    	
    	
    	//creating list of Activities for passengers;
    	List<Activity>	p1List = new ArrayList<>();
    	p1List.add(activity2);
    	p1List.add(activity3);
    	List<Activity>	p2List = new ArrayList<>();
    	p2List.add(activity4);
    	p2List.add(activity5);
    	List<Activity>	p3List = new ArrayList<>();
    	p3List.add(activity8);
    	p3List.add(activity9);

    	
    	
    	//creating passengers
    	Passenger passenger1 = new Passenger("Ramesh",8909876,5000,PassengerType.GOLD,p1List);
    	Passenger passenger2 = new Passenger("Nikhil",8647989,4000,PassengerType.PREMIUM,p2List);
    	Passenger passenger3 = new Passenger("Omkar",787789,3000,PassengerType.STANDARD,p3List);
    	Passenger passenger4 = new Passenger("Suresh",821876,4000,PassengerType.GOLD,p1List);
    	Passenger passenger5 = new Passenger("Jeet",6727989,8000,PassengerType.PREMIUM,p2List);
    	Passenger passenger6 = new Passenger("Yash",765789,3500,PassengerType.STANDARD,p3List);
    	
    	
    	//creating passenger list
    	List<Passenger>	passengerList1 = new ArrayList<>();
    	List<Passenger>	passengerList2 = new ArrayList<>();
    	List<Passenger>	passengerList3 = new ArrayList<>();
    	passengerList1.add(passenger1);
    	passengerList1.add(passenger2);
    	passengerList2.add(passenger3);
    	passengerList2.add(passenger4);
    	passengerList3.add(passenger5);
    	passengerList3.add(passenger6);
    	
    	//Creating destinations
    	Destination destination1 = new Destination("North Goa",d1List);
    	Destination destination2 =new Destination("South Goa",d2List);
    	Destination destination3 = new Destination("Panji",d3List);
    	Destination destination4 = new Destination("Kedarnath",d1List);
    	Destination destination5 =new Destination("jammu",d2List);
    	Destination destination6 = new Destination("Kashmir",d3List);
    	Destination destination7 = new Destination("Mizoram",d1List);
    	Destination destination8 =new Destination("Lakshwadeep",d2List);
    	Destination destination9 = new Destination("Assam",d3List);
    	
    	//creating destination list for travel packages
    	
    	List<Destination>	destinationList1 = new ArrayList<>();
    	List<Destination>	destinationList2 = new ArrayList<>();
    	List<Destination>	destinationList3 = new ArrayList<>();
    	destinationList1.add(destination1);
    	destinationList1.add(destination2);
    	destinationList1.add(destination3);
    	destinationList2.add(destination4);
    	destinationList2.add(destination5);
    	destinationList2.add(destination6);
    	destinationList3.add(destination7);
    	destinationList3.add(destination8);
    	destinationList3.add(destination9);
    	
    	//creating travel packages
    	
    	TravelPackage travelpackage1 = new TravelPackage("Goa Package",8,destinationList1,passengerList1); 
    	TravelPackage travelpackage2 = new TravelPackage("Kashmir Package",14,destinationList2,passengerList2); 
    	TravelPackage travelpackage3 = new TravelPackage("North India Package",25,destinationList3,passengerList3);
    	
    	//travelpackage1.printItinerary();
    	//travelpackage1.printPassengerList();
    	
    	System.out.println("end");
    }
}
