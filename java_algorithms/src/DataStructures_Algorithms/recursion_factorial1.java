/*********************************************************************
 
 Description : find factorial of a number using recursion
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

class fact{
	int fac(int num)
	{
		int result;
		if(num==1 || num==0) return 1;
		else result =fac(num-1)*num;
		return result;
	}
}

public class recursion_factorial1 {
 public static void main (String args[]){
	 fact f=new fact();
	 
	 System.out.println(f.fac(3));
	 System.out.println(f.fac(4));
	 System.out.println(f.fac(0));
	 System.out.println(f.fac(1));
 }
}
