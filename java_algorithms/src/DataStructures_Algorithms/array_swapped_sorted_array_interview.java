/*********************************************************************
 
 Description : 	Given a sorted array in which some even nodes have been 
 				swapped randomly(but one node has been swapped only once) 
 				e.g A2 might have been swapped with A6 etc. Search an 
 				element in this array. 
 				Optimum Time: O(log n)    
 				Optimum Space: O(1) auxiliary space 
 				
 				amazon interview question asked to a 0 years experienced person
 				
 				# I guess there's a flaw in the question, array must have 
 				odd number of elements for the given algorithm to work, or 
 				if the algorithm has to be made for a general(even/odd both) 
 				number of elements, then algorithm is wrong.  
 				 
 Author		 : 	Amandeep Singh
 Website	 : 	http://kodevelop.com/
 Email		 : 	aman.adsm@gmail.com
 github		 : 	https://github.com/aman-devy
  
 **********************************************************************/


/*
 * Let us suppose that the array is a[i] and we searching for x. 
 * Following code achieves the same in O(log(n)) time. 

'1.) Search for element just larger(a[i-2] < x < a[i]) then x in the odd array. 
Let's suppose its A[i]. Now if x was in the array , it would have been in place a[i-1]. 
If a[i-1] = x . return i-1 else go to 2.

2.) If its not true then search for A[i-1] in the odd array.   
Let a[j] be the element just greater then A[i-1]. Then a[j-1] must have been swapped with a[i-1].

3.) if a[j-1] = x return (j-1); else return false 
 */

package DataStructures_Algorithms;

public class array_swapped_sorted_array_interview {

}
