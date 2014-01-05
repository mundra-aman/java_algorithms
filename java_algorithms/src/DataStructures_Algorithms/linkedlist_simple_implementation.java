/*********************************************************************

 Description : linked list implementation
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class Link{
	public int iData;      //data item (key)
	public double dData;  //data item
	public Link next; 		//next link in list

	public Link(int id, double dd){ // constructor
		iData = id; //initialize data
		dData = dd; 
		// ‘next’ is automatically set to null
	}

	public void displayLink(){
		System.out.print("{" + iData + "," + dData + "}");
	}
} // end class Link


class LinkList{
	private Link first; 	//ref to first link on list

	public LinkList(){ 		//constructor
		first = null;		//no items on list yet
	}

	public boolean isEmpty(){		//true if list is empty
		return (first==null);
	}


	// method to insert at start of list
	public void insertFirst(int id, double dd){
		Link newLink = new Link(id, dd);		//make new link
		newLink.next = first;				//newLink --> old first
		first = newLink;			//first --> newLink
	}

	public Link deleteFirst(){ 	//delete first item
		Link temp = first;		//(assumes list not empty)
		first = first.next;		//save reference to link
		return temp;						//delete it: first-->old next
		//return deleted link
	}


	public void displayList(){
		System.out.print("List (first-->last): ");
		Link current = first; 		//start at beginning of list
		while(current != null){ 	//until end of list,
			current.displayLink();		//print data
			current = current.next; 	// move to next link
		}
		System.out.println("");
	}
} // end class LinkList



public class linkedlist_simple_implementation {
	public static void main(String[] args){
		LinkList List = new LinkList(); 	// make new list
		List.insertFirst(22,2.99);
		List.insertFirst(44,4.99);		//insert four items
		List.insertFirst(66,6.99);
		List.insertFirst(88,8.99);

		List.displayList();		//display list

		while( !List.isEmpty() ){ 	//until it’s empty,
			Link aLink = List.deleteFirst();		//delete link
			System.out.print("Deleted "); 		
			aLink.displayLink();			//display it
			System.out.println("");
		}
		List.displayList();		//display list
	} 	// end main()
}	//end class LinkList