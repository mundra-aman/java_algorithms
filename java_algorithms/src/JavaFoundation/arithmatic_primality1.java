/*********************************************************************
 
 Description : program to test primality of a number
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmatic_primality1 {

	public static void main(String args[]) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
	    boolean isPrime = true;
	    
	    for(int i=2; i <= num/i; i++) {
	      if((num % i) == 0) {
	        isPrime = false;
	        break;
	      }
	    }
	    if(isPrime) System.out.println("Prime");
	    else System.out.println("Not Prime");
	  }
	
}
