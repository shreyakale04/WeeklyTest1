package com.parkingSystem;

import java.util.Scanner;

public class ParkingManagement {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Vehicle[] parking = new Vehicle[5];
		
		int count = 0;
		int choice;
		
		do{
			System.out.println("\n===== Parking Management System =====");
            System.out.println("1. Entry Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Display Parked Vehicles");
            System.out.println("4. Exit Program");
            System.out.print("Enter Choice : ");
            
            choice = sc.nextInt();
            
            switch(choice){
            
            case 1:
            	
            	if(count < parking.length){
            		System.out.println("Enter Vehicle Number : ");
            		int no = sc.nextInt();
            		
            		sc.nextLine();
            		
            		System.out.println("Enter Owner Name : ");
            		String name = sc.nextLine();
            		
            		System.out.println("Enter Parking Hours : ");
            		int hours = sc.nextInt();
            		
            		parking[count] = new Vehicle(no, name, hours);
            		
                    System.out.println("Vehicle Parked Successfully");
            		
            		count++;
            	}
            	else{
            		
            		System.out.println("Parking Full");
            	}
            	break;
            	
            case 2:
            	
            	if(count == 0){
            		
            		System.out.println("No Vehicles Parked");
            		
            	}else
            	{
                 System.out.println("Enter Vehicle Number to Exit : ");
                 int exitNo = sc.nextInt();
                 
            	boolean found = false;
            	
            	for(int i = 0; i < count; i++){
            	
            		if(parking[i].vehicleNo == exitNo){
            			
            			 System.out.println("Vehicle Exited");
            			 parking[i].display();
            			 
            			 for(int j = i; j < count-1; j++){
            				
            			parking[j] = parking[j+1]; 
            			
            		 }
            			 parking[count - 1] = null; 
            			 
            			 count--;
            			 
            			 found = true;
            			 break;
            
            	}
            		
            	}
            	
            	if(!found){
            		System.out.println("Vehicle not found");
            	}
            	}
            	
            	   break;
            	   
            case 3 : 
            	if(count==0){
            		
            		System.out.println("Parking Empty");
            	}
            	else{
            		System.out.println("\n--- Parked Vehicles ---");
            		
            		for(int i = 0; i < count; i++){
            			parking[i].display();
            			
            		}
            	}
            	break;
            	
            case 4 :
            	System.out.println("Program Ended");
            	break;
            	
            default: 
            	System.out.println("Invalid Choice");
            	}
		}
		while(choice != 4);
		
		sc.close();
			
		
	}

}
