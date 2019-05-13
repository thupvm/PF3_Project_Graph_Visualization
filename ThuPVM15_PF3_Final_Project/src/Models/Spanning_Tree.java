package Models;

import java.util.Set;

public class Spanning_Tree {
	private double total_distance;
	private Set<Integer> nodes_id;
	private double[][] edges;
	public Spanning_Tree(double total_distance, Set<Integer> nodes_id, double[][] edges) {
		super();
		this.total_distance = total_distance;
		this.nodes_id = nodes_id;
		this.edges = edges;
	}
	public double getTotal_distance() {
		return total_distance;
	}
	public void setTotal_distance(double total_distance) {
		this.total_distance = total_distance;
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
