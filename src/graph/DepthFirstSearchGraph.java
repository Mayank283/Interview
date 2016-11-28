package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

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

	//Adding the vertex
	public void addVertex(char label) {
		vertexList.add(new Vertex(label));
	}

	/** Implementation of Directed graph */
	public void addEdge(char source, char destination) {

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
	
	//Get neighbours/Adjacent vertex's
	public ArrayList<Character> getNeighbours(char source) {
		Vertex source1 = null;
		ArrayList<Character> neighbours = new ArrayList<Character>();
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
	
	public void displayVertex(int source){
		System.out.println(vertexList.get(source).getLabel());
	}
	
	//Check if there is an edge between 2 vertex's
	public boolean isEdge(char source, char destination) {

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

class Vertex {

	private char label;
	private boolean visited;

	public Vertex(char label) {
		super();
		this.label = label;
		this.visited = false;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}