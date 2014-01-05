/*********************************************************************
 
 Description : Using break statement with labels
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class break_error {

	@SuppressWarnings("unused")
	public static void main(String args[]) {

	    one: for(int i=0; i<3; i++) {
	      System.out.print("Pass " + i + ": ");
	    }

	    for(int j=0; j<100; j++) {
	  //    if(j == 10) break one; // WRONG
	      System.out.println(j + " ");
	    }
	  }
	
}
