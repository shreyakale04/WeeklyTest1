package string;

public class LengthOfLastWord {
	
	public int lengthOfLastWord(String str){
		
		int i = str.length()-1;
		int count = 0;
		
		while(i >= 0 && str.charAt(i) == ' '){
			
			i--;
		}
		while(i >= 0 && str.charAt(i) != ' '){
			count++;
			i--;
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		LengthOfLastWord w = new LengthOfLastWord();
		
		String str = "Hello Java";
		
		int result = w.lengthOfLastWord(str);
		
		System.out.println("Length Of Last Word = " + result);
	}

}
