/*********************************************************************
 
 Description : A simple java program to calculate the factorial 
 				of a number
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmatic_factorial {
public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	long fact=1;
	
	if(n==0) System.out.println(fact);
		else	
			for(int i=1;i<=n;i++)		
				fact*=i;
 	System.out.println(fact);
 	
	}
}