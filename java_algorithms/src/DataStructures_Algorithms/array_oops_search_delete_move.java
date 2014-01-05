/*********************************************************************

 Description : Array operations: search,delete,move using object
 			   oriented concepts
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class LowArray{

	private long array[] ;

	public LowArray(int size) 		// constructor
	{ array = new long[size]; }

	public void setElem(int index, long value)
	{ array[index] = value; }

	public long getElem(int index)
	{ return array[index]; }



	public class array_search_delete_move_oops {
		public void main(String args[]){

			LowArray arr=new LowArray(100);
			int nElems = 0;
			int j;

			arr.setElem(0,77);
			arr.setElem(1,99);
			arr.setElem(2,44);
			arr.setElem(3,55);
			arr.setElem(4,22);
			arr.setElem(5,88);
			arr.setElem(6,11);
			arr.setElem(7,00);
			arr.setElem(8,66);
			arr.setElem(9,33);

			nElems = 10;

			// display items
			for(j=0; j<nElems; j++)		System.out.print(arr.getElem(j) + " ");
			System.out.println("");

			// search item
			int searchKey = 26;
			for(j=0; j<nElems; j++)		
				if(arr.getElem(j) == searchKey) 
					break;
			
			if(j == nElems)
				System.out.println("Can’t find " + searchKey);
			else
				System.out.println("Found "+ searchKey);

			// delete and move items
			for(j=0; j<nElems; j++)
				if(arr.getElem(j) == 55)
					break;

			for(int k=j; k<nElems; k++)
				arr.setElem(k, arr.getElem(k+1) );

			nElems--;

			// display items
			for(j=0; j<nElems; j++)
				System.out.print( arr.getElem(j) + " ");
		}
	} // end main()
} // end class LowArrayApp