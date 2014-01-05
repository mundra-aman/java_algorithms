package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_easy_sumtrian3 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
				
		while(testcases>0){
			int lines=Integer.parseInt(br.readLine());
			int array[][]=new int[lines][lines];
			
			for(int i=0;i<lines;i++)
				for(int j=0;j<=i;j++){
					array[i][j]=Integer.parseInt(br.readLine());
				}
		
		
		for(int i=lines-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				int s = array[i][j] + array[i+1][j];
				int r = array[i][j] + array[i+1][j+1];
				array[i][j]= s>r?s:r;
					}
				}
		testcases--;
		System.out.print(array[0][0]);
		}
		
	}
}