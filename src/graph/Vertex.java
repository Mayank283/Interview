package graph;

public class Vertex {

	private String label;
	private boolean visited;

	public Vertex(String label) {
		super();
		this.label = label;
		this.visited = false;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vertex [label=" + label + "]";
	}
}