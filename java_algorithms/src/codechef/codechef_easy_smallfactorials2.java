package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class codechef_easy_smallfactorials2 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BigInteger fact[] = new BigInteger[105];

		for(int i = 1; i <= 100; i++){
			BigInteger res = new BigInteger("1");
			for(int j = 1; j <= i; j++){
				res = res.multiply(BigInteger.valueOf(j));
			}
			fact[i] = res;
		}	

		int n = Integer.parseInt(br.readLine());
		int x;
		for(int i = 0; i < n; i++){
			x = Integer.parseInt(br.readLine());
			System.out.println(fact[x]);
		}
	}
}