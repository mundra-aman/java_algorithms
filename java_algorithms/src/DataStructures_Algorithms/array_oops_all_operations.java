package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class arrayclass{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int size;
	int array[];

	// arrayclass constructor, when no size given
	arrayclass() throws NumberFormatException, IOException{
		System.out.println("constructing array...");
		System.out.println("enter size of the array");
		size=Integer.parseInt(br.readLine());
		array=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)  array[i]=Integer.parseInt(br.readLine());
	}


	// arrayclass constructor overloading, when size is given
	arrayclass(int a){
		int k=1;
		size=a;
		System.out.println("constructing array...");
		array=new int[size];
		for(int i=0;i<size;i++){
			array[i]=k;
			k++;
		}

	}


	// method to display an array
	void display(){
		for(int i=0;i<size;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}


	//bubble sort method
	void bubblesort(){
		System.out.println("bubble sorting the array...");
		int k=1;
		while(k<size){
			for(int i=0;i<size-1;i++){
				if(array[i]>array[i+1])
					swap(i, i+1);
			}
			k++;
		}
		System.out.println("array after sort:");
		display();
	}


	// swap method
	void swap(int a, int b){
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}


	// linear search method
	void linearsearch() throws NumberFormatException, IOException{
		System.out.println("enter element to search: ");
		int item=Integer.parseInt(br.readLine());
		boolean found=false;
		int i;
		for(i=0;i<size;i++){
			if(array[i]==item){
				found=true;
				break; 	}
			else found=false;
		}

		if(found) System.out.println("element found at: "+i);
		else	  System.out.println("element not found"); 
	}


	// max/min method
	void maxmin(){
		int max=array[0], min=array[0];
		for(int i=0;i<size;i++){
			if(array[i]>max)
				max=array[i];
			else if(array[i]<min)
				min=array[i];
		}
		System.out.println("max is: "+max);
		System.out.println("min is: "+min);
	}


	// delete method
	void delete(){

	}


	// insert method
	void insert(){

	}



}// class ends



// main class containing the main method
public class array_oops_all_operations {
	public static void main(String args[]) throws NumberFormatException, IOException{
		arrayclass obj1=new arrayclass();
		obj1.display();
		obj1.bubblesort();
		obj1.maxmin();
		obj1.linearsearch();

		System.out.println("\nauto array");
		arrayclass obj2=new arrayclass(6);
		obj2.display();
		obj2.bubblesort();
		obj2.maxmin();
		obj1.linearsearch();


	}
}