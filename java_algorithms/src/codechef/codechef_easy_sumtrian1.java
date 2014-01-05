/*
 * Let's consider a triangle of numbers in which a number appears in the first line, 
 * two numbers appear in the second line, three in the third line, etc. 
 * Develop a program which will compute the largest of the sums of numbers that
 *  appear on the paths starting from the top towards the base, so that:
on each path the next number is located on the row below, more precisely either 
directly below or below and one place to the right;
the number of rows is strictly positive, but less than 100
all numbers are positive integers between O and 99.

Input
In the first line integer n - the number of test cases (equal to about 1000).
Then n test cases follow. Each test case starts with the number of lines which
 is followed by their content.

Output
For each test case write the determined value in a separate line.
Example

Input:
2
3
1
2 1
1 2 3
4 
1 
1 2 
4 1 2
2 3 1 1 

Output:
5
9
 */


package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
 
class codechef_easy_sumtrian1{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int testcases=Integer.parseInt(br.readLine());
			while(testcases-->0){
				int lines=Integer.parseInt(br.readLine());
				int array[][]=new int[lines][lines];
				
				for(int j=0;j<lines;j++){
					String s[]=br.readLine().split(" ");
					for(int k=0;k<s.length;k++)
						array[j][k]=Integer.parseInt(s[k]);
						}
			
				for(int j=lines-2;j>=0;j--){
					for(int k=0;k<=j;k++){
						array[j][k]+=Math.max(array[j+1][k],array[j+1][k+1]);
					}
					
				}
				System.out.println(array[0][0]);
			}
		}
	}