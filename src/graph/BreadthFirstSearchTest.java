/**
 * 
 */
package graph;

/**
 * @author Mayank
 *
 */
public class BreadthFirstSearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BreadthFirstSearch graph = new BreadthFirstSearch();
		graph.addVertex("Agra");
		graph.addVertex("Aligarh");
		graph.addVertex("Mathura");
		graph.addVertex("Delhi");
		graph.addEdge("Agra", "Mathura");
		graph.addEdge("Mathura", "Aligarh");
		graph.addEdge("Delhi", "Delhi");
		
		System.out.println(graph.getNeighbours("Agra"));
		System.out.println(graph.getNeighbours("Delhi"));
		System.out.println(graph.getNeighbours("Mathura"));
		System.out.println(graph.getNeighbours("Mathur"));

	}

}
