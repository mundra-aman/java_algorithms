/*********************************************************************
 
 Description : Merge two sorted arrays MergeSorted( )
			   Here A is a sorted array with M elements and B is a 
			   sorted array with N elements. C is an empty array 
			   with P locations where P >= M + N.
 			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

/*
 
1. Set I = J = K = 1 [Initialize counters]
2. Repeat While (I <= M) and (J <= N)
3. If (A [I] < B [J]) Then
4. Set C [K] = A [I] [Assign elements of array A to array C]
5. Set I = I + 1
6. Else
7. Set C [K] = B [J] [Assign elements of array B to array C]
8. Set J = J + 1
     [End of If]
9. Set K = K + 1
    [End of While Loop]
10. If (I > M) Then [Array A is empty]
11. Repeat While (J <= N)
12. Set C[K] = B[J] [Assign the remaining elements of array B to array C]
13. Set J = J+1 and K = K+1
     [End of While Loop]
     [End of If]
14. If (J > N) Then [Array B is empty]
15. Repeat While (I <= M)
16. Set C [K] = A [I] [Assign the remaining elements of array A to array C]
17. Set I = I+1 and K = K+1
     [End of While Loop]
     [End of If]
18. Exit

Explanation: The above algorithm merges the elements of sorted array A and 
sorted array B into a sorted array C. First of all, we must keep track of the 
locations of the smallest element of A and the smallest element of B which 
have not yet been placed in C. I and J denote these locations respectively, 
and K denotes the location in C to be filled. Therefore, initially, we set 
I = J = K = 1. In step 3, we compare A [I] and B [J] and assign the smallest 
element to C [K]. Then we either increment I by setting I = I + 1 or increment 
J by setting J = J + 1, according to whether the new element in C has come from 
A or B. And also we increment K by setting K = K + 1. If I > M, then it means 
array A has become empty and the remaining elements of B are assigned to C, or 
if J > N, then it means array B has become empty and the remaining elements of A 
are assigned to C.

*/


package DataStructures_Algorithms;

public class array_merge_sortedarrays {

}
