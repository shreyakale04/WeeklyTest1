package string;

import java.util.HashMap;
import java.util.Map;

public class MinLength {

	public static String minLength(String name, String t){
		
		if(name.length()< t.length())
		return "";
		
		Map<Character, Integer>map = new HashMap<>();
		
		for(char c : t.toCharArray()){
	      map.put(c, map.getOrDefault(c, 0) + 1);
			
		}
		int left = 0;
        int right = 0;

        int required = map.size();

        int formed = 0;

        Map<Character, Integer> window = new HashMap<>();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < name.length()) {

            char ch = name.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) &&
                window.get(ch).intValue() == map.get(ch).intValue()) {

                formed++;
            }

            while (left <= right && formed == required) {

                if (right - left + 1 < minLength) {

                    minLength = right - left + 1;
                    start = left;
                }

                char remove = name.charAt(left);

                window.put(remove, window.get(remove) - 1);

                if (map.containsKey(remove) &&
                    window.get(remove) < map.get(remove)) {

                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : name.substring(start, start + minLength);
    
		
		
		
	}
	
	public static void main(String[] args) {
		
		String name = "ADOBECODEBANC";
		String t = "ABC";
		
		 System.out.println(minLength(name, t));
		


	}

}
