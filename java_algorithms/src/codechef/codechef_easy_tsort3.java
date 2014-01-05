package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class codechef_easy_tsort3 {  
	public static void main(String srg[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0;i<size;i++) 	array[i]=(Integer.parseInt(br.readLine()));

		Arrays.sort(array);
		
		PrintWriter p = new PrintWriter(System.out, false);
		for(int i=0;i<size;i++)		p.println(array[i]);
		p.flush();
		
	}
}  