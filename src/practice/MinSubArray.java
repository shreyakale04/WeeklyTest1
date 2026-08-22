package practice;

public class MinSubArray {

	public static void main(String[] args) {
		int[]arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int currentSum = 0;
		int MinSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			currentSum = currentSum + arr[i];
			
			if(currentSum > 0){
				
				currentSum = 0;
			}
			MinSum = Math.min(MinSum, currentSum);
		}
		System.out.println(MinSum);

	}

}
