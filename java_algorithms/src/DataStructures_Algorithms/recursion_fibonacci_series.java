/*********************************************************************
 
 Description : printing fibonacci series using recursion
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion_fibonacci_series {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter the limit of series");
		int num=Integer.parseInt(br.readLine());
		fibonacci(num);
		}
	
	
	public static int fibonacci(int num){
		int fib=1;
		if(num<1)
			return 0;
		else 
			{
			System.out.print(fib+" ");
			fib=fibonacci(num-2)+fibonacci(num-1);
			return fib;
			}
		}

}