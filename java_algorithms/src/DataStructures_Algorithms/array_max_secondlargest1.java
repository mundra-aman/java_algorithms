/*********************************************************************
 
 Description : A simple java program to find the largest and the 
 				second largest element in an array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_max_secondlargest1 {

public static void main(String args[]) throws NumberFormatException, IOException {
		
		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		
		for(int i=0; i<size; i++)	array[i]=Integer.parseInt(br.readLine());
		
		int i;
		int max1 = array[0];
		int max2 = array[0];
	
		for (i=0; i<size; i++)  	if (max1 < array[i]) max1=array[i];
		 
		for (i=0; i<size; i++)      if (max2 < array[i] && array[i] < max1 || max1 == max2)  max2 = array[i];
		

		System.out.println("max1 is " + max1);
		System.out.println("max2 is " + max2);
		
	}
}