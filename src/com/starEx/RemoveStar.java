package com.starEx;

import java.util.Stack;

public class RemoveStar {

	public static void main(String[] args) {
		
		String y = "lee**tco*d*e";
		Stack<Character>stack = new Stack<>();
		
		for(char ch : y.toCharArray()){
			
			if(ch == '*'){
				if(!stack.isEmpty()){
					stack.pop();
					
				}
				}
			else{
				stack.push(ch);
			}
		}
			StringBuilder result = new StringBuilder();
			for(Character c :stack){
				result.append(c);
				
			}
			System.out.println(result);
			System.out.println(result.reverse());
		}
		

	}


