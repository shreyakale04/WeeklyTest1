package practice;

public class RevVowels {
	
	public static String revVowels(String str){
		
		char[]arr = str.toCharArray();
		int left = 0;
		int right = str.length()-1;

		while(left<right){
			
			while(left<right && !isVowel(arr[left])){
				left++;
			}
			while(left<right && !isVowel(arr[right])){
				right--;
			}
			
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		return new String(arr);
	}
	
	public static boolean isVowel(char ch){
		
		ch = Character.toLowerCase(ch);
		
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static void main(String[] args) {
		
		String str = "education";
		
		System.out.println(revVowels(str));

	}

}
