/*********************************************************************
 
 Description : VoteCount tallies the votes for election candidates.
					input: a sequence of votes, terminated by a -1
	 				output: the listing of the candidates and their 
	 				tallied votes
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy
  
 **********************************************************************/

package DataStructures_Algorithms;

import javax.swing.*;

public class array_gui_userinput {
	public static void main(String[] args){
	int candidates = 4;	// how many candidates
	int[] votes = new int[candidates];
	// holds the votes;
	// recall that each element is initialized to 0
	// collect the votes:
	boolean processing = true;
	while ( processing )
	// invariant: all votes read have been tallied in array votes
	{ int v = new Integer(JOptionPane.showInputDialog("Vote for (0,1,2,3):")).intValue();
	if ( v>=0 && v<votes.length ) // is it a legal vote?
	{ votes[v]=votes[v]+1; }
	else { processing = false; } // quit if there is an illegal vote
	}
	// print the totals:
	for(int i=0;i!=votes.length;i=i+1)
	// totals for votes[0]..votes[i-1] have been printed
	{ System.out.println("Candidate" + i + " has " + votes[i] + " votes"); }
	}
	}