/*********************************************************************
 
 Description : A simple java program to show initialization of a 1
 				dimensional array (not so effective way)
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

public class array_initialization {

	public static void main(String args[]) {
	    int month_days[];
	    month_days = new int[12];
	    month_days[0] = 31;
	    month_days[1] = 28;		// each array index is called exhaustively and filled with the value
	    month_days[2] = 31;
	    month_days[3] = 30;
	    month_days[4] = 31;
	    month_days[5] = 30;
	    month_days[6] = 31;
	    month_days[7] = 31;
	    month_days[8] = 30;
	    month_days[9] = 31;
	    month_days[10] = 30;
	    month_days[11] = 31;
	    System.out.println("April has " + month_days[3] + " days.");
	  }
	
}
