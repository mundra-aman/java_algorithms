/*
 * The chef is preparing a birthday cake for one of his guests,
and his decided to write the age of the guest in candles on the cake.
There are 10 types of candles, one for each of the digits '0' through '9'.
The chef has forgotten the age of the guest, however, so doesn't know whether he has enough candles of the right types.
For example, if the guest were 101 years old, the chef would need two '1' candles and one '0' candle.
Given the candles the chef has, your task is to determine the smallest positive integer that cannot be represented with those candles.
Input:
Input will begin with an integer T≤100, the number of test cases.
Each test case consists of a single line with exactly 10 integers, each between 0 and 8, inclusive.
The first integer of each test case represents the number of '0' candles the chef has,
the second integer represents the number of '1' candles the chef has, and so on.
Output:
For each test case, output on a single line the smallest positive integer that cannot be expressed with the given candles.
Sample input:
3
2 1 1 4 0 6 3 2 2 2
0 1 1 1 1 1 1 1 1 1
2 2 1 2 1 1 3 1 1 1

Sample output:
4
10
22
 */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_CANDLE {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		while(testcases-->0){
			String str[] = br.readLine().split(" ");
			int array[] = new int[10];
			for(int i=0;i<10;i++) 	array[i]=Integer.parseInt(str[i]);

			int min=array[1], loc=1;
			for(int i=2;i<10;i++)
				if(array[i]<min){
					min= array[i];
					loc=i;
				}

			int y=0;
			if(array[0]<array[loc])
				y= (int)Math.pow(10,array[0]+1);
			else
				for(int i=0;i<=min;i++)
					y = y*10+loc;

			System.out.println(y);	 
		} // end of while

	}
}