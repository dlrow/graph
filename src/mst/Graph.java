package mst;

import java.util.LinkedList;
import java.util.List;

class Edge {
	int weight;
	int src;
	int dest;

	public Edge(int w, int s, int d) {
		this.weight = w;
		this.src = s;
		this.dest = d;
	}
}

class Graph {
	int nodes;
	List<Edge>[] adjacencylist;

	public Graph(int numOfNodes) {
		this.nodes = numOfNodes;
		adjacencylist = new LinkedList[numOfNodes];
		for (int i = 0; i < numOfNodes; i++) {
			adjacencylist[i] = new LinkedList<>();
		}

	}

	public void addEdge(int src, int dest, int weight) {
		Edge e = new Edge(weight,src,dest);
		adjacencylist[src].add(e);
	}

}
