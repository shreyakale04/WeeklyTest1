package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		
		int[]arr = {10, 10, 20, 20, 30, 40, 50};
		
		Set<Integer>set = new LinkedHashSet<>();
		
		for(int i = 0; i < arr.length; i++){
			
			set.add(arr[i]);
		}
		
		for(int num : set){
			
			System.out.println(num);
		}

	}

}
