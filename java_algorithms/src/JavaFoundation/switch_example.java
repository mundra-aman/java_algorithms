/*********************************************************************

 Description : switch statement demonstration
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class switch_example {

	public static void main(String args[]) {
	    for(int i=0; i<6; i++)
	      switch(i) {
	        case 0:
	          System.out.println("i is zero.");
	          break;
	        case 1:
	          System.out.println("i is one.");
	          break;
	        case 2:
	          System.out.println("i is two.");
	          break;
	        case 3:
	          System.out.println("i is three.");
	          break;
	        default:
	          System.out.println("i is greater than 3.");
	      }
	  }

}
