package leetcodePrb;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String s, String t){
		
if(s.length() != t.length()){
		return false;
	}
		int[]count = new int[26];
		
		for(int i = 0; i<s.length(); i++){
			
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		
		for(int num : count){
			if(num != 0){
				return false;
			}
		}
		return true;
		
//--------------------------
//  char[]arr1 = s.toCharArray();
//  char[]arr2 = t.toCharArray();
//  
//  Arrays.sort(arr1);
//  Arrays.sort(arr2);
//  
//  return Arrays.equals(arr1, arr2);

		}

	public static void main(String[] args) {
		
		String s = "listen";
        String t = "silent";
        
        System.out.println(isAnagram(s,t));
	}

}
