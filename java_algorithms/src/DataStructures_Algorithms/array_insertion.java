/*********************************************************************
 
 Description : Insert item into a sorted array InsertSorted( )
 			   Here A is a sorted linear array (in ascending order) 
 			   with N elements. ITEM is the value to be inserted.
 			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

/*

1. Set I = N [Initialize counter]
2. Repeat While (ITEM < A [I]) and (I >= 1)
3. Set A [I+1] = A [I] [Move elements downward]
4. Set I = I – 1 [Decrease counter by 1]
    [End of While Loop]
5. Set A [I+1] = ITEM [Insert element]
6. Set N = N + 1 [Reset N]
7. Exit

Explanation: Here A is a sorted array stored in memory. This algorithm 
inserts a data element ITEM into the (I + 1)th position in an array A. 
I is initialized from N i.e. from total number of elements. 
ITEM is compared with each element until it finds an element which is 
smaller than A[I] or it reaches the first element. During this process, 
the elements are moved downwards and I is decremented. When it finds an 
element smaller then ITEM, it inserts it in the next location i.e. I + 1 
because I will be one position less where ITEM is to be inserted. 
And finally, total number of elements is increased by 1.
*/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_insertion {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int size=x+1;
		int array[]=new int[size];
		int i,temp=0;
		for(i=0;i<size-1;i++) array[i]=Integer.parseInt(br.readLine());
		array[size-1]=100000;
		
		int k=1;
		while(k<size-1){
			for(i=0;i<size-2;i++){
				if(array[i]>array[i+1]){
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;}
				}
			k++;
		    }
		System.out.println("array after sort");
		for(i=0;i<size-1;i++) System.out.print(array[i]);
		
		System.out.println("enter the item to insert");
		int item=Integer.parseInt(br.readLine());
		
		for(i=0;i<size;i++){
			if(item<array[i]){ 
				temp=array[i]; 
				array[i]=item; 
				item=temp; }
			}
		
		for(i=0;i<size;i++) System.out.println(array[i]);
		
	}	
}