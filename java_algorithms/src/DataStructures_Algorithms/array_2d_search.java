/*********************************************************************

 Description : Linear search in 2d array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_2d_search {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int array[][]= new int[5][5];
		int i=0, j=0, k=0;

		for(i=0; i<5; i++)
			for(j=0; j<5; j++) {
				array[i][j] = k;
				k++;
			}

		for(i=0; i<5; i++) {
			for(j=0; j<5; j++)
				System.out.print(array[i][j]+" ");
			System.out.println(" ");
		}

		// search logic
		System.out.println("Enter value to be searched");
		boolean found=false;
		int item=Integer.parseInt(br.readLine());
		 for(i=0; i<5; i++)
			for(j=0; j<5; j++)
				if(item==array[i][j]){  found=true;  break; }


		if(found)   System.out.println("item found at " +i+j);
		else System.out.println("not found");

	} // end of main method
} // end of class
