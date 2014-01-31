/*********************************************************************
Description: program demonstrating nested for loop
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class for_nested {

	public static void main(String args[]) {
	    int i, j;

	    for(i=0; i<10; i++) {
	      for(j=i; j<10; j++)
	      System.out.print(".");
	      System.out.println();
	    }
	  }

}
