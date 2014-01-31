/*********************************************************************

 Description : Program to test primality of a number
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmatic_primality2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0,
		num=Integer.parseInt(br.readLine());

		for(int i=1;i<=num;i++)
			if(num%i==0){
				count++;
				if(count>2){
					System.out.print(count+"not prime");
					break;
					}
			}
			if (count<=2)  System.out.print("prime");
	}
}