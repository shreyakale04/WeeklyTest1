package practice;

import java.util.HashSet;
import java.util.Set;

public class Bruetforce {
	
	public int MaxEqualSum(int[]arr){
		
		int n = arr.length;
		Set<Integer>uniqueSum = new HashSet<>();
		
		for(int i = 0; i<n; i++){
			for(int j = i+1; j<n; j++){
				for(int k = j+1; k<n; k++){
					
					uniqueSum.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		int maxTriplets = 0;
		
		for(int targetSum : uniqueSum){
			
			boolean[]visited = new boolean[n];
			
			 int count = findMaxTripletsForSum(arr, visited, targetSum, 0);
			
			maxTriplets = Math.max(maxTriplets, count);
		}
		
		return maxTriplets;
	}

	private int findMaxTripletsForSum(int[] arr, boolean[] visited, int targetSum, int start) {
		
		int n = arr.length;
		int maxCount = 0;
		
		for(int i = start; i<n; i++){
			if(visited[i])continue;
			
	   for (int j = i + 1; j < n; j++) {
	       if (visited[j]) continue;
	                
	       for (int k = j + 1; k < n; k++) {
	          if (visited[k]) continue;
	          
	          if (arr[i] + arr[j] + arr[k] == targetSum) {
                  // Mark indices as used
                  visited[i] = true;
                  visited[j] = true;
                  visited[k] = true;
                  
                  int currentCount = 1 + findMaxTripletsForSum(arr, visited, targetSum, i + 1);
                  
                  maxCount = Math.max(maxCount, currentCount);
                  
                  visited[i] = false;
                  visited[j] = false;
                  visited[k] = false;
              }
          }
      }
  }
  return maxCount;
}
		
	

	public static void main(String[] args) {
		
		Bruetforce b = new Bruetforce();
		
		   int[]arr = {1, 2, 3, 2, 2, 2, 4, 0, 6};
       System.out.println("Maximum Equal-Sum Disjoint Triplets: " + b.MaxEqualSum(arr));

	}

}
