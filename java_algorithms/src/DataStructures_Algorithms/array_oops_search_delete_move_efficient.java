/*********************************************************************

 Description : Array operations: search,delete,move using object
 			   oriented concepts efficiently
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class HighArray{

	private long array[];		// member variables
	private int nElems;
	
	// methods
	
	public HighArray(int max){     //constructor
		array = new long[max];
		nElems = 0;   }

	// search method
	public boolean find(long searchKey){
		int j;
		for(j=0; j<nElems; j++)
			if(array[j] == searchKey)	break;

		if(j == nElems)		return false;
		else	return true;
	}

	// insert method
	public void insert(long value){
		array[nElems] = value;
		nElems++;
	}

	// delete method
	public boolean delete(long value) {
		int j;
		for(j=0; j<nElems; j++)
			if( value == array[j] )
				break;

		if(j==nElems)	return false;
		else {
			for(int k=j; k<nElems; k++) // move higher ones down
				array[k] = array[k+1];

			nElems--;
			return true;
		}
	}

	// display method
	public void display(){
		for(int j=0; j<nElems; j++)
			System.out.print(array[j] + " "); // display it
		System.out.println("");
	}
}



// main class
public class array_oops_search_delete_move_efficient {
	public static void main(String[] args){
		
		int maxSize = 100;
		HighArray arr=new HighArray(maxSize); // create the array
		
		arr.insert(77); // insert 10 items
		arr.insert(99); 
		arr.insert(44); 
		arr.insert(55); 
		arr.insert(22); 
		arr.insert(88); 
		arr.insert(11); 
		arr.insert(00); 
		arr.insert(66); 
		arr.insert(33); 

		arr.display(); // display items

		int searchKey = 35;

		if( arr.find(searchKey) )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can’t find " + searchKey);

		arr.delete(00);
		arr.delete(55);
		arr.delete(99);

		arr.display();

	} // end main()
} // end class HighArrayApp