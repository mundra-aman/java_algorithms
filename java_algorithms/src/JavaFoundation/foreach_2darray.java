/*********************************************************************
Description: program demonstrating the extended for loop
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foreach_2darray {

	public static void main(String args[]) {
	    int sum = 0;
	    int nums[][] = new int[3][5];

	    // give nums some values
	    for(int i = 0; i < 3; i++)
	      for(int j=0; j < 5; j++)
	        nums[i][j] = (i+1)*(j+1);

	    // use for-each for to display and sum the values
	    for(int x[] : nums) {
	      for(int y : x) {
	        System.out.println("Value is: " + y);
	        sum += y;
	      }
	    }
	    System.out.println("Summation: " + sum);
	  }
}
