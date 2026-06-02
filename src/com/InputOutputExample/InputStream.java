package com.InputOutputExample;
import java.io.FileInputStream;;
public class InputStream {

	public static void main(String[] args) throws Exception {
		FileInputStream fir = new FileInputStream("answer.txt");
		
		int i;
		
		while((i = fir.read()) != -1){
			
			System.out.print((char)i);
		} 
		fir.close();
	}

}
