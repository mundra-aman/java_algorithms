/*********************************************************************
Description:  A simple java program to demonstrate the lifetime of 
				variable in a block
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/


package JavaFoundation;

public class foundation_variable_lifetime {

	public static void main(String args[]) {
	    int x; 

	    for(x = 0; x < 3; x++) {
	      int y = -1; // y is initialized each time block is entered
	      System.out.println("y iz: " + y); // this always prints -1
	      y = 100; 
	      System.out.println("y is now: " + y);
	    }
	  }
	
}
