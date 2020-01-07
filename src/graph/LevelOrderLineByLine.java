package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Node {
	int data;
	Set<Node> adj = new HashSet<>();

	public Node(int data) {
		this.data = data;
	}
}

class Graph {
	private static int c;
	int numOfVertices;
	List<Integer> adj[];

	public Graph(int vertices) {
		this.numOfVertices = vertices;
		adj = new LinkedList[numOfVertices];
		for (int i = 0; i < numOfVertices; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int src, int dest) {
		adj[src].add(dest);
	}

	int numPaths = 0;

	public void countPaths(int src, int dest) {
		if (src == dest)
			return;
		Stack<Integer> s = new Stack<>();
		int visited[] = new int[this.numOfVertices];
		visited[src] = 1;
		s.push(src);
		while (!s.isEmpty()) {
			Integer curr = s.pop();
			if (curr == dest)
				numPaths++;
			for (Integer ad : adj[curr]) {
				if (visited[ad] != 1)
					s.push(ad);
			}

		}
		System.out.println(numPaths);
	}

}

public class LevelOrderLineByLine {
	public static void main(String[] args) {

		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 1);
		g.addEdge(1, 3);
		int s = 0, d = 3;
		g.countPaths(s, d);
	}
}
