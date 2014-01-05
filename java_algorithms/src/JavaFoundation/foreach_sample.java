/*********************************************************************
Description: program on extended for loop
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foreach_sample {

	public static void main(String args[]) {  
	    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  
	    int sum = 0;  
	 
	    // use for-each style for to display and sum the values 
	    for(int x : nums) {  
	      System.out.println("Value is: " + x); 
	      sum += x;  
	    }  
	 
	    System.out.println("Summation: " + sum); 
	  }  
	
}
