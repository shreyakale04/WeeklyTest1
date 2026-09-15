package string;

public class LongestPalindrome {
	
	 public String longestPalindrome(String s) {

	        String longest = "";

	        for (int i = 0; i < s.length(); i++) {

	            for (int j = i; j < s.length(); j++) {

	                String substring = s.substring(i, j + 1);

	                if (isPalindrome(substring)) {

	                    if (substring.length() > longest.length()) {
	                        longest = substring;
	                    }
	                }
	            }
	        }

	        return longest;
	        
	 }
	 public boolean isPalindrome(String s) {

	        int left = 0;
	        int right = s.length() - 1;

	        while (left < right) {

	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }

	public static void main(String[] args) {
		
		LongestPalindrome lp = new LongestPalindrome();
		String s = "babad";
		String result = lp.longestPalindrome(s);
		System.out.println("Longest Palindrome Substring = " + result);
	}

}
