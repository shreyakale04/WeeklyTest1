package practice;

import java.util.ArrayList;
import java.util.List;

public class StarRemove {

	
		
		public static String removeStars(String s){
			
			List<Character>list = new ArrayList<>();
			
			for(char c : s.toCharArray()){
				
				if(c == '*'){
					list.remove(list.size()-1);
					}
				else{
					list.add(c);
				}
			}
			
		      StringBuilder result = new StringBuilder();

		        for (char c : list) {
		            result.append(c);
		        }

		        return result.toString();
		}
		public static void main(String[] args) {
	
		String s = "prog**ram*e";
		
		System.out.println(removeStars(s));
		}

}
