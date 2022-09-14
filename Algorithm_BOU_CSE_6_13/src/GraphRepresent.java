
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class GraphRepresent {
	// Adjacency List representation in Java

	  // Add edge
	  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) 
          {
	    am.get(s).add(d);
	    am.get(d).add(s);
	  }

	  public void graph_represent() {

	    // Create the graph
	    int V = 5;
	    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

	    for (int i = 0; i < V; i++)
            
	      am.add(new ArrayList<Integer>());

	    // Add edges
	    addEdge(am, 0, 1);
	    addEdge(am, 0, 2);
	    addEdge(am, 0, 3);
	    addEdge(am, 1, 2);

	    printGraph(am);
	   }
         

	  // Print the graph
	  public void printGraph(ArrayList<ArrayList<Integer>> am) {
	    for (int i = 0; i < am.size(); i++) 
            {
	      System.out.println("\nVertex " + i + ":");
              
	      for (int j = 0; j < am.get(i).size(); j++) 
              {
	        System.out.print(" -> " + am.get(i).get(j));
	      }
	      System.out.println();
	    }
	  }
	}
