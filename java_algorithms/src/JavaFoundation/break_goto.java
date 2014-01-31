/*********************************************************************

 Description : Program showing break and goto statements combination usage
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class break_goto {

	@SuppressWarnings("unused")
	public static void main(String args[]) {
	    boolean t = true;

	    first: {
	      second: {
	        third: {
	          System.out.println("Before the break.");
	          if(t) break second; // break out of second block
	          System.out.println("This won't execute");
	        }
	        System.out.println("This won't execute");
	      }
	      System.out.println("This is after second block.");
	    }
	  }

}
