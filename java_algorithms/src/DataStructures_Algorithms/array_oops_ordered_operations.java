/*********************************************************************

 Description : demonstrates ordered array class and insert,delete,
 			   search operations 			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;


class OrdArray{
	private long array[];
	private int nElems;

	public OrdArray(int max){ 		//constructor
		array = new long[max];
		nElems = 0;
	}

	public int size(){ 
		return nElems; 
	}

	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		while(true){
			curIn = (lowerBound + upperBound ) / 2;

			if(array[curIn]==searchKey)		return curIn;
			else if(lowerBound > upperBound) 	return nElems;
			else{
				if(array[curIn] < searchKey)
					lowerBound = curIn + 1; // it’s in upper half
				else 	upperBound = curIn - 1; // it’s in lower half
			} // end else divide range
		} // end while
	} // end find()

	public void insert(long value){
		int j;
		for(j=0; j<nElems; j++)
			if(array[j] > value)
				break;

		for(int k=nElems; k>j; k--)
			array[k] = array[k-1];
		array[j] = value;

		nElems++;
	} // end insert()

	public boolean delete(long value){
		int j = find(value);
		if(j==nElems)
			return false;

		else{
			for(int k=j; k<nElems; k++) // move bigger ones down
				array[k] = array[k+1];
			nElems--;		//decrement size
			return true;
		}
	} // end delete()

	public void display(){
		for(int j=0; j<nElems; j++)
			System.out.print(array[j] + " "); // display it
		System.out.println("");
	}

} // end class OrdArray




public class array_oops_ordered_operations {
	public static void main(String[] args){
		int maxSize = 100;
		OrdArray arr=new OrdArray(maxSize); // create the array

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

		int searchKey = 55;

		if( arr.find(searchKey) != arr.size() )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can’t find " + searchKey);

		arr.display(); // display items

		arr.delete(00); // delete 3 items
		arr.delete(55); 
		arr.delete(99); 

		arr.display();
		//display items again
	} // end main()
} // end class OrderedApp