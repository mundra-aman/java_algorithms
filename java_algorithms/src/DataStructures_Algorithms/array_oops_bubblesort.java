/*********************************************************************

 Description : Bubble sorting an array			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class ArrayBub
{
	private long a[];
	private int nElems;

	public ArrayBub(int max){   //constructor
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}

	public void display(){
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	public void bubbleSort(){
		int out, in;
		for(out=nElems-1; out>1; out--)
			for(in=0; in<out; in++)
				if( a[in] > a[in+1] )
					swap(in, in+1);
	} // end bubbleSort()

	private void swap(int one, int two){
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

} // end class ArrayBub


public class array_oops_bubblesort {
	public static void main(String[] args){
		int maxSize = 100;

		ArrayBub arr;

		arr = new ArrayBub(maxSize); // create the array
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

		arr.bubbleSort(); // bubble sort them
		arr.display();
		//display them again

	} // end main()
} // end class BubbleSortApp