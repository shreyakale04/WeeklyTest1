package practice;

public class StringEx {

	public static void main(String[] args) {
		
		//String
		String name = "Shreya";
		name = name + " Kale";
		System.out.println(name);
		
		//StringBuffer
		
		StringBuffer sbf = new StringBuffer("Java");
		
		sbf.append(" Developer");
		sbf.append(" Course");
		
		System.out.println(sbf);
		
	   //StringBuilder
		
		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" World");
		sb.append(" Java");

		System.out.println(sb);
		
		
	}

}
