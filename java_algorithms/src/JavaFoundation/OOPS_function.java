package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OOPS_function {
	
	public static void function() throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter numbers: ");
		int a= Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		function();
	}

}
