package practice;

import java.util.HashMap;
import java.util.Stack;

public class RemoveStar {

	public static void main(String[] args) {
	
		String str = "ab**ccd*ef*ggc";
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		
		Stack<Character>stk = new Stack<>();
		Stack<Integer>idxstk = new Stack<>();
		
		for(int i = 0; i < str.length(); i++){
			
			char ch = str.charAt(i);
			
			if(ch == '*'){
				
				if(!stk.isEmpty()){
					
					stk.pop();
					idxstk.pop();
					
				}
			}
			else{
				
				stk.push(ch);
				 idxstk.push(i);
			  }
				  }
			StringBuilder sb = new StringBuilder();
			HashMap<Character, Integer>fq = new HashMap<>();
			
			for(char c : stk){
				
				sb.append(c);
				
				fq.put(c, fq.getOrDefault(c,0)+1);
			}
			 System.out.println("Final String : " + sb);
			 
			 String rev = sb.reverse().toString();
			 
			 System.out.println("Reverse String : " + rev);
			 
			 System.out.println("Original Indexes " );
			 
			 for(int index : idxstk){
				 
				System.out.println(index + " ");
			 }
			 
			 System.out.println();
		
			 int sum = 0;
			  int max = arr[0];
			  int min = arr[0];
			  
			  for(int num : arr){
				  
				  sum += num;
				  
				  if(num > max)
					  max = num;
				  if(num < min)
					  min = num;
			  }
			  
			  System.out.println("sum = " + sum);
			  System.out.println("Maximum = " + max);
			  System.out.println("Minimum = " + min);
			  
			  System.out.println("Character Frequency");
			  
			  for(char c : fq.keySet()){
				  System.out.println(c + "--" + fq.get(c));
			  }
			
		}

			
}

