package string;

public class StringCompression {
	
	public int Compress(char[]chars){
		
		int write = 0;
		int i = 0;
		
		while(i < chars.length){
			
			char current = chars[i];
			
			int count = 0;
			
			while(i < chars.length && chars[i] == current){
				i++;
				count++;
			}
			
			chars[write] = current;
			write++;
			
			if (count > 1) {

                String countString = String.valueOf(count);

                for (char c : countString.toCharArray()) {
                    chars[write] = c;
                    write++;
                    
                }
			}
		}
		
		return write;
	}

	public static void main(String[] args) {
		
		StringCompression sc = new StringCompression();
		
		char[]Chars = {'a','a','b','b','c','c','c'};
		
		int length = sc.Compress(Chars);
		System.out.print("Compressed String = ");
		
		for(int i = 0; i < length; i++){
			
			System.out.print(Chars[i]);
		}
		
		}
}
