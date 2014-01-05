/*********************************************************************
 
 Description : Finding the maximum/minimum in an array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_max_min {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		
		for(int i=0; i<size; i++)	array[i]=Integer.parseInt(br.readLine());
		
		int max = array[0];
		int min = array[0];
		for (int i=0; i<size; i++){
			if (max < array[i])		max=array[i];
			else if (min > array[i])		min=array[i];
			// using else reduces the number of loop executions
		}
		
		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}
	
}