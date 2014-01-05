/*********************************************************************
 
 Description : A simple java program to demonstrate 2-d array initialization
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

public class array_2d_initialization2 {

	public static void main(String args[]) {
	    double m[][] = {
	      { 0*0, 1*0, 2*0, 3*0 },
	      { 0*1, 1*1, 2*1, 3*1 },
	      { 0*2, 1*2, 2*2, 3*2 },
	      { 0*3, 1*3, 2*3, 3*3 }
	    };
	    int i, j;

	    for(i=0; i<4; i++) {
	      for(j=0; j<4; j++)
	        System.out.print(m[i][j] + " ");
	      System.out.println();
	    }
	  }
	
}
