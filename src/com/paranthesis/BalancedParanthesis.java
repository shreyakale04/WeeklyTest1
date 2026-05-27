package com.paranthesis;

public class BalancedParanthesis {

static boolean isBalanced(String str){
		
		char[] arr = str.toCharArray();
		
		int count = 0;
		int i = 0;
		int j = 0;
		
		while(i < arr.length){

	        // Opening brackets
	        if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){

	            j = i;
	            count++;
	            i++;
	        }

	        // Closing brackets
	        else if(arr[i] == ')' || arr[i] == '}' || arr[i] == ']'){

	            count--;

	            while(j >= 0 && arr[j] == '#'){
	                j--;
	            }

	            if(j >= 0 &&
	               ((arr[j] == '(' && arr[i] == ')') ||
	                (arr[j] == '{' && arr[i] == '}') ||
	                (arr[j] == '[' && arr[i] == ']'))){

	                arr[j] = '#';
	                arr[i] = '#';
	            }

	            else{
	                return false;
	            }

	            i++;
	        }

	        // Other characters
	        else{
	            i++;
	        }
	    }

	    return count == 0;
	}
	public static void main(String[] args) {

        String str = "{[()]}";

        if(isBalanced(str)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
	
}


