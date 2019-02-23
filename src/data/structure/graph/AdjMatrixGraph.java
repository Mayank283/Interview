package data.structure.graph;

import java.util.ArrayList;

/**
 * In graph as the Vertexc can be any object hence use Vertex List to store the
 * information about Vertex i.e an Arraylist of String/Object(Type of Vertex).
 * Below link to study the Adjacency Matrix Implementation
 * https://www.youtube.com/watch?v=9C2cpQZVRBA&index=41&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P
 * Important Points: Time complexities(Un-directed Graph): 1. To find if Two
 * Vertex are Connected: O(1)+ O(V) i.e O(V),To find Index of Vertex's O(V)and
 * to search in the Adjacent Matrix O(1) 2. To Find the Adjacent neighbours of
 * the Vertex: O(V)+O(V)\ Space Complexity: O(V^2) Adjaccency Matrix to be used
 * in case of less number of vertex or the graph is highly dense
 */

// Implementation for Un-directed graph
public class AdjMatrixGraph {

	private int vertexCount;
	private ArrayList<String> vertex;
	private boolean adjMatrix[][];

	public AdjMatrixGraph(int vertexCount) {
		super();
		this.vertexCount = vertexCount;
		vertex = new ArrayList<String>();
		adjMatrix = new boolean[vertexCount][vertexCount];
	}

	public void addVertex(String vertexName) {
		vertex.add(vertexName);
	}

	public void addEdge(String source, String destination) {
		int i = vertex.indexOf(source);
		int j = vertex.indexOf(destination);
		if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
			adjMatrix[i][j] = true;
			adjMatrix[j][i] = true;
		}
	}

	public boolean isEdge(String source, String destination) {
		int i = vertex.indexOf(source);
		int j = vertex.indexOf(destination);
		if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
			return adjMatrix[i][j];
		}
		return false;
	}

	public ArrayList<String> getNeighbours(String source) {
		ArrayList<String> neighbours = new ArrayList<String>();
		int i = vertex.indexOf(source);
		for (int j = 0; j < adjMatrix.length; j++) {
			if (adjMatrix[i][j] == true) {
				neighbours.add(vertex.get(j));
			}
		}
		return neighbours;
	}
}