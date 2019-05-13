package Services;

import Models.Node;
import Models.Spanning_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Models.Graph;

public class Spanning_Tree_Service {
	private final int MAXC = 1000;
	private Graph target_graph;
	private boolean[] free;
	private double[] d;
	private int[] trace;
	private boolean connected;
	private int node_num;
	private double[][] res_distance;
	
	private double total_distance;

	public Spanning_Tree_Service(Graph g) {
		this.target_graph = g;
		this.node_num = this.target_graph.getNode_arr().size();
		this.free = new boolean[this.node_num];
		this.d = new double[this.node_num];
		this.trace = new int[this.node_num];
		this.res_distance = new double[this.node_num][this.node_num];
		for (int i = 0; i < this.node_num; i++) {
			for (int j = 0; j < this.node_num; j++)
				res_distance[i][j] = -1;
		}
		
		this.total_distance = 0;
		
	}

	private void init() {
		this.d[0] = 0;
		for (int i = 1; i < this.d.length; i++)
			this.d[i] = MAXC;
		for (int i = 0; i < this.free.length; i++) {
			this.free[i] = true;
		}
	}

	private void Prim() {
		int k, i, u, v;
		double min;
		
		ArrayList<Node> node_arr = this.target_graph.getNode_arr();
		this.connected = true;
		for (k = 0; k < this.node_num - 1; k++) {
			u = -1;
			min = MAXC;

			for (i = 0; i < this.node_num - 1; i++) {
				if ((this.free[i]) && (this.d[i] < min)) {
					System.out.println("node: "+i);
					min = this.d[i];
					u = i;
				}
			}

			if (u == -1) {
				this.connected = false;
				break;
			}
			
			System.out.println("Dinh u la"+ u);

			this.free[u] = false;

			Node node_u = node_arr.get(u);
			System.out.println(node_u.toString());

			Iterator<Integer> next_nodes_id = node_u.get_next_nodes_id().iterator();

			while (next_nodes_id.hasNext()) {
				v = next_nodes_id.next();
				
				Node node_v = node_arr.get(v);
				System.out.println("Dinh v la"+ node_v.toString()+" "+free[v]);
				if (free[v]) {
					System.out.println("In");
					double distance_u_v = Geometry_Services
							.distance_between_2_points(node_u.getXP(), node_u.getYP(),
							node_v.getXP(), node_v.getYP());
					System.out.println("Day ne"+distance_u_v);
					if (d[v] > distance_u_v) {
						d[v] = distance_u_v;
						this.trace[v] = u;
						this.total_distance += distance_u_v;
					}
				}
			}
		}
	}
	
	public Spanning_Tree get_result() {
		int v, w;
		Set<Integer> res_node_id = new HashSet<>();
		this.init();
		this.Prim();
		if (this.connected == false)
			System.out.println("Graph is not connected");
		else {
			System.out.println("Minium Spanning Tree: ");
			w = 0;
			for (v = 1; v < this.node_num; v++) {
				System.out.println("Edge: "+v+" "+this.trace[v]);
				
				res_distance[v][this.trace[v]] = 0;
				res_distance[this.trace[v]][v] = 0;
				res_node_id.add(v);
				res_node_id.add(this.trace[v]);
			}
		}
		
		return new Spanning_Tree(total_distance, res_node_id, res_distance);
	}

}
