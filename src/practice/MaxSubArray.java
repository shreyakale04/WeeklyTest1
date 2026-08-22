package practice;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int[]arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int currentSum = 0;
		int maxSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			currentSum = currentSum + arr[i];
		
			if(currentSum < 0){
				currentSum = 0;
			}
			
			if(currentSum > maxSum){
				
				maxSum = currentSum;
			}
			
		}
		System.out.println(maxSum);

	}

}
