/*********************************************************************
Description:  A simple java program to demonstrate the scope of a variable
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foundation_variable_scope {

	 public static void main(String args[]) {
	     @SuppressWarnings("unused")
		int bar = 1;
	     {              // creates a new scope
	  //    int bar = 2; // Compile time error -- bar already defined!
	    	 int foo =2;
	    	 System.out.println(foo);
	     }
	   }
	
}
