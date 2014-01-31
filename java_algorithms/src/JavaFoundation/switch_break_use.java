/*********************************************************************

 Description : demonstrating the use of break in a switch statement
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class switch_break_use {

	 public static void main(String args[]) {
		    for(int i=0; i<12; i++)
		      switch(i) {
		        case 0:
		        case 1:
		        case 2:
		        case 3:
		        case 4:
		          System.out.println("i is less than 5");
		          break;
		        case 5:
		        case 6:
		        case 7:
		        case 8:
		        case 9:
		          System.out.println("i is less than 10");
		          break;
		        default:
		          System.out.println("i is 10 or more.");
		      }
		  }

}
