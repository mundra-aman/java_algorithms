package DataStructures_Algorithms;

class Queue{
	private int maxSize;
	private long queArray[];
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s){	//constructor
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j){	//put item at rear of queue
		if(rear == maxSize-1)	//deal with wrap around
			rear = -1;
		queArray[++rear] = j;	//increment rear and insert
		nItems++;
	}

	public long remove(){		//take item from front of queue
		long temp = queArray[front++]; // get value and incr front
		if(front == maxSize)	//deal with wraparound
			front = 0;
		nItems--;
		return temp;
	}

	public long peekFront(){		//peek at front of queue
		return queArray[front];
	}

	public boolean isEmpty(){		//true if queue is empty
		return (nItems==0);
	}

	public boolean isFull(){		//true if queue is full
		return (nItems==maxSize);
	}

	public int size(){		//number of items in queue
		return nItems;
	}
}	 // end class Queue


public class queue_implementation2 {
	public static void main(String[] args)
	{
		Queue theQueue = new Queue(5); // queue holds 5 items
		theQueue.insert(10); // insert 4 items
		theQueue.insert(20); 
		theQueue.insert(30); 
		theQueue.insert(40); 
		theQueue.remove(); // remove 3 items
		theQueue.remove(); 
		theQueue.remove(); 
		theQueue.insert(50); // insert 4 more items
		theQueue.insert(60); 
		theQueue.insert(70); 
		theQueue.insert(80); 
		while( !theQueue.isEmpty() ){ // remove and display
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	} // end main()
}//end class QueueApp
