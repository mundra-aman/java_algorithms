/*********************************************************************

 Description : A java program demonstrating linked list implementation
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

public class linkedlist_implementation {

	    private static Link last;
	    private static Link first;

	    public static void main(String[] args) {

	        //Inserting
	        for(int i=0;i<5;i++){
	            Link.insert(i+5);
	        }
	        Link.printList();

	        //Deleting
	        Link.deletefromFirst();
	        Link.printList();
	    }  // end of main method


// Link class
	    protected  static class Link {
	        private int data;
	        private Link nextlink;

	        // constructor
	        public Link(int d1) {
	            this.data = d1;
	        }

	        // insert method
	        public static void insert(int d1) {
	            Link a = new Link(d1);
	            a.nextlink = null;
	            if (first != null) {
	                last.nextlink = a;
	                last = a;
	            } else {
	                first = a;
	                last = a;
	            }
	            System.out.println("Inserted -:"+d1);
	        }

	        // delete method
	        public static void deletefromFirst() {
	            if(null!=first)
	            {
	                System.out.println("Deleting -:"+first.data);
	                first = first.nextlink;
	            }
	            else{
	                System.out.println("No elements in Linked List");
	            }
	        }

	        // print method
	        public static void printList() {
	            System.out.println("Elements in the list are");
	            System.out.println("-------------------------");
	            Link temp = first;
	            while (temp != null) {
	                System.out.println(temp.data);
	                temp = temp.nextlink;
	            }
	        }

	    } // end of link class

	} // end of main class