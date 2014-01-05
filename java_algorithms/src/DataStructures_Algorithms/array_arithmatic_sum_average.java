/*********************************************************************
 
 Description : Arithmatic processing on an array(sum & average)
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package DataStructures_Algorithms;

public class array_arithmatic_sum_average {

	 public static void main(String args[]) {
		    double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
		    double result = 0;
		    int i;
		    
		    for(i=0; i<5; i++) 
		      result = result + nums[i];

		    System.out.println("Average is " + result / 5);
		  }
	
}
