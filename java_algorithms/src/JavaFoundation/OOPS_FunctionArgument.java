package JavaFoundation;

import java.io.IOException;

public class OOPS_FunctionArgument {
	
	
	
	static void function(int x, int y) throws NumberFormatException, IOException{
		
	    System.out.println("this form used when no user input");
		int a=x;
		int b=y;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		function(3,4);
	}

}