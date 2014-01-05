/*********************************************************************
 
 Description : A simple java program to search for an element just 
 				larger than x in a sorted array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_search_just_larger_element {
	
	public static void main(String args[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		 
		for(int i=0; i<size; i++) 	array[i]=Integer.parseInt(br.readLine());
		
		int k=1;	
		while(k<size){		

			for(int i=0; i<size-1; i++){
					if(array[i] > array[i+1]) {		// first sort the array in ascending order
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp; }

			}

			k++;
		}
		
			for(int j=0; j<size; j++){				// then an element next to x will be the just larger one
				if(array[j]>x)  {				
				System.out.println("value is " + array[j] + " and location is " + j);
				break;
				}
			}
		
		   
		

	}
}