/*********************************************************************
Description:  if selection statement demonstration and usage
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class if_simple_example {

	  public static void main(String args[]) {
		    int x, y;

		    x = 10;
		    y = 20;

		    if(x < y) System.out.println("x is less than y");
		    
		    x = x * 2;
		    if(x == y) System.out.println("x now equal to y");

		    x = x * 2;
		    if(x > y) System.out.println("x now greater than y, " + "value of x is now " + x);

		    // this won't display anything
		    if(x == y) System.out.println("you won't see this");
		  }
		}