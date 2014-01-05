/*
 * Given the list of numbers, you are to sort them in non decreasing order.
Input

t – the number of numbers in list, then t lines follow [t <= 10^6]. 

Each line contains one integer: N [0 <= N <= 10^6]
Output

Output given numbers in non decreasing order.
Example

Input:
5
5
3
6
7
1
Output:
1
3
5
6
7
 */


package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class codechef_easy_tsort1 {  


	public static void main(String srg[]) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0;i<size;i++) 	array[i]=(Integer.parseInt(br.readLine()));

		Arrays.sort(array);

		for(int i=0;i<size;i++) 	System.out.println(array[i]);


	}
}