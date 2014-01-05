/*********************************************************************
 
 Description : Assignment operator demonstration
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package JavaFoundation;

public class operator_assignment {

	  public static void main(String args[]) {
		    int a = 1;
		    int b = 2;
		    int c = 3;

		    a += 5;
		    b *= 4;
		    c += a * b;
		    c %= 6;
		    System.out.println("a = " + a);
		    System.out.println("b = " + b);
		    System.out.println("c = " + c);
		  }
	
}
