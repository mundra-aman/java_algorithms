/*********************************************************************
Description: program showing for loop without conditions
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class for_conditions {

	public static void main(String args[]) {
	    int i;
	    boolean done = false;

	    i = 0;
	    for( ; !done; ) {
	      System.out.println("i is " + i);
	      if(i == 10) done = true;
	      i++;
	    }
	  }
	
}
