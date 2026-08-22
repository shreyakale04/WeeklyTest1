package practice;

public class RemoveDuplicate {

	public int removeDuplicate(int[]arr){
		
		if(arr.length == 0)
			return 0;
		
		int i = 0; 
		
		for(int j = 1; j<arr.length; j++){
			
			if(arr[i] != arr[j]){
				
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;
	}
	
	public static void main(String[] args) {
	
		RemoveDuplicate rm = new RemoveDuplicate();
		
		int[]arr = {10, 10, 20, 20, 30, 40, 50};
		
	    int length =  rm.removeDuplicate(arr);
	      
	      for(int k = 0; k<length; k++){
	    	  
	    	  System.out.println(arr[k]);
	      }
	
	}	
}
		
	

