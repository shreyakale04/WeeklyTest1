package practice;

public class Palindrome {
	
	public boolean isPalindrome(String s){
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()){
			
			if(Character.isLetterOrDigit(c)){
				
				sb.append(Character.toLowerCase(c));
			}
		}
		
		String str = sb.toString();
		
		String rev = sb.reverse().toString();
		
		return str.equals(rev);
	}

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		
		 String s = "A man, a plan, a canal: Panama";
		 
		 boolean result = p.isPalindrome(s);
		 
		 System.out.println(result);

	}

}
