/*********************************************************************
 
 Description : program to find if sum of divisors is equal to the 
 			   number itself
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmatic_sumofdivisors {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0, n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
			if(n%i==0)		sum+=i;
			System.out.println(sum);
		if(sum!=n)   System.out.println("sum not equal to " + n);
		else System.out.println("sum is equal to " + n);		
	}
}
