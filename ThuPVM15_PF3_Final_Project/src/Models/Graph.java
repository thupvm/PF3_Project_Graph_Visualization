package Models;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Node> node_arr = new ArrayList<>();

	public Graph(ArrayList<Node> node_arr) {
		super();
		this.node_arr = node_arr;
	}

	public Graph() {
		super();
	}

	public ArrayList<Node> getNode_arr() {
		return node_arr;
	}

	public void setNode_arr(ArrayList<Node> node_arr) {
		this.node_arr = node_arr;
	}

	public void display() {
		for (Node node: node_arr) {
			System.out.println(node.toString());
		}
	}
	
	

}
