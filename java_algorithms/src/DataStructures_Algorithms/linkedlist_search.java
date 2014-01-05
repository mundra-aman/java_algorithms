/*********************************************************************

 Description : searching in a linked list
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

class link{
	public int iData;
	public double dData;
	public link next;

	public link(int id, double dd){
		iData = id;
		dData = dd;
	}

	public void displayLink(){
		System.out.print("{" + iData + "," + dData + "}");
	}
} // end class Link

class linklist{
	private link first;

	public linklist(){
		first = null;
	}

	public void insertFirst(int id, double dd){
		link newLink = new link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public link find(int key){
		link current = first;
		while(current.iData != key){
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public link delete(int key){
		link current = first;
		link previous = first;
		while(current.iData != key){
			if(current.next == null)
				return null;
			else
			current = current.next;
			}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	public void displayList(){
		System.out.print("List (first-->last): ");
		link current = first;

		while(current != null){
			current.displayLink();
			current = current.next; // move to next link
		}
		System.out.println("");
	}
} // end class LinkList


public class linkedlist_search{
	public static void main(String[] args){
		linklist theList = new linklist(); // make list
		theList.insertFirst(22,2.99);
		theList.insertFirst(44,2.99);
		theList.insertFirst(66,6.99);
		theList.insertFirst(88,8.99);
		
		theList.displayList();


		link f = theList.find(44);
		//find item
		if( f != null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can’t find link");
		
		link d = theList.delete(66);		//delete item
		if( d != null )
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can’t delete link");
	
			theList.displayList();

	}
} // end main()