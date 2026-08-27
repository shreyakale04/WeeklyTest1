package practice;

import java.io.File;

public class RenameDeleteFile {

	public static void main(String[] args) {
	
//		File oldfile = new File("test.txt");
//		File newfile = new File("student.txt");
//
//		if(oldfile.renameTo(newfile)){
//			
//			System.out.println("File renamed");
//		}
//		else{
//			
//			System.out.println("Rename failed");
//		}
		
		File file = new File("student.txt");
		
		if(file.delete()){
			
			System.out.println("File Deleted");
		}
		else {
            System.out.println("File not found");
        }
		
	}

}
