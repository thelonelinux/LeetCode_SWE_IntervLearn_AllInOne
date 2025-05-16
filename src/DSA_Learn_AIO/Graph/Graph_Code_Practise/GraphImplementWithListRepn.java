package DSA_Learn_AIO.Graph.Graph_Code_Practise;

import java.util.*;

public class GraphImplementWithListRepn {

    // Graph implementation using adjacency list representation (Instead of array matrix arr[][], using list<list>)
    // This is a simple implementation of an undirected graph using an adjacency list
    // where V is the number of vertices and adjList is the adjacency list
    // The adjacency list is a list of lists where adjList[i] contains the neighbors of vertex i
    // The graph is undirected, so if there is an edge between vertex u and vertex v,
    // then u is in the adjacency list of v and v is in the adjacency list of u
    // The graph is represented as a class with methods to add edges, perform BFS and DFS traversals, and print the adjacency list
   


    private int V; // Number of vertices
    private List<List<Integer>> adjList;

    public GraphImplementWithListRepn(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

     // The BFS and DFS traversals are implemented using a queue and recursion respectively. I will add using stack as well
    // The BFS traversal starts from a given source vertex and visits all reachable vertices in breadth-first order
    // The DFS traversal starts from a given source vertex and visits all reachable vertices in depth-first order
    // The BFS and DFS traversals return a list of visited vertices in the order they were visited

    // BFS traversal from a given source
    public List<Integer> bfs(int src) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
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
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited, result);
            }
        }
    }

    // DFS using stack (iterative)
    public List<Integer> dfsIterative(int src) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(src);
        visited[src] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            result.add(node);
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return result;
    }

    // The adjacency list is printed using the printAdjList method
    // Utility to print adjacency list
    public void printAdjList() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + ": " + adjList.get(i));
        }
    }

    // Example usage
    public static void main(String[] args) {
        GraphImplementWithListRepn graph = new GraphImplementWithListRepn(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Adjacency List:");
        graph.printAdjList();

        System.out.println("BFS from node 0: " + graph.bfs(0));

        // Using DFS with recursion
        System.out.println("DFS (recursive-without using stack) from node 0: " + graph.dfs(0));

        // Using DFS with stack
        System.out.println("DFS (iterative-using stack)         from node 0: " + graph.dfsIterative(0));
    }
}
