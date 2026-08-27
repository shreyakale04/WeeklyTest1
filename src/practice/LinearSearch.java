package practice;

public class LinearSearch {
	
	public static int search(int[]arr, int target){
		
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] == target){
				
				return i;
				
			}	
			}
		return -1;
	}
		public static void main(String[] args) {
			
			int[]arr = {1, 2, 3, 4};
			int target = 3;
			
			int result = search(arr, target);
			
			if(result == -1){
				
				System.out.println("Element is not present in array");
				
			}else{
				System.out.println("Element is present at index "
                        + result);
			}
			
			
		}
	}


