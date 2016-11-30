package graph;

public class DepthFirstSearchGraphTest {

	public static void main(String[] args) {
		DepthFirstSearchGraph graph = new DepthFirstSearchGraph(4);
		graph.addVertex("Mathura");
		graph.addVertex("Agra");
		graph.addVertex("Delhi");
		graph.addVertex("Jaipur");
		graph.addEdge("Mathura", "Agra");
		graph.addEdge("Mathura", "Jaipur");
		graph.addEdge("Agra", "Mathura");
		graph.addEdge("Agra", "Delhi");
		graph.addEdge("Delhi", "Delhi");
		System.out.println(graph.isEdge("Agra", "Delhi"));
		System.out.println(graph.getNeighbours("Mathura"));
		System.out.println(graph.getNeighbours("Agra"));
		System.out.println(graph.getNeighbours("Delhi"));
		System.out.println(graph.getNeighbours("Jaipur"));
		graph.dfs("Mathura");
	}
}