package com.parkingSystem;


public class Vehicle {

	int vehicleNo;
	String ownerName;
	int hours;
	int fee;
	
	Vehicle(int vehicleNo, String ownerName, int hours ){
		this.vehicleNo = vehicleNo;
		this.ownerName = ownerName;
		this.hours = hours;
		this.fee = hours * 20;
	}
	
	
	void display(){
		System.out.println("Vehicle no : " + vehicleNo);
		System.out.println("Owner Name : " + ownerName);
		System.out.println("Parking Hours : " + hours);
		System.out.println("Parking Fee : " + fee);
		System.out.println("---------------------------");
		
	}
}
