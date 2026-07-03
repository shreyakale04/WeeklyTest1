package com.arrayexample;

public class MinvalSum {

	public static int sumSubMin(int[]arr){
		
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++){
			
			int min = arr[i];
			
			for(int j = i; j<arr.length; j++){
				
				min = Math.min(min,arr[j]);
				
				sum += min;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	
     int[]arr = {3, 1, 2, 4};
     System.out.println(sumSubMin(arr));
	}

}
