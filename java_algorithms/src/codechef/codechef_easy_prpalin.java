/*
 * An integer is said to be a palindrome if it is equal to its
reverse. For example, 79197 and 324423 are palindromes. In this task
you will be given an integer N, 1 ≤ N ≤ 1000000. You must find
the smallest integer M ≥ N such that M is a prime number and M is a
palindrome.
For example, if N is 31 then the answer is 101.
Input
A single integer N, (1 ≤ N ≤ 1000000), on a single line.
Output
Your output must consist of a single integer, the smallest prime
palindrome greater than or equal to N.
Example
Input:
31
Output:
101

 */

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_prpalin {

	// check palindrome
	public static boolean isPalindrome(String num){
		for (int i = 0; i < num.length()/2 ; i++){
			if(num.charAt(i) != num.charAt(num.length()-i-1))
				return false;
		}
		return true;
	}

	// check prime
	public static boolean isPrime(int num){
		if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
			return false;

		for (int i = 7 ; i <= num/2 ; i = i + 2)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}



	// main method
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		if(num%2 == 0)
			num++;

		while(true){
			if(isPalindrome(num+"")){
				if(isPrime(num)){
					System.out.println(num);
					break;
				}
			}	
			num += 2;
		}
	}
}
