/*********************************************************************
 
 Description : program to print the fibonacci series
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmatic_fibonacci {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a=0,b=1;
		System.out.print(b+" ");
		for(int i=1;i<n;i++){
			int next=a+b;
			a=b; b=next;
			System.out.print(next + " ");
		}
		
	}

}
