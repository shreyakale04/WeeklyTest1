package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		
//		Read a file character by character
		
//		try(FileReader reader = new FileReader("data.txt")){
//			
//			int ch;
//			
//			while((ch = reader.read()) != -1){
//				
//				System.out.print((char)ch);
//			}
//		}catch(IOException e){
//			e.printStackTrace();
//	}
//-----------------------------------------------------------
		
//		Read file line by line
//		
//		try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
//			
//			String line;
//			
//			while((line = reader.readLine()) != null){
//				
//				 System.out.println(line);
//			}
//			
//		}catch(IOException e){
//			e.printStackTrace();
//			
//			}
//	=========================================================================================
		
		
//		Count number of lines
//		int count = 0;
//		
//		try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
//			
//			while(reader.readLine() != null){
//				
//				count++;
//			}
//			
//			 System.out.println("Number of lines: " + count);
//			
//		}catch(IOException e){
//			e.printStackTrace();
//			
//			}
//===========================================================================
		
//		Count words in a file
		
//		int count = 0;
//		try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
//
//			String line;
//			
//			while((line = reader.readLine()) != null){
//				
//				String[] words = line.trim().split("\\s+");
//				if(!line.trim().isEmpty()){
//					count += words.length;
//				}
//			}
//			System.out.println("Word count: " + count);
//			
//		}catch(IOException e){
//			e.printStackTrace();
//			
//			}
		
//========================================================		
	
		int count = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
			
			int ch;
			
			while((ch = reader.read()) != -1){
				count++;
			}
			
			  System.out.println("Characters: " + count);
			
		}
		catch(IOException e){
			e.printStackTrace();
			
			}
}
}
