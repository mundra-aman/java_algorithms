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
# return: arr with proper values incremented

Examples:

# add1 [1,4,1,5,1], 1, 0 -> [2,4,2,5,2]

# add1 [1,4,1,5,1], 1, 2 -> [2,4,2,5,1]

# add1 [1,4,1,5,1], 1, -2 -> [1,4,2,5,2]
 */


package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_increment_elements_interview2 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for (int i=0;i<size;i++) array[i]=Integer.parseInt(br.readLine());
		int value = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int start,stop,step;
		
		if (n>=0)  { start=0; stop=size; step=1; }
		
		else{
			n=Math.abs(n);
			start=size-1; stop=0; step=-1;
					}
		
		int count=0;
		for (int i=start; i!=stop; i+=step){
			if(array[i]==value){
				array[i]++;
				count++;
				if(count==n) break;
			}
		}
	
		for(int i=0; i<size; i++) System.out.println(array[i]);
	
	}
}