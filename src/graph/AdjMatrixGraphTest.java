package graph;

public class AdjMatrixGraphTest {

	public static void main(String[] args) {
		AdjMatrixGraph graph = new AdjMatrixGraph(4);
		graph.addVertex("Mathura");
		graph.addVertex("Agra");
		graph.addVertex("Delhi");
		graph.addVertex("Jaipur");
		graph.addEdge("Mathura", "Agra");
		graph.addEdge("Mathura", "Delhi");
		graph.addEdge("Delhi", "Jaipur");
		graph.addEdge("Agra", "Jaipur");
		System.out.println(graph.isEdge("Mathura", "Jaipur"));
		System.out.println(graph.isEdge("Mathura", "Delhi"));
		System.out.println(graph.getNeighbours("Jaipur"));
	}
}