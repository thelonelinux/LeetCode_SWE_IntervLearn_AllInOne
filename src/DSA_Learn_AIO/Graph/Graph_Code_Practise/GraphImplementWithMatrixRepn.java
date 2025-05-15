package DSA_Learn_AIO.Graph.Graph_Code_Practise;

import java.util.*;

public class GraphImplementWithMatrixRepn {

    // Graph implementation using adjacency matrix representation
    // This is a simple implementation of an undirected graph using an adjacency matrix
    // where V is the number of vertices and adjMatrix is the adjacency matrix
    // The adjacency matrix is a 2D array where adjMatrix[i][j] = 1 if there is an edge between vertex i and j, otherwise 0
    // The graph is undirected, so the adjacency matrix is symmetric
    // For example, if there is an edge between vertex 0 and vertex 1, then adjMatrix[0][1] = 1 and adjMatrix[1][0] = 1
    // The graph is represented as a class with methods to add edges, perform BFS and DFS traversals, and print the adjacency matrix

    private int V; // Number of vertices
    private int[][] adjMatrix;

    public GraphImplementWithMatrixRepn(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    // BFS traversal from a given source
    public List<Integer> bfs(int src) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src); //Same as queue.add(src)
        visited[src] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll(); //Returns and removes the head of the queue
            // queue.remove() will throw exception if queue is empty
            result.add(node);
            for (int i = 0; i < V; i++) {
                if (adjMatrix[node][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return result;
    }

    // DFS traversal from a given source
    public List<Integer> dfs(int src) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsUtil(src, visited, result);
        return result;
    }

    private void dfsUtil(int node, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int i = 0; i < V; i++) {
            if (adjMatrix[node][i] == 1 && !visited[i]) {
                dfsUtil(i, visited, result);
            }
        }
    }

    // Utility to print adjacency matrix
    public void printAdjMatrix() {
        for (int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Example usage
    public static void main(String[] args) {
        GraphImplementWithMatrixRepn graph = new GraphImplementWithMatrixRepn(5); //0 to 4
        // Adding edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Adjacency Matrix:");
        graph.printAdjMatrix();

        System.out.println("BFS from node 0: " + graph.bfs(0));
        System.out.println("DFS from node 0: " + graph.dfs(0));
    }
}
