/*********************************************************************
 
 Description : program demonstrating the usage of continue statement
 				with labels
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class continue_label {

	public static void main(String args[]) {
		outer: for (int i=0; i<10; i++) {
		         for(int j=0; j<10; j++) {
		           if(j > i) {
		             System.out.println();
		             continue outer;
		           }
		           System.out.print(" " + (i * j));
		         }
		       }
		       System.out.println();
		  }
	
}
