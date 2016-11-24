package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjListGraph {

	private int vertexCount;
	private ArrayList<String> vertex;
	private LinkedList adjList[];

	public AdjListGraph(int vertexCount) {
		super();
		this.vertexCount = vertexCount;
		vertex = new ArrayList<String>();
		adjList = new LinkedList [vertexCount];
		for (int i = 0; i < vertexCount; i++) {
			adjList[i]= new LinkedList<String>();
		}
	}

	public void addVertex(String vertexName) {
		vertex.add(vertexName);
	}
	
	public void addEdge(String source,String destination){
		int i = vertex.indexOf(source);
		int j = vertex.indexOf(destination);
		if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
			adjList[i].add(destination);
		}
		LinkedList<String> s = adjList[i];
		for (String st : s) {
			System.out.println(st);
		}
	}
}