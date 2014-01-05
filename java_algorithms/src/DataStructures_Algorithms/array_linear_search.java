/*********************************************************************
 
 Description : Linear searching an array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_linear_search {

	public static void main(String args[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		 
		for(int i=0; i<size; i++) 	array[i]=Integer.parseInt(br.readLine());
		
		for(int i=0; i<size; i++){ if (array[i]==x) System.out.println(i); }  // search logic
		 
	}
	
}
