package data.structure.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Application of DFS: To check if the two vertex are connected or not:
 * isConnected(source,destination)
 */

public class DepthFirstSearchGraph {
	private int vertexCount;
	private ArrayList<Vertex> vertexList;
	private LinkedList[] adjList;

	public DepthFirstSearchGraph(int vertexCount) {
		super();
		this.vertexCount = vertexCount;
		vertexList = new ArrayList<Vertex>();
		adjList = new LinkedList[vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			adjList[i] = new LinkedList<Vertex>();
		}
	}

	// Adding the vertex
	public void addVertex(String label) {
		vertexList.add(new Vertex(label));
	}

	/** Implementation of Directed graph */
	public void addEdge(String source, String destination) {

		Vertex source1 = null, destination1 = null;
		Iterator<Vertex> iterate = vertexList.listIterator();
		while (iterate.hasNext()) {
			Vertex n = iterate.next();
			if (n.getLabel() == source) {
				source1 = n;
			}
			if (n.getLabel() == destination) {
				destination1 = n;
			}

		}
		int i = vertexList.indexOf(source1);
		int j = vertexList.indexOf(destination1);
		if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
			adjList[i].add(destination1);
		}
	}

	// Get neighbours/Adjacent vertex's
	public ArrayList<String> getNeighbours(String source) {

		Vertex source1 = null;
		ArrayList<String> neighbours = new ArrayList<String>();
		Iterator<Vertex> iterate = vertexList.listIterator();

		while (iterate.hasNext()) {
			Vertex n = iterate.next();
			if (n.getLabel() == source) {
				source1 = n;
				break;
			}
		}

		int i = vertexList.indexOf(source1);
		Iterator<Vertex> iterate1 = adjList[i].listIterator();

		while (iterate1.hasNext()) {
			Vertex n = iterate1.next();
			neighbours.add(n.getLabel());
		}

		return neighbours;
	}

	public void displayVertex(Vertex v) {
		System.out.print(v.getLabel() + " ");
	}

	/*
	 * This will work only when graph is disconnected. To make it work for
	 * disconnected graph make another method DFSGraph which will check if all
	 * the vertices are visited or not and call this dfs inside it.
	 */
	public void dfs(String start) {
		Vertex start1 = null;
		Stack<Vertex> stack = new Stack<Vertex>();
		Iterator<Vertex> iterate = vertexList.listIterator();
		while (iterate.hasNext()) {
			Vertex n = iterate.next();
			if (n.getLabel() == start) {
				start1 = n;
				break;
			}
		}

		start1.setVisited(true);
		displayVertex(start1);
		stack.push(start1);

		while (!stack.isEmpty()) {
			Vertex unvisited = getAdjUnvisited(stack.peek());
			if (unvisited == null) {
				stack.pop();
			} else {
				unvisited.setVisited(true);
				displayVertex(unvisited);
				stack.push(unvisited);
			}
		}
	}

	public Vertex getAdjUnvisited(Vertex visited) {
		int i = vertexList.indexOf(visited);
		Iterator<Vertex> iterate1 = adjList[i].listIterator();
		while (iterate1.hasNext()) {
			Vertex n = iterate1.next();
			if (n.isVisited() == false) {
				return n;
			}
		}
		return null;
	}

	// Check if there is an edge between 2 vertex's
	public boolean isEdge(String source, String destination) {

		Vertex source1 = null, destination1 = null;
		Iterator<Vertex> iterate = vertexList.listIterator();
		while (iterate.hasNext()) {
			Vertex n = iterate.next();
			if (n.getLabel() == source) {
				source1 = n;
			}
			if (n.getLabel() == destination) {
				destination1 = n;
			}
		}

		int i = vertexList.indexOf(source1);
		return (adjList[i].contains(destination1)) ? true : false;
	}
}