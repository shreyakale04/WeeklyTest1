package string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
	
	public int firstuniqchar(String str){
		
		Map<Character, Integer>map = new HashMap<>();
		
		str = str.toLowerCase();
		for(char c : str.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(int i = 0; i<str.length(); i++){
			
			if(map.get(str.charAt(i))==1){
				
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		FirstUniqChar u = new FirstUniqChar();
		String str = "Lleetcode";
		
		int result = u.firstuniqchar(str);
		System.out.println("First Unique Characters = " + result);
		
	}

}
