/*********************************************************************
 
 Description : Merge two unsorted arrays MergeUnsorted( )
			   Here A is an array with M elements and B is an array 
			   with N elements. C is an empty array with P locations 
			   where P >= M + N.
 			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

/*

1. Repeat For I = 1 to M
2. Set C [I] = A [I] [Assign the elements of array A to array C]
    [End of For Loop]
3. Set K = 1 [Initialize counter]
4. Repeat For J = M+1 to M+N
5. Set C [J] = B [K] [Assign the elements of array B to array C]
6. Set K = K + 1 [Increase the counter by 1]
    [End of For Loop]
7. Exit

Explanation: In step 1 & 2, all the elements of array A are assigned to array C. Then K is initialized from 1 which will keep track of the elements of array B. In step 4 for loop, J is initialized from next empty location in C i.e. M+1 and it will iterate to total number of elements of array A & B i.e. M+N. In step 5, all the elements of array B are assigned to array C and in next step, K is incremented by 1.
Traverse an array
Traverse ( ):
Description: Here A is a linear array with lower bound LB and upper bound UB. This algorithm traverses array A and applies the operation PROCESS to each element of the array.
1. Repeat For I = LB to UB
2. Apply PROCESS to A [ I ]
    [End of For Loop]
3. Exit

Explanation: Here A is a linear array stored in memory with lower bound LB and upper bound UB. The for loop iterates from LB to UB and visits each element of the array. During this visit, it applies the operation PROCESS to the elements of the array A.
*/


package DataStructures_Algorithms;

public class array_merge_unsortedarrays {

}
