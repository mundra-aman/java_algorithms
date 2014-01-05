/*********************************************************************
 
 Description : A simple java program to show initialization of a 1
 				dimensional array in a single line.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

public class array_initialization_single_statement {

	public static void main(String args[]) {
		// array elements are filled while declaring the array
	    int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  // declaration and initialization
	    System.out.println("April has " + month_days[3] + " days.");
	  }
	
}
