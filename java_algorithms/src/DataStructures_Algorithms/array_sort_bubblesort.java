/*********************************************************************
 
 Description : Bubble sorting an array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_sort_bubblesort {

	public static void main(String args[]) throws NumberFormatException, IOException {

		int size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int array[]=new int[size];

		for(int i=0; i<size; i++)	array[i]=Integer.parseInt(br.readLine());
		System.out.println("array before sort");
		for(int i=0; i<size; i++) System.out.print(array[i]+" ");
		
// buuble sort logic
		int k=1;	
		while(k<size){		

			for(int i=0; i<size-1; i++){
					if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp; }
			}

			k++;
		}
		
		System.out.println("\n array after sort");
		for(int i=0; i<size; i++) System.out.print(array[i]+" ");
	}
}