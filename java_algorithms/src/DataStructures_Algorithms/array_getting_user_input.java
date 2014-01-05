/*********************************************************************
 
 Description : Getting user input to fill array elements
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_getting_user_input {

	public static void main(String args[]) throws NumberFormatException, IOException{
		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		
		int array[]=new int[size];
		// get array elements
		for(int i=0; i<size; i++)	array[i]=Integer.parseInt(br.readLine());
		// show array elements		
		for(int i=0; i<size; i++)	System.out.println(array[i]);
	}
	
}
