
import java.util.Iterator;
import java.util.LinkedList;

public class Bfs {

    public int V;
    public LinkedList<Integer> adj[];

    // Create a graph
   public Bfs(int v)
            
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) 
        {
        adj[i] = new LinkedList();
        }
    }

    // Add edges to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algorithm
    public void BFS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}