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

public class array_max_secondlargest2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[] = new int[size];
		for(int i=0;i<size;i++)  array[i]=Integer.parseInt(br.readLine());
		
		int k=0;
		while(k<2){
			int max=array[k];
			for(int i=k;i<size;i++){
				if(array[i]>max){
					max=array[i];
					array[i]=array[k];
					array[k]=max;
				}
			}
			k++;
		}
		
		System.out.println("max1: "+array[0]);
		System.out.println("max2: "+array[1]);
	}

}
