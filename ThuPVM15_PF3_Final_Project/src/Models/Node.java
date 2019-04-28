package Models;

import java.util.HashSet;
import java.util.Set;

public class Node {
	private int ID;
	private double XP;
	private double YP;
	private Set<Integer> next_nodes_id = new HashSet<>();

	public Node(int iD, double xP, double yp) {
		super();
		ID = iD;
		XP = xP;
		YP = yp;
	}

	public Node() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getXP() {
		return XP;
	}

	public void setXP(double xP) {
		XP = xP;
	}

	public double getYP() {
		return YP;
	}

	public void setYP(double yP) {
		YP = yP;
	}

	@Override
	public String toString() {
		return "Node [ID=" + ID + ", XP=" + XP + ", YP=" + YP + "]";
	}
	
	public void add_next_node(Node o) {
		this.next_nodes_id.add(o.getID());
	}
	
	public Set<Integer> get_next_nodes_id(){
		return this.next_nodes_id;
	}
	
	public boolean is_next(Node o) {
		return this.next_nodes_id.contains(o.getID());
	}

}
