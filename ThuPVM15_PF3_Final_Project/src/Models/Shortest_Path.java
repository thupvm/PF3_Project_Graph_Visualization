package Models;

import java.util.Set;

public class Shortest_Path {
	private Set<Integer> node_id;
	private double[][] edge;
	private double total_distance;
	public Shortest_Path(Set<Integer> node_id, double[][] edge, double total_distance) {
		super();
		this.node_id = node_id;
		this.edge = edge;
		this.total_distance = total_distance;
	}
	public Set<Integer> getNode_id() {
		return node_id;
	}
	public void setNode_id(Set<Integer> node_id) {
		this.node_id = node_id;
	}
	public double[][] getEdge() {
		return edge;
	}
	public void setEdge(double[][] edge) {
		this.edge = edge;
	}
	public double getTotal_distance() {
		return total_distance;
	}
	public void setTotal_distance(double total_distance) {
		this.total_distance = total_distance;
	}

	

}
