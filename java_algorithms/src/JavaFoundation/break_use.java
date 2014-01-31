/*********************************************************************

 Description : A java program demonstrating break statement
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class break_use {

	public static void main(String args[]) {
	    for(int i=0; i<100; i++) {
	      if(i == 13) break; // terminate loop if i is 10
	      System.out.println("i: " + i);
	    }
	    System.out.println("Loop complete.");
	  }

}
