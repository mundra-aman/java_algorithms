package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_sort_QuickSort {
	
	
	public void partition(){
			
		
	}
	
	
	public void Qsort(int size){
			
		
	}
	
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int size=Integer.parseInt(br.readLine());
	int array[]=new int[size];
	
	for(int i=0;i<size;i++) array[i]=(int)(java.lang.Math.random()*99);
	for(int i=0;i<size;i++) System.out.print(array[i]+" ");
	
	
	
	
	System.out.print("\nsorted array: ");
	for(int i=0;i<size;i++) System.out.print(array[i]+" ");
	}

}
