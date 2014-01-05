/*********************************************************************
 
 Description : Using break statement in nested loops 
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class break_nested_loops {

	public static void main(String args[]) {
	    for(int i=0; i<3; i++) {
	      System.out.print("Pass " + i + ": ");
	      for(int j=0; j<100; j++) {
	        if(j == 10) break; // terminates inner loop if j is 10
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	    System.out.println("Loops complete.");
	  }
	
}
