/*
 * You are asked to calculate factorials of some small positive integers.

Input
An integer t, 1<=t<=100, denoting the number of test cases, followed by t lines, 
each containing a single integer n, 1<=n<=100.

Output
For each integer n given at input, display a line with the value of n!
Example

Sample input:
4
1
2
5
3
Sample output:
1
2
120
6
 */

package codechef;

import java.math.BigInteger;

public class codechef_easy_smallfactorials1 {
  public static void main(String[] args) throws java.lang.Exception {
    java.io.BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    
    for(int j=0;j<n;j++) {
      int t=Integer.parseInt(br.readLine());
      BigInteger fact = BigInteger.ONE;
      for (int i=1; i<=t; i++) {
        fact = fact.multiply(BigInteger.valueOf(i));
      }
      System.out.println(fact);
    }
  }
} 