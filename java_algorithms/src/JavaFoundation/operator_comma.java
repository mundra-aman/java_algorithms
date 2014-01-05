/*********************************************************************
 
 Description : multiple conditions in a for loop statement and use 
 				of comma operartor
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package JavaFoundation;

public class operator_comma {

	 public static void main(String args[]) {
		    int a, b;

		    for(a=1, b=4; a<b; a++, b--) {
		      System.out.println("a = " + a);
		      System.out.println("b = " + b);
		    }
		  }
	
}
