/*********************************************************************

 Description : Program demonstrating the usage of break statement
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package JavaFoundation;

public class break_demonstration {

	public static void main(String args[]) {
		int i = 0;

		while(i < 100) {
			if(i == 11) break; // terminate loop if i is 11
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Loop complete.");
	}
}
