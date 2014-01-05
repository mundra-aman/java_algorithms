/*
 * Alice has learnt factorization recently. Bob doesn't think she has learnt it properly and hence he has decided to quiz her. Bob gives Alice a very large number and asks her to find out the number of factors of that number. To make it a little easier for her, he represents the number as a product of N numbers. Alice is frightened of big numbers and hence is asking you for help. Your task is simple. Given N numbers, you need to tell the number of distinct factors of the product of these N numbers.
 
Input:

First line of input contains a single integer T, the number of test cases.
Each test starts with a line containing a single integer N.
The next line consists of N space separated integers (Ai).
Output:

For each test case, output on a separate line the total number of factors of the product of given numbers.
Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 10
2 ≤ Ai ≤ 1000000

Example:

Input:
3
3
3 5 7
3
2 4 6
2
5 5

Output:
8
10
3
*/
 
 package codechef;

import java.io.*;
 
class codechef_school_numfact1{
	public static void main(String[] args) throws IOException {
		boolean prime[] = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		int i = 0;
		for (i = 2; i < 1000001; i++) {
			if (prime[i] == false) {
				for (int j = i * 2; j < 1000001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String s[] = str.split(" ");
			int k = 0;
			int total = 1;
		
			int a[] = new int[1000001];
			while (k < n) {
				int x = Integer.parseInt(s[k]);
				int y = 2;
				while (y <= x) {
					if (prime[x] == true) {
						if (prime[y] == false) {
							if (x % y == 0) {
								a[y] += 1;
								x = x / y;
								continue;
							}
						}
						y++;
					} else {
						a[x] += 1;
						break;
					}
				}
				k++;
			}
			for (int l = 0; l < 1000001; l++) {
				if (a[l] != 0) {
					total = total * (a[l] + 1);
				}
			}
			System.out.println(total);
		}
 
	}
} 