/*********************************************************************
 
 Description : Finding missing number from a sorted integer array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_missing_element {

	public static void main(String args[]) throws NumberFormatException, IOException{
		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0; i<size; i++)	array[i]=Integer.parseInt(br.readLine());
		int count=1;
		
		for(int i=0;i<size;i++){
			if (array[i]!=count){
				System.out.println("element " + count + " missing at index " + i);
				count++;
			}
			count++;
		}

	}
}