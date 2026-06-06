package com.arrayexample;

import java.util.Arrays;

public class TargetAddition {

	public static void main(String[] args) {
		
		int[] nums = {3, 2, 4};
		int n = 7; 
		boolean[]result = new boolean[n+1];
		
		for(int arr : nums){
			result[arr] = true;
		}
		for(int i = 1; i<= n; i++){
			
			if(!result[i]){
				
			}
			System.out.println(i);
		}
//		boolean temp = false;
//				
//		for(int i = 0; i<nums.length; i++){
//		for(int j = i+1; j<nums.length; j++){
//			
//			if(nums[i]+nums[j]==target){
//				System.out.println(i +" "+ j );
//			}
//			temp = true;
		}	
		
		

	}


