package practice;

public class LinearSearch2 {
	
	public int Search(int[]arr, int target){
		
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] == target){
				
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		LinearSearch2 ls = new LinearSearch2();
		
		int[]arr = {10, 8, 30};
		int target = 6;
		
		int index = ls.Search(arr, target);
		
		System.out.println(index);
	}

}
