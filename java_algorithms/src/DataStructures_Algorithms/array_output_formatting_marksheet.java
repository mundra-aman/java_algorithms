package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_output_formatting_marksheet {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int array[][] = new int[10][10];
		int i=0,j=0;
		
		System.out.println("Enter student name ");
		String sname="test";
		@SuppressWarnings("unused")
		String name[]=new String[20];
		
		System.out.println("Enter marks of " + sname);

	    for(i=0; i<1; i++) 
	      for(j=0; j<10; j++) {
	    	  array[i][j]=Integer.parseInt(br.readLine());
	      }
		
	    
	    for(i=0; i<10; i++) {
		      for(j=0; j<10; j++) 
		    	  System.out.print(array[i][j]+ " ");
		      System.out.println("");
		      }
	    
	 
		
	}
	
}
