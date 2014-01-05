/*********************************************************************
 
 Description : ternary operator demonstration
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class operator_ternary {

	public static void main(String args[]) {
	    int i, k;

	    i = 10;
	    k = i < 0 ? -i : i; // get absolute value of i
	    System.out.print("Absolute value of ");
	    System.out.println(i + " is " + k);

	    i = -10;
	    k = i < 0 ? -i : i; // get absolute value of i
	    System.out.print("Absolute value of ");
	    System.out.println(i + " is " + k);
	  }
	
}
