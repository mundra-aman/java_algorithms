/*********************************************************************
 
 Description : print numbers from user input using recursion
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion_print_numbers_userinput {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number: ");
		int num=Integer.parseInt(br.readLine());
		System.out.println(display(num));
		display(num);
		}
	
	
	static int display(int num){
		if(num==1)
			return 1;
		else System.out.print(num+" ");
			num=display(num-1);
			return num;
			}
	
	
	

}
