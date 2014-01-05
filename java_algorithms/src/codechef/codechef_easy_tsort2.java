

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_tsort2 {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		int array[] = new int[t];
		for (int i=0; i<t; i++) array[i] = Integer.parseInt(br.readLine());
		
		// bubble sort
		for (int i=0; i<t; i++){
			for (int j=i+1; j<t; j++){
				if (array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}

		for (int i=0; i<t; i++) 	System.out.println(array[i]);
	}
}
