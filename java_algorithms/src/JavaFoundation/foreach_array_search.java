/*********************************************************************
Description: linear searching an array using extended for loop
Author: 	 Amandeep Singh
Website: 	 http://kodevelop.com/
Email:  	 aman.adsm@gmail.com
github: 	 https://github.com/aman-devy

**********************************************************************/

package JavaFoundation;

public class foreach_array_search {

public static void main(String args[]) {
    int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
    int val = 5;
    boolean found = false;

    // use for-each style for-loop to search nums for val
    for(int x : nums) {
      if(x == val) {
        found = true;
        break;
      }
    }

    if(found)
      System.out.println("Value found!");
  }
}
