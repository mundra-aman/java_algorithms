/*********************************************************************
 
 Description : A program showing arithmatic expressions and 
 				calculations to find the distance travelled by 
 				light in hours.
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/


package JavaFoundation;

public class arithmatic_numberofdaysinalightyear {

	 public static void main(String args[]) {
		    int lightspeed;
		    long days;
		    long seconds; 
		    long distance;

		    // approximate speed of light in miles per second
		    lightspeed = 186000;

		    days = 1000; // specify number of days here

		    seconds = days * 24 * 60 * 60; // convert to seconds

		    distance = lightspeed * seconds; // compute distance

		    System.out.print("In " + days);
		    System.out.print(" days light will travel about ");
		    System.out.println(distance + " miles.");
		  }
	
}
