/*********************************************************************
 
 Description : Array algorithm, interview problem
 			   Given an unsorted array A of size n, find k such that 
 			   the A has k elements greater then k. 
 			   Report if no such value exists. 
  			   Optimum Time: O(n)    Optimum Space: O(n) 
  
  			   This is a google interview question asked to a 5 years 
  			   experienced person.

 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

/*
   	It is imp to note that only one such value of K can exists ( If it exists). 
	Algorithm:
	1.)   In a single pass find all elements which are greater then k
			and maintain a count of them.
	
	2.) Sort the remaining array in O(n) using counting sort.
	
	3.) Now traverse the sorted array. Assume there were t elements greater 
		then n(in step 1). then in the sorted array, for an element at position i.	
 	 	Number of elements greater then a[i]=t+(n-t)-i=n-i; 
 		According to the question a[i] = n-i; Check if such a value exists. 
 		If yes i is the required answer, else such value does not exists.
 */


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_counting_algorithm_interview {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0;i<size;i++)  array[i]=Integer.parseInt(br.readLine());
		
		for(int i=0;i>size-1;i++){
			for(int j=size-1;j>0;j--){
				if(array[j-1]>array[j]){
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<size;i++) System.out.print(array[i] + " ");
		}
		
	}
