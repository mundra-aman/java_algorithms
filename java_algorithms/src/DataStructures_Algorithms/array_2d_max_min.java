/*********************************************************************
 
 Description : A simple java program to find max/min in a 2d array
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

public class array_2d_max_min {
	public static void main(String args[]){
		   int array[][]= new int[5][5];		
		    int i=0, j=0, k=0;

		    for(i=0; i<5; i++) 
		      for(j=0; j<5; j++) {
		        array[i][j] = k;		
		        k++;
		      }
		    
		    for(i=0; i<5; i++) {
			      for(j=0; j<5; j++) 
			    	  System.out.print(array[i][j]+" ");
			      		System.out.println(" ");
		    }
			      
		    
		    int max=array[0][0];
		    int min=array[0][0];

		    for(i=0; i<5; i++) {
		      for(j=0; j<5; j++){
		    	  if (array[i][j]>max)
		    		  max=array[i][j];
		    	  else if (array[i][j]<min)
		    		  min=array[i][j];
		    		  	}
		      }
		      
		    System.out.println("max is "+ max);
		    System.out.println("min is "+ min);
	}
	
}
