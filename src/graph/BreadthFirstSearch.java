/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Mayank
 * 
 *         Implementation of BFS. It is a solution when maximum count of vertex
 *         is not known and vertex is added on the fly. If Maximum count of
 *         vertex is given do the solution as per hackerearth which uses index
 *         value of array as vertex value. Note: Hackerearth solution is only
 *         applicable when vertex are integer type.
 */
public class BreadthFirstSearch {

	/**
	 * To store the index of every vertex
	 */
	ArrayList<Vertex> vertexIndexList;

	/**
	 * Representation of graph using adjList
	 */
	ArrayList<LinkedList<Vertex>> adjList;

	/**
	 * Default constructor
	 */
	public BreadthFirstSearch() {
		super();
		vertexIndexList = new ArrayList<Vertex>();
		adjList = new ArrayList<LinkedList<Vertex>>();
	}

	public void addVertex(String label) {
		vertexIndexList.add(new Vertex(label));
		LinkedList<Vertex> vertex = new LinkedList<Vertex>();
		// vertex.add(new Vertex(label));
		adjList.add(vertex);
	}

	/**
	 * Method to add edge in an undirected graph
	 * 
	 * @param source
	 * @param destination
	 */
	public void addEdge(String source, String destination) {
		int sourceIndex = -1, destinationIndex = -1;
		Iterator<Vertex> iterate = vertexIndexList.listIterator();

		while (iterate.hasNext()) {
			Vertex n = iterate.next();
			if (n.getLabel() == source) {
				sourceIndex = vertexIndexList.indexOf(n);
			}
			if (n.getLabel() == destination) {
				destinationIndex = vertexIndexList.indexOf(n);
			}

		}

		if (sourceIndex == -1 || destinationIndex == -1) {
			System.out.println("No such vertex's");
			return;
		} else if (sourceIndex == destinationIndex) {
			adjList.get(sourceIndex).add(new Vertex(destination));
		} else {
			adjList.get(sourceIndex).add(new Vertex(destination));
			adjList.get(destinationIndex).add(new Vertex(source));
		}
	}

	/**
	 * Method to get all the neighbour's of a vertex
	 * 
	 * @param vertexLabel
	 */
	public LinkedList<Vertex> getNeighbours(String vertexLabel) {
		int vertexIndex = -1;

		Iterator<Vertex> iterate = vertexIndexList.listIterator();

		while (iterate.hasNext()) {

			Vertex n = iterate.next();

			if (n.getLabel() == vertexLabel) {
				vertexIndex = vertexIndexList.indexOf(n);
				break;
			}
		}

		if (vertexIndex == -1) {
			System.out.println("No such vertex present");
			return null;
		}

		return adjList.get(vertexIndex);
	}

}