package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class array_CountDuplicates {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			int size=Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int array[] = new int[size];
			for(int i=0;i<size;i++)  array[i]=Integer.parseInt(str[i]);
			Arrays.sort(array);

			int max=1, x=array[0];
			for(int i=0;i<size;i++)	{
				int counter=1;
				while(i<size-1 && array[i]==array[i+1]){
					counter++;
					i++;	}

				if(counter>max){
					x=array[i];
					max=counter;  }
			}
			System.out.println(x+" " +max);

		}  // end of while
	}
}
