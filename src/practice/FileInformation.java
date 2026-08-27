package practice;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		System.out.println("File Name : " + file.getName());
		System.out.println("Path : " + file.getAbsolutePath());
		System.out.println("File Size : " + file.length() + " bytes");
        System.out.println("Is File : " + file.isFile());
        System.out.println("Is Directory : " + file.isDirectory());
	}

}
