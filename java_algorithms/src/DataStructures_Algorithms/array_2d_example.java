/*********************************************************************
 
 Description : A simple java program to demonstrate 2-d array initialization
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

public class array_2d_example {

	public static void main(String args[]) {
	    int twoD[][]= new int[4][5];		// declaration and initialization in a single statement
	    int k = 0;

	    for(int i=0; i<4; i++) 
	      for(int j=0; j<5; j++) {
	        twoD[i][j] = k;		// arrays printed row wise
	        k++;
	      }

	    for(int i=0; i<4; i++) {
	      for(int j=0; j<5; j++)
	        System.out.print(twoD[i][j] + " ");
	      System.out.println();
	    }
	  }
	
}
