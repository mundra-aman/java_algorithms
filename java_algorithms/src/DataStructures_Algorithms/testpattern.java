package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testpattern {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int j=1;
		
		for(int k=0; k<n; k++){
			for(int i=0; i<n; i++){
				if(k==1)
					j++;
				else
					System.out.print(j++ + " * ");
			}			
			System.out.println();
				}
		j=n;
		for(int i=0;i<n;i++)
			System.out.print(++j + (" * "));
		
		
	}

}
