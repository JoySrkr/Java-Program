
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Kruskal{
    // Function to find the set of element i
    private static int find(Subset subsets[], int i) {
        // Path Compression
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }
    // Function to perform union of two sets of x and y
    private static void Union(Subset subsets[], int x, int y) {
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);
        // (Union by Rank)
        if (subsets[xRoot].rank < subsets[yRoot].rank) {
            subsets[xRoot].parent = yRoot;
        } else if (subsets[xRoot].rank > subsets[yRoot].rank) {
            subsets[yRoot].parent = xRoot;
        } else {
            // If rank are same, then make one as root and increment
            // its rank by one
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }
    }
    private static void findPrintMST(ArrayList<Edge> graph[], Edge edges[]) {
        // Sort the edges in ascending order of their weights
        Arrays.sort(edges, Edge.comp);
        // Stores the mst
        Edge mst[] = new Edge[graph.length - 1];
        for (int i = 0; i < graph.length - 1; i++) {
            mst[i] = new Edge(-1, -1, -1);
        }
        int e = 0;      // Number of edges included in mst
        
        // Create v subsets, v is the number of vertices
        Subset subsets[] = new Subset[graph.length];
        for (int i = 0; i < graph.length; i++) {
            subsets[i] = new Subset();
        }
        // Initialise parent of all as itself and rank as 0
        for (int i = 0; i < graph.length; i++) {
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }
        // One by one traverse all the edges
        for (int i = 0; i < edges.length; i++) {
            // Find the set of vertices present on this edge
            int x = find(subsets, edges[i].from);
            int y = find(subsets, edges[i].to);
            // If the set is not same(that is, no cycle is formed)
            // Add this edge to mst
            if (x != y) {
                mst[e].from = edges[i].from;
                mst[e].to = edges[i].to;
                mst[e].weight = edges[i].weight;
                Union(subsets, x, y);
                e++;
            } else {
                // Discard the edge
            }
            // If all the vertices are included in MST, stop here
            if (e == graph.length - 1) {
                break;
            }
        }
        
        // Print the MST
        for (int i = 0; i < graph.length - 1; i++) {
            System.out.println("From " + mst[i].from + " to " + mst[i].to + " weight " + mst[i].weight);
        }
    }
    public static void main(String[] args) {
        // Graph
        ArrayList<Edge> graph[] = new ArrayList[4];
        // Stores all the edges of the graph
        Edge edges[] = new Edge[5];
        for (int i = 0; i < 4; i++)
            graph[i] = new ArrayList<>();
        // Make the graph in given example
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 8));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 15));
        graph[2].add(new Edge(2, 0, 8));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 20));
        graph[3].add(new Edge(3, 1, 15));
        graph[3].add(new Edge(3, 2, 20));
        // Store all the edges of the graph
        edges[0] = new Edge(0, 1, 5);
        edges[1] = new Edge(0, 2, 8);
        edges[2] = new Edge(1, 2, 10);
        edges[3] = new Edge(1, 3, 15);
        edges[4] = new Edge(2, 3, 20);
        // Find MST using Kruskal's Algorithm and print it
        findPrintMST(graph, edges);
    }
    static class Edge {
        int from;
        int to;
        int weight;
        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        public static final Comparator<Edge> comp = new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                // Sort according to edge weights
                return Integer.compare(o1.weight, o2.weight);
            }
        };
    }
    // Subset class is used to detect cycle while adding an edge
    static class Subset {
        int parent;
        int rank;
    }
}
