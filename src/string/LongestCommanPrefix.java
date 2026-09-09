package string;

public class LongestCommanPrefix {
	
	public String longestcommanPrefix(String[]strs){
		
		if(strs == null || strs.length == 0){
			
			return "";
		}
		
		String prefix = strs[0];
		
		for(int i = 0; i<strs.length; i++){
			
			while(!strs[i].startsWith(prefix)){
				
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty()){
					
					return "";
				}
			}
		}
		
		return prefix;
	}

	public static void main(String[] args) {
	
		LongestCommanPrefix lp = new LongestCommanPrefix();
		String[] strs = {"flower", "flow", "flight"};
		
		String result = lp.longestcommanPrefix(strs);
		
		System.out.println("Longest Comman Prefix" + result);
	}

}
