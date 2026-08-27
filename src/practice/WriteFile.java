package practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
//		try{
//			
//			FileWriter writer = new FileWriter("data.txt");
//			
//			writer.write("Hello Java\n");
//			writer.write("Welcome to File Handling");
//			
//			writer.close();
//			
//			System.out.println("Data written successfully");
//		}
//		catch(IOException e){
//			
//			 e.printStackTrace();
//		}
//	try{
//		FileWriter writer = new FileWriter("data.txt", true);
//		
//		writer.write("\nSpring Boot");
//		
//		writer.close();
//		
//	}catch(IOException e){
//		e.printStackTrace();
//	}
		
		String[]students = {"shreya","Shravani","Priya","Sneha"};
		
		try(FileWriter writer = new FileWriter("students.txt")){
			
			for(String student : students){
				
				writer.write(student + "\n");
			}
			
			  System.out.println("Students saved");
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}

}
