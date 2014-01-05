/*********************************************************************
Description: program showing auto-casting
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foundation_casts_promotion {

	 public static void main(String args[]) {
		    byte b = 42;
		    char c = 'a';
		    short s = 1024;
		    int i = 50000;
		    float f = 5.67f;
		    double d = .1234;
		   
		    double result = (f * b) + (i / c) - (d * s);
		    
		    System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		    System.out.println("result = " + result);
		  }
	
}
