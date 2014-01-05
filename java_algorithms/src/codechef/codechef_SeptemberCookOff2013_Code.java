package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codechef_SeptemberCookOff2013_Code {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		while(testcases-->0){
			String str[]=br.readLine().split(" ");

			int n=Integer.parseInt(str[0]);
			int k=Integer.parseInt(str[1]);
			int answer=Integer.parseInt(str[2]);
			
			String getarray[]=br.readLine().split(" ");
			int array[]=new int[n];
					
			String opr=br.readLine();
			
			for(int i=0;i<k;i++)
				for(int j=0;j<n;j++){
					array[j]=Integer.parseInt(getarray[j]);
					if(opr.equals("AND"))
						answer=answer&array[j];
					else if(opr.equals("OR"))
						answer=answer|array[j];
					else 
						answer=answer^array[j];
					}
			
			System.out.println(answer);
		}// end of while	
	}
}
