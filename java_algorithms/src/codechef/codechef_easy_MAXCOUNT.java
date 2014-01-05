/*
 * Given an array A of length N, your task is to find the element which repeats in A maximum number of times as well as the corresponding count. In case of ties, choose the smaller element first.
Input
First line of input contains an integer T, denoting the number of test cases. Then follows description of T cases. Each case begins with a single integer N, the length of A. Then follow N space separated integers in next line. Assume that 1 <= T <= 100, 1 <= N <= 100 and for all i in [1..N] : 1 <= A[i] <= 10000
Output
For each test case, output two space separated integers V & C. V is the value which occurs maximum number of times and C is its count.
Example
Input:
2
5
1 2 3 2 5
6
1 2 2 1 1 2

Output:
2 2
1 3

Description:
In first case 2 occurs twice whereas all other elements occur only once. 
In second case, both 1 and 2 occur 3 times but 1 is smaller than 2.
 */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class codechef_easy_MAXCOUNT {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			int size=Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int array[] = new int[size];
			for(int i=0;i<size;i++)  array[i]=Integer.parseInt(str[i]);
			Arrays.sort(array);

			int max=1, x=array[0];
			for(int i=0;i<size;i++)	{
				int counter=1;
				while(i<size-1 && array[i]==array[i+1]){
					counter++;
					i++;	}

				if(counter>max){
					x=array[i];
					max=counter;  }
			}
			System.out.println(x+" " +max);

		}  // end of while
	}
}