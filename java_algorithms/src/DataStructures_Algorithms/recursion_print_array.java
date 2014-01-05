/*********************************************************************
 
 Description : print an array using recursion
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;


class array{
	int values[];
	
	array(int i){
		values=new int[i];
			}
	
	void printarray(int i){
		if(i==0) return;
		else printarray(i-1);
	System.out.println(values[i-1]);
	}
}

public class recursion_print_array {
	public static void main(String args){
		array obj=new array(10);
		int i;
		for(i=0;i<10;i++)	obj.values[i]=i;
		obj.printarray(10);
		
	}
}