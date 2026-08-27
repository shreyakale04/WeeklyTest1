package practice;

import java.io.File;

public class CheckFile {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		if(file.exists()){
			 System.out.println("File exists");
		}else{
			
			 System.out.println("File does not exists");
		}
	}

}
