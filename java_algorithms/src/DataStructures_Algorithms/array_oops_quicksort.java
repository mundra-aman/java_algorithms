package DataStructures_Algorithms;

class ArrayIns{

	private long[] theArray;
	private int nElems;

	public ArrayIns(int max){	//constructor
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value){  	//put element into array
		theArray[nElems] = value;
		nElems++;
	}

	public void display(){
		System.out.print("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] + " "); // display it
		System.out.println("");
	}

	public void quickSort(){
		recQuickSort(0, nElems-1);
	}

	public void recQuickSort(int left, int right){
		if(right-left <= 0)		//if size <= 1,
			return;
		else{			//size is 2 or larger
			long pivot = theArray[right];
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1);	//sort left side
			recQuickSort(partition+1, right); 	// sort right side
		}
	} // end recQuickSort()

	public int partitionIt(int left, int right, long pivot){
		int leftPtr = left-1;
		int rightPtr = right;
		while(true){		//find bigger item
			while( theArray[++leftPtr] < pivot ); 
			while(rightPtr > 0 && theArray[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
				break;
			
			else
				swap(leftPtr, rightPtr);
		} // end while(true)
		
		swap(leftPtr, right);	//restore pivot
		return leftPtr;		//return pivot location
	} // end partitionIt()

	public void swap(int dex1, int dex2) // swap two elements
	{
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;

	} // end swap(

} // end class ArrayIns


public class array_oops_quicksort {
	public static void main(String[] args){
		int maxSize = 16;
		ArrayIns arr;
		arr = new ArrayIns(maxSize); // create array
		for(int j=0; j<maxSize; j++) // fill array with
		{
			//random numbers
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display(); 	
		arr.quickSort();	//quicksort them
		arr.display();
		
	} // end main()
}
//end class QuickSort1App