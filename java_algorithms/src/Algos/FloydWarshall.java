package Algos;

// This code computes the single source shortest paths in a graph represented
// by the adjacency list by using the Floyd-Warshall algorithm. The file name
// should is taken as the first command line parameter.
//
// 1. Save this file as FloydWarshall.java
// 2. Compile it with javac FloydWarshall.java
// 3. Run with java FloydWarshall < fw.dat (or your own file name)

import java.util.*;

public class FloydWarshall
{
  private static double[][] d;        // storage for the d-values
  private static int[][] pred;        // storage for the predecessors
  private static String[] nodeLabels; // vertex labels

  public static void main(String[] args)
  {
    readGraph(args);                  // read graph encoding

    fw();                             // run the Floyd-Warshall algorithm

    //output the results
    System.out.println("\nThe predecessors:");
    for (int i=0; i<pred.length; i++)
    {
      for (int j=0; j<pred.length; j++)
      if (pred[i][j] == -1)
        System.out.print("nil ");
      else
        System.out.printf("%3s ", nodeLabels[pred[i][j]]);
      System.out.println();
    }

  }

  public static void fw()             // Floyd-Warshall shortest path algo
  {
    int n = d.length;
    for (int k=0; k<n; k++)
    {
      System.out.println("\n D^" + k + ":");
      for (int i=0; i<d.length; i++)
      {
        for (int j=0; j<d.length; j++)
          if (d[i][j] < Double.MAX_VALUE)
            System.out.printf("%6.1f ", d[i][j]);
          else
            System.out.printf("%6s ", "inf");
        System.out.println();
      }

      for (int i=0; i<n; i++)
        for (int j=0; j<n; j++)
        {
          double dd = d[i][k] + d[k][j];
          if (d[i][j] > dd)
          {
            d[i][j] = dd;
            pred[i][j] = pred[k][j];
          }
        }
    }
  }

  // this method reads graph encoding from file
  public static void readGraph(String[] args)
  {
    Scanner inFile = new Scanner(System.in);

    HashMap<String, Integer> nodeMap =
       new HashMap<String, Integer>(); // storage for vertex labels
    String input = "";                 // storage for the entire file data
    int index = 0;
    String s = "";
    while (inFile.hasNextLine())       // read all file records
    {
      s = inFile.nextLine();           // read a text line from file
      if (s.length() > 0 && s.charAt(0) != '#') // ignore comments
      {
        StringTokenizer sTk = new StringTokenizer(s);
        String label = sTk.nextToken(); // vertex label
        if (! nodeMap.containsKey(label)) // check for a new vertex in hash
        {
          nodeMap.put(label, new Integer(index)); // assign to it an index
          index++;
          input = input + "#" + s;     // append the input line
        }
        else                           // this vertex is already processed
        {
          System.out.println("Multiple declaration of vertex: " + label);
          System.exit(0);
        }
      }
    }

    // converting list into array
    int n = nodeMap.size();            // # of vertices
    nodeLabels = new String[n];

    // computing the adjacency matrix
    d = new double[n][n];              // array of the d-values
    pred = new int[n][n];              // predecessors
    for (int i=0; i<n; i++)            // arrays initialisation
    for (int j=0; j<n; j++)
    {
      if (i == j)
        d[i][j] = 0;
      else
        d[i][j] = Double.MAX_VALUE;
      pred[i][j] = -1;
    }
    StringTokenizer sTk = new StringTokenizer(input, "#");
    for (int i=0; i<n; i++)
    {
      StringTokenizer sTk1 = new StringTokenizer(sTk.nextToken());
      int l = (sTk1.countTokens()-1)/2; // outdegree of a vertex
      nodeLabels[i] = sTk1.nextToken();
      for (int j=0; j<l; j++)
      {
        s = sTk1.nextToken();

        double weight = 0;
        try
        {
          weight = Double.parseDouble(sTk1.nextToken());  //edge wgt
        }
        catch(NumberFormatException nfe)
        {
          System.out.println("Wrong label/weight combination in the " +
               "adjacency list of " + i);
          System.exit(0);
        }
        catch(NoSuchElementException nfe)
        {
          System.out.println("Wrong adjacency list for node " + i);
          System.exit(0);
        }

        if (nodeMap.containsKey(s))
        {
          int ind = nodeMap.get(s).intValue();
          d[i][ind] = weight;
          pred[i][ind] = i;
        }
        else
        {
          System.out.println("Undeclared vertex: " + s);
          System.exit(0);
        }
      }
    }
  }
}
