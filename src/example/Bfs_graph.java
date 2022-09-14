
package example;

import java.util.*;

/**
 *
 * @author joy
 */
public class Bfs_graph {
    private int V;
    private LinkedList<Integer>adj[];
    
    Bfs_graph(int v)
    {
        V=v;
      adj=new LinkedList[v];
      for(int i=0;i<v;++i)
      {
          adj[i]=new LinkedList();
      }
        
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    
    void BFS(int s)
    {
        boolean visited[]=new boolean[V];
        LinkedList<Integer>queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        
        while(queue.size()!=0)
        {
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer>i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
        
    }
    public static void main(String[] args) {
       Bfs_graph g=new Bfs_graph(5);
       g.addEdge(0,1);
       g.addEdge(0,2);
       g.addEdge(0,3);
       g.addEdge(2,4);
      // g.addEdge(2, 3);
      // g.addEdge(3, 3);
       
        System.out.println("The graph is statred form 2"+ "THis is the starting Node");
        g.BFS(2);
       
    }
}
