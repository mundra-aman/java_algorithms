package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursion_factorial2 {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		int num=Integer.parseInt(br.readLine());
		System.out.println(fact(num));
	}

	private static int fact(int num) {
		int factorial=1;
		if(num<=1) return factorial;
		
		else{
			factorial=fact(num-1)*num;
			return factorial;
			}		
	}

}
