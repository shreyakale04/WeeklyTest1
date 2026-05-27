package string;

public class RevString {

	public static void main(String[] args) {
	
		String str = "Shreya";
		String rev = "";
		
//		char secondChar = str.charAt(str.length() - 2);
	
//		System.out.println(secondChar);
		for(int i = str.length()-1; i>=0; i--){
			
			rev += str.charAt(i);
			
		}
		System.out.println(rev);

	}

}
