/*********************************************************************
 
 Description : switch statement
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class while_explanation {

	public static void main(String args[]) {
	    int i, j;

	    i = 100;
	    j = 200;

	    // find midpoint between i and j
	    while(++i < --j) ; // no body in this loop

	    System.out.println("Midpoint is " + i);
	  }
	
}
