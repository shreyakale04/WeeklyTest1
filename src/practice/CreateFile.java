package practice;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try{
			if(file.createNewFile()){
				
				System.out.println("File created Successfully");
			}else{
				System.out.println("File Already exist");
			}
		}catch(IOException e){
			
			e.printStackTrace();
		}
		{
			
		}

	}

}
