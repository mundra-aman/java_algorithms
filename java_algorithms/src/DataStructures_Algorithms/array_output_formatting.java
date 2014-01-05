package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_output_formatting {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=0,j=0;
		String cnames[][] =  { 
				{ "CITY/DAY", "sun", "mon", "tue", "wed", "thur", "avg", "max/min"},
				{ "city1","","","","","","",""  },
				{ "city2","","","","","","",""  },
				{ "city3","","","","","","",""  },
				{ "city4","","","","","","",""  },
				{ "city5","","","","","","",""  },
		       };
		
		for(i=0;i<6;i++){
			for(j=0;j<8;j++) System.out.print(cnames[i][j]+" ");
			System.out.println("");
		}
		
			double temp[][]=new double[5][5];
					for(i=0;i<5;i++){
					System.out.println("enter the temperatures of " + cnames[i+1][0]);
					for(j=0;j<5;j++)
						temp[i][j]=Integer.parseInt(br.readLine());
						}
								
				double max=temp[0][0];
				double min=temp[0][0];
				double sum=0,avg=0;
								
				for( i=0;i<5;i++){
					for( j=0;j<5;j++){
						sum+=temp[i][j];
						if(max<temp[i][j]) max=temp[i][j];
						if(min>temp[i][j]) min=temp[i][j];
								}
					avg=(sum)/5;
					temp[i][6]=avg;
					temp[i][7]=max;
					temp[i][8]=min;
					System.out.print(temp[i][j]);
					System.out.println("");
					sum=0;
					}
				
	}
}
