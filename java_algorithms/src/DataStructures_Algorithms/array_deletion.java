/*********************************************************************
 
 Description : To delete an item from an array Delete( )
 			   Here A is a linear array with N elements. 
 			   LOC is the location from where ITEM is to be deleted.
 			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


/*

1. Set ITEM = A [LOC] [Assign the element to be deleted to ITEM]
2. Repeat For I = LOC to N
3. Set A [I] = A [I+1] [Move the Ith element upwards]
    [End of For Loop]
4. Set N = N – 1 [Reset N]
5. Exit

Explanation: First, the element to be deleted is assigned to ITEM from 
location A [LOC]. Then I is set to LOC from where ITEM is to be deleted and it 
iterated to total number of elements i.e. N. During this loop, the elements 
are moved upwards. And lastly, total number of elements is decreased by 1.
 */

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_deletion {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		int i;
		for(i=0;i<size;i++) array[i]=Integer.parseInt(br.readLine());
		
		int k=1;
		while(k<size){
			for(i=0;i<size-1;i++){
				if(array[i]>array[i+1]){
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;}
				}
			k++;
			}
		System.out.println("array after sort: ");
		for(i=0;i<size;i++) System.out.print(array[i]+" ");
		
		System.out.println("enter item to delete");
		int item=Integer.parseInt(br.readLine());
			
		for(i=0;i<size-1;i++){
			if(item==array[i]){					
				array[i]=array[i+1];
				item=array[i+1];
			}
		}
			array[size-1]=0;
			
			for(i=0;i<size;i++)		System.out.print(array[i]+" ");
	}
}
