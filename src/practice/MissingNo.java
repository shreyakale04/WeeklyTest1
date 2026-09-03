package practice;

public class MissingNo {

	public static void main(String[] args) {
		int[]arr = {1, 2, 7, 8, 4, 9};
	    int n = 9;
		
		boolean[]result = new boolean[n+1];
		
		
		for(int num : arr){
			result[num] = true;
		}
		for(int i = 1; i<=n; i++){
			
			if(!result[i]){
				System.out.println(i);
			}
			
		}
	}
	

}
