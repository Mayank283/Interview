package data.structure.graph;

public class DepthFirstSearchGraphTest {

	public static void main(String[] args) {
		DepthFirstSearchGraph graph = new DepthFirstSearchGraph(8);
//		graph.addVertex("Mathura");
//		graph.addVertex("Agra");
//		graph.addVertex("Delhi");
//		graph.addVertex("Jaipur");
//		graph.addEdge("Mathura", "Agra");
//		graph.addEdge("Mathura", "Jaipur");
//		graph.addEdge("Agra", "Mathura");
//		graph.addEdge("Agra", "Delhi");
//		graph.addEdge("Delhi", "Delhi");
//		System.out.println(graph.isEdge("Agra", "Delhi"));
//		System.out.println(graph.getNeighbours("Mathura"));
//		System.out.println(graph.getNeighbours("Agra"));
//		System.out.println(graph.getNeighbours("Delhi"));
//		System.out.println(graph.getNeighbours("Jaipur"));
//		graph.dfs("Mathura");
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		graph.addVertex("H");
		graph.addEdge("A", "C");
		graph.addEdge("B", "C");
		graph.addEdge("B", "D");
		graph.addEdge("C", "E");
		graph.addEdge("D", "F");
		graph.addEdge("E", "H");
		graph.addEdge("E", "F");
		graph.addEdge("F", "G");
		graph.dfs("A");
	}
}