/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Dijkstra
{  

static final int totalVertex = 9;  
int minimumDistance(int distance[], Boolean spSet[])  
{  
// Initialize min value  
int m = Integer.MAX_VALUE, m_index = -1;  
  
for (int vx = 0; vx < totalVertex; vx++)  
{  
if (spSet[vx] == false && distance[vx] <= m)   
{  
m = distance[vx];  
m_index = vx;  
}  
}  
return m_index;  
  
}  
  
// A utility method to display the built distance array  
void printSolution(int distance[], int n)  
{  
System.out.println("The shortest Distance from source 0th node to all other nodes are: ");  
for (int j = 0; j < n; j++)  
System.out.println("To " + j + " the shortest distance is: " + distance[j]);  
}  
  
// method that does the implementation of Dijkstra's shortest path algorithm  
// for a graph that is being represented using the adjacency matrix representation  
void dijkstra(int graph[][], int s)  
{  
int distance[] = new int[totalVertex]; // The output array distance[i] holds the shortest distance from source s to j  
  
// spSet[j] will be true if vertex j is included in the shortest  
// path tree or the shortest distance from the source s to j is finalized  
Boolean spSet[] = new Boolean[totalVertex];  
  
// Initializing all of the distances as INFINITE   
// and spSet[] as false  
for (int j = 0; j < totalVertex; j++)   
{  
distance[j] = Integer.MAX_VALUE;  
spSet[j] = false;  
}  

distance[s] = 0;  
 
for (int cnt = 0; cnt < totalVertex - 1; cnt++)   
{  

int ux = minimumDistance(distance, spSet);  

spSet[ux] = true;  
  

for (int vx = 0; vx < totalVertex; vx++)  
 
if (!spSet[vx] && graph[ux][vx] != -1 && distance[ux] != Integer.MAX_VALUE && distance[ux] + graph[ux][vx] < distance[vx])  
{  
distance[vx] = distance[ux] + graph[ux][vx];  
}  
}  
printSolution(distance, totalVertex);  
}  
public static void main(String argvs[])  
{  
int grph[][] = new int[][] { { -1, 3, -1, -1, -1, -1, -1, 7, -1 },  
    { 3, -1, 7, -1, -1, -1, -1, 10, 4 },  
    { -1, 7, -1, 6, -1, 2, -1, -1, 1 },  
    { -1, -1, 6, -1, 8, 13, -1, -1, 3 },  
    { -1, -1, -1, 8, -1, 9, -1, -1, -1 },  
    { -1, -1, 2, 13, 9, -1, 4, -1, 5 },  
    { -1, -1, -1, -1, -1, 4, -1, 2, 5 },  
    { 7, 10, -1, -1, -1, -1, 2, -1, 6 },  
    { -1, 4, 1, 3, -1, 5, 5, 6, -1 } };  
      
// creating an object of the class DijkstraExample  
Dijkstra obj = new Dijkstra();  
obj.dijkstra(grph, 0);  
}  
}  