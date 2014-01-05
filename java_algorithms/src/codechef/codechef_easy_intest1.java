/*
 *The purpose of this problem is to verify whether the method you are using 
 *to read input data is sufficiently fast to handle problems branded with 
 *the enormous Input/Output warning. 
 *You are expected to be able to process at least 2.5MB of input data per 
 *second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). 
The next n lines of input contain one positive integer ti, 
not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.

Example

Input:
7 3
1
51
966369
7
9
999996
11

Output:
4
 * 
 * */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_intest1 {

	public static void main(String args[]) throws NumberFormatException, IOException{
		
		int n,k,count=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s=br.readLine();
	    String array[];
	    array=s.split(" ");
	   	
	    n = Integer.parseInt(array[0]);
		k = Integer.parseInt(array[1]);
		for(int i=1;i<=n;i++){
				if(Integer.parseInt(br.readLine())%k==0)	count++;
				}
		
		System.out.println(count);
		
	}
}