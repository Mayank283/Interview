package graph;

public class DepthFirstSearchGraphTest {

	public static void main(String[] args) {
		DepthFirstSearchGraph graph = new DepthFirstSearchGraph(4);
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addEdge('A', 'B');
		graph.addEdge('A', 'D');
		graph.addEdge('B', 'A');
		graph.addEdge('B', 'C');
		graph.addEdge('C', 'C');
		System.out.println(graph.isEdge('B', 'C'));
		System.out.println(graph.getNeighbours('A'));
		System.out.println(graph.getNeighbours('B'));
		System.out.println(graph.getNeighbours('C'));
		System.out.println(graph.getNeighbours('D'));
		graph.displayVertex(1);
	}
}