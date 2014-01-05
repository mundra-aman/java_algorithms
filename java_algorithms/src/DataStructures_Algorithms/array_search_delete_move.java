/*********************************************************************
 
 Description : Array operations: search,delete,move
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

public class array_search_delete_move {
		public static void main(String[] args){
	long[] arr=new long[100];
	int nElems = 10;
	arr[0] = 77;
	arr[1] = 99;
	arr[2] = 44;
	arr[3] = 55;
	arr[4] = 22;
	arr[5] = 88;
	arr[6] = 11;
	arr[7] = 00;
	arr[8] = 66;
	arr[9] = 33;
	
	// display array
	int j;
	for(j=0; j<nElems; j++)  	System.out.print(arr[j] + " ");
	System.out.println("");
	
	// find an element in an array(array searching)
	long searchKey = 66;
	for(j=0; j<nElems; j++)  	if(arr[j] == searchKey)
			break;

	if(j == nElems)
	System.out.println("Can’t find" + searchKey); 
	else
	System.out.println("Found" + searchKey);
	
	// deleting an element
	for(j=0; j<nElems; j++)
		if(arr[j] == searchKey)		// find the element first
			break;
	
	for(int k=j; k<nElems-1; k++)		arr[k] = arr[k+1];					// move array elements
	nElems--;
	
	// display array after deletion
	for(j=0; j<nElems; j++)  	System.out.print( arr[j] + " ");
	} 
}