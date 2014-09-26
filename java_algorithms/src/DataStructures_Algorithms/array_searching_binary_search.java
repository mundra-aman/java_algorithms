/*********************************************************************

 Description : Binary searching an array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_searching_binary_search {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0;i<size;i++)	   array[i]=Integer.parseInt(br.readLine());

		// bubble sort logic
		int k=1;
		while(k<size){
			for(int i=0;i<size-1;i++){
				if(array[i] > array[i+1]){
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					}
				}
			k++;
		}

		System.out.println("array after sorting");
		for(int i=0;i<size;i++) System.out.print(array[i]);

		// binary search logic
		System.out.println("\ninput search item");
		int item = Integer.parseInt(br.readLine());
		int start=0,end=size-1,mid,loc=-1;

		while(start<=end){
			mid=(start+end)/2;
			if(item==array[mid]) { loc=mid; break;}
			else if(item>array[mid]) 		start=mid+1;
			else if(item<array[mid])		end=mid-1;
				}

		if(loc==-1)    	System.out.println("NUMBER DOES NOT EXIST IN THE ARRAY");
	    else 	        System.out.println("NUMBER EXISTS AT THE INDEX "+ loc);

		}
	}