package com.live;

public class Main {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		int n = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2; i<=n; i++){
			
			int c = a + b; // 0+1 = 1
			 
			System.out.println(c);
			
			a = b;
			b = c;
			
			
		}
}
}
