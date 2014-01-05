/*********************************************************************
Description: program showing variable initialization
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foundation_dynamic_initialization {

	 public static void main(String args[]) {
	      double a = 3.0, b = 4.0;
	      
	      // c is dynamically initialized
	      double c = Math.sqrt(a * a + b * b);

	      System.out.println("Hypotenuse is " + c);
	    }
	
}
