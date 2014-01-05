package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion_print_array2 {
	static int size;
	static int array[]=new int[size];
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array size: ");
		size=Integer.parseInt(br.readLine());
		
		getarray(size);
		printarray();
	}

	
	public static int getarray(int size) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		if(size<0)
			return 0;
		else
		{
			array[size]=Integer.parseInt(br.readLine());
			getarray(size-1);
			return size;
		}
	}
	
	
	public static int printarray(){
		if(size==0)
			return 0;
		
		else {
		   		
		return 1;	
		}
		
	}
	
	
	
}