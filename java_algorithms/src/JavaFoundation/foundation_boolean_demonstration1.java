/*********************************************************************
Description: program showing the use of boolean in an if statement
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foundation_boolean_demonstration1 {

	public static void main(String args[]) {
	    boolean b;

	    b = false;
	    System.out.println("b is " + b);
	    b = true;
	    System.out.println("b is " + b);

	    // a boolean value can control the if statement
	    if(b) System.out.println("This is executed.");

	    b = false;
	    if(b) System.out.println("This is not executed.");

	    // outcome of a relational operator is a boolean value
	    System.out.println("10 > 9 is " + (10 > 9));
	  }
	
}
