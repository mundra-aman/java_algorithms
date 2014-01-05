/*********************************************************************
 
 Description : Array algorithm, interview problem
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


/*
 * # add1 - increments items in an array matching specified value
#
# param: arr - array of integers to manipulate
# param: val - integer, value to increment
# param: n   - integer, control value specifying behavior of manipulation
#   n == 0 means increment all occurrences of val
#
#   n > 0  means increment up to n occurrences of val
#          from left-to-right (forward)
#
#   n < 0  means increment up to n occurrences of val
#          from right-to-left (backward)
#
# return: array with proper values incremented

Examples:

# add1 [1,4,1,5,1], 1, 0 -> [2,4,2,5,2]

# add1 [1,4,1,5,1], 1, 2 -> [2,4,2,5,1]

# add1 [1,4,1,5,1], 1, -2 -> [1,4,2,5,2]
 */


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_increment_elements_interview1 {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size,\nvalue to increment,\nnumber of elements to increment\nthen\nthe array elements itself ");
		int size = Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0; i<size; i++) array[i]=Integer.parseInt(br.readLine());
		int value = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int abs_n = Math.abs(n);
		int unit =0, count=0;
		if (abs_n!=0)	unit = n/abs_n;  // convert n to 0, +1 or -1
		
		
		
		// there's a flaw in the logic: value is incremented only once, check logic for repeated elements
		
				for(int i=0; i<size; i++){
				if(array[i]==value){
					switch(unit){
					case 1: for(int j=0;j<size;j++)  { 
									if (array[j]==value) {
												array[j]++; 
												count++;
												if (count == abs_n) break;												} 
									}
							for(int j=0;j<size;j++) System.out.println(array[j]);
							break;
							
					case -1: for(int j=size;j>=0;j--){ if(array[j]==value)	array[j]++; }
					         for(int j=0;j<size;j++) System.out.println(array[j]);
					         break;
					
					default : for(int j=0;j<size;j++){ if(array[j]==value)	array[j]++; }
                              for(int j=0;j<size;j++) System.out.println(array[j]); 
					          break;
					}
				}
			}
		}
}