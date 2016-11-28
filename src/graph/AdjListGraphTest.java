package graph;

public class AdjListGraphTest {

	public static void main(String[] args) {
	AdjListGraph graph = new AdjListGraph(4);
	graph.addVertex("Mathura");
	graph.addVertex("Agra");
	graph.addVertex("Delhi");		
	graph.addEdge("Mathura", "Agra");
	graph.addEdge("Mathura", "Delhi");
	graph.addEdge("Agra", "Delhi");
	graph.addEdge("Agra", "Mathura");
	graph.addEdge("Mathura", "Mathura");
	System.out.println(graph.isEdge("Agra","Delhi"));
	System.out.println(graph.getNeighbours("Mathura"));
	System.out.println(graph.getNeighbours("Delhi"));
	System.out.println(graph.getNeighbours("Agra"));
	}
}
