package string;

public class ArithmeticSlices {
	
public int numberOfArithmeticSlices(int[] nums) {
        
	int count = 0;
	int total = 0;
	
	for(int i = 2; i<nums.length; i++){
		
		int diff1 = nums[i - 1] - nums[i-2];
		int diff2 = nums[i] - nums[i-1];
		
		if(diff1 == diff2){
			count++;
			 total += count;
		}
		else{
			count = 0;
		}
		
	}
	return total;
    }

	public static void main(String[] args) {
		
		ArithmeticSlices as = new ArithmeticSlices();
		int[]nums = {1, 3, 5, 7, 9};
		
		int result = as.numberOfArithmeticSlices(nums);
		
System.out.println("Number of Arithmetic Slices: " + result);
		
	}
}
