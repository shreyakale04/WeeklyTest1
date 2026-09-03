package practice;

//import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int[] numbers = new int[5];
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter number: ");
//            numbers[i] = sc.nextInt();
//        }
//
//        System.out.println("Array elements:");
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
    	
    	//print 2D array
//    	
//    	 int[][] arr = {
//    	            {10, 20, 30},
//    	            {40, 50, 60},
//    	            {70, 80, 90}
//    	        };
//    	 
//    	 for(int i = 0; i<arr.length; i++){
//    		for(int j = 0; j<arr[i].length; j++){
//    			
//    			System.out.print(arr[i][j] + " ");
//    		} 
//    		
//    		System.out.println();
//    	 }
//    ==================================================================
    	
//    	sum of all elements
//    	 int[][] arr = {
// 	            {10, 20, 30},
// 	            {40, 50, 60},
// 	            {70, 80, 90}
// 	        };
//    	 int sum = 0;
//    	 for(int i = 0; i<arr.length; i++){
// 		for(int j = 0; j<arr[i].length; j++){
// 			sum = sum + arr[i][j];
// 		}
//    	 }
//    	System.out.println("Sum : " + sum); 
// ================================================================================
    	
//	maximum/minimum
    	
    	 int[][] arr = {
  	            {10, 20, 30},
  	            {40, 50, 60},
  	            {70, 80, 90}
  	        };
    	 
    	 int max = arr[0][0];
    	 int min = arr[0][0];
    	
    	 for(int i = 0; i<arr.length; i++){
  	 		for(int j = 0; j<arr[i].length; j++){
  	 		
  	 			if(arr[i][j] > max){
  	 				max = arr[i][j];
  	 			}
  	 			if(arr[i][j] < min){
  	 				min = arr[i][j];
  	 			}
  	 			
  	 		}
  	 		}
    	 System.out.println("Maximum: " + max);
    	 System.out.println("Minimum: " + min);
//    	 ======================================================================
  }
    	
}
