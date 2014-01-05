/*********************************************************************
 
 Description : A simple java program to show the usage of continue 
 			   statement to run the loop again before the execution 
 			   of other statements within the same loop.

 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class continue_demonstration {

	public static void main(String args[]) {
	    for(int i=0; i<10; i++) {
	      System.out.print(i + " ");
	      if (i%2 == 0) continue;
	      System.out.println("");
	    }
	  }
	
}

/* 
 continue keyword here stops executing the statements further 
 in a loop, and executes the loop again hence different from 
 the break keyword
*/