/*********************************************************************

 Description : Return keyword demonstration
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class return_demonstration {

	public static void main(String args[]) {
	    boolean t = true;

	    System.out.println("Before the return.");

	    if(t) return; // return to caller

	    System.out.println("This won't execute.");
	  }

}
