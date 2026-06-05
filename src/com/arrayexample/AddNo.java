package com.arrayexample;

public class AddNo {

	public static void main(String[] args) {
		
		int[]arr = {5, 12, 10, 7};
		
		for(int num : arr){
			System.out.println(num);
		}
		
		System.out.println("The value of Index 1: " + arr[1]);
		
		System.out.println("The length of array = " + arr.length);
		
		arr[2] = 30;
		
		System.out.println("Replace value at index 2 = " + arr[2]);
		
		System.out.println("After update the elements : " );
		for(int num : arr){
			System.out.println(num);
		}
		

	}

}
