package graphs;

import java.util.*;

public class Graph {
	
//	adjacency list - property of graph which is used to depict everything about a graph - array of linked list
	
	private LinkedList<Integer> adj[];

	public Graph(int v) {
//		v= vertices
		adj = new LinkedList[v];
		for(int i=0; i< v ;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source , int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	
	public int bfs(int source , int destination) {
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			if(curr == destination)break;
			
			for(int neighbour : adj[curr]) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = curr;
				}
			}	
		}
		
		int curr = destination;
		int distance = 0;
		while(parent[curr] != -1) {
			System.out.println(curr + " -> ");
			curr = parent[curr];
			distance++;
		}
		return distance;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
// e=edges
		Graph graph = new Graph(v);
		System.out.println("enter" + e + "edges");
		
		for(int i=0 ; i<e ; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			graph.addEdge(source, destination);
			
		}
		
		System.out.println("enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		
		int distance = graph.bfs(source, destination);
		System.out.println("min distance is" + distance );
		sc.close();
		
	}

}
