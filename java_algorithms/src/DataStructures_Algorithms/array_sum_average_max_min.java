/*********************************************************************
 
 Description : find sum,average,max/min and input results in the
 			   array itself
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_sum_average_max_min {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int array[]=new int[10];
		for(int i=0;i<6;i++)  array[i]=Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<6;i++) array[6]+=array[i];
		int average=array[6]/6;
		array[7]=average;
			
		int min=array[0],max=array[0];
		for(int i=0;i<6;i++){
			if(array[i]>max) max=array[i];
			array[8]=max;
			array[9]=min;
			if(array[i]<min) min=array[i];
		}
		
		for(int i=0;i<10;i++)  System.out.print( " "+array[i]);
			
	

}
}