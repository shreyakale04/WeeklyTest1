package com.InputOutputExample;
import java.io.FileOutputStream;

public class OutputStream {
	public static void main(String[] args)throws Exception {
		
		FileOutputStream fout = new FileOutputStream("answer.txt");
		
		String content = "Student exam answers";
		content.getBytes(); //OutputStream writes data in the form of bytes, not strings.
   
		fout.write(content.getBytes());
		fout.close();
		System.out.println("Data written successfully");

		
	}

}
