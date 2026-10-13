package leetcodePrb;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static int[] twoSum(int[]arr , int target){
		
//		for(int i = 0; i<arr.length; i++){
//			for(int j = i+1; j<arr.length; j++){
//			
//			if(arr[i] + arr[j] == target){
//				
//				 return new int[]{i, j};
//			}
//			}	
//			
//		}
		
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			
			int needed = target - arr[i];
			
			if(map.containsKey(needed)){
				return new int[]{map.get(needed),i};
			}
			map.put(arr[i], i);
		}
		
	 return new int[]{};
	}

	public static void main(String[] args) {
		
     int[]arr = {2, 7, 11, 15};
     int target = 13;
     
     int[] result = twoSum(arr, target);
     
     System.out.println(Arrays.toString(result));
	}

}
