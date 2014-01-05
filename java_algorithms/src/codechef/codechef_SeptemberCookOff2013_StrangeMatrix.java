package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_SeptemberCookOff2013_StrangeMatrix {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			String str[]=br.readLine().split(" ");
			int m=Integer.parseInt(str[0]);
			int n=Integer.parseInt(str[1]);
			int k=1;
			
			int A[][]=new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					A[i][j]=k;
					k++;
				   }
				}
			
			k=1;
			int B[][]=new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					B[i][j]=k;
					k++;
				   }
				}
			
			int count=0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(A[i][j]==B[i][j]);
					  count++;
				   }
				}
			System.out.println(count);
		}
	}
}
