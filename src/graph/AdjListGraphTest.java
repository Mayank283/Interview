package graph;

public class AdjListGraphTest {

	public static void main(String[] args) {
	AdjListGraph graph = new AdjListGraph(4);
	graph.addVertex("Mathura");
	graph.addVertex("Agra");
	graph.addVertex("Delhi");		
	graph.addEdge("Mathura", "Agra");
	graph.addEdge("Mathura", "Delhi");
	}
}
