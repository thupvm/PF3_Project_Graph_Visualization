package Models;

import java.util.Set;

public class Spanning_Tree {
	private Set<Integer> nodes_id;
	private double[][] edges;
	public Spanning_Tree(Set<Integer> nodes_id, double[][] edges) {
		super();
		this.nodes_id = nodes_id;
		this.edges = edges;
	}
	public Set<Integer> getNodes_id() {
		return nodes_id;
	}
	public void setNodes_id(Set<Integer> nodes_id) {
		this.nodes_id = nodes_id;
	}
	public double[][] getEdges() {
		return edges;
	}
	public void setEdges(double[][] edges) {
		this.edges = edges;
	}
	
	

}
