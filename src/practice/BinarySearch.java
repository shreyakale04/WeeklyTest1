package practice;

public class BinarySearch {
	
	public int Search(int[]arr, int target){
		
		int low = 0, high = arr.length - 1;
		
		while(low <= high){
			
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target)
				
				return mid;
			
			if(arr[mid] < target)
				
				low = mid + 1;
			
			else
				high = mid - 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
        int target = 10;
        
        int result =  bs.Search(arr, target);
        
         if(result == -1){
			
			System.out.println("Element is not present in array");
			
		}else{
			System.out.println("Element is present at index "
                    + result);
		}
        

	}

}
