package Services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Models.Graph;
import Models.Node;
import Models.Shortest_Path;

public class Shortest_Path_Service {
	private final int Max_C = Integer.MAX_VALUE;

	private double[] d;
	private int[] trace;
	private boolean[] free;
	private int n, S, F;
	private double sum_distance = -1;

	private Graph target_graph;
	private ArrayList<Node> node_arr;

	public Shortest_Path_Service(Graph g, int S, int F) {
		this.target_graph = g;
		this.node_arr = this.target_graph.getNode_arr();
		this.n = this.node_arr.size();

		d = new double[n];
		trace = new int[n];
		free = new boolean[n];
		this.S = S;
		this.F = F;

		System.out.println("bat dau o " + S + " ket thuc o " + F);

	}

	private void init() {
		for (int i = 0; i < n; i++) {
			this.d[i] = this.Max_C;
			this.trace[i] = S;
			this.free[i] = true;
		}

		Node start_node = this.node_arr.get(S);
		d[S] = 0;

		Iterator<Integer> next_node_ids = start_node.get_next_nodes_id().iterator();

		while (next_node_ids.hasNext()) {
			int next_node_id = next_node_ids.next();

			Node next_node = this.node_arr.get(next_node_id);

			d[next_node_id] = Geometry_Services.distance_between_2_points(start_node, next_node);
		}
	}

	private void Dijkstra() {
		int i, u, v;
		double min;

		do {
			u = -1;
			min = this.Max_C;

			for (i = 0; i < n; i++) {
				if (this.free[i] && this.d[i] < min) {
					min = this.d[i];
					u = i;
				}
			}

			if (u == -1 || u == this.F)
				break;

			this.free[u] = false;

			Node node_u = this.node_arr.get(u);

			Iterator<Integer> next_node_ids = node_u.get_next_nodes_id().iterator();

			System.err.println("u la " + u);

			while (next_node_ids.hasNext()) {
				v = next_node_ids.next();
				System.err.println("v la " + v);
				Node node_v = this.node_arr.get(v);
				double distance_from_2_node = Geometry_Services.distance_between_2_points(node_u, node_v);
				if ((this.free[v]) && (this.d[v] > this.d[u] + distance_from_2_node)) {
					this.d[v] = this.d[u] + distance_from_2_node;
					this.trace[v] = u;
				}
			}

		} while (true);
		
		this.sum_distance = this.d[F];
	}

	public void get_result() {
		this.init();
		this.Dijkstra();
		if (d[this.F] == this.Max_C) {

			
			System.out.println("The shortest path cannot be found!");
		} else {
			System.out.println("The shortest path is found!");
			

			while (this.F != this.S) {
				System.out.print(F + " <- ");
				this.F = this.trace[F];
			}

			System.out.println(S);
		}

	}
	
	public Shortest_Path get_STP() {
		Set<Integer> res_node = new HashSet<>();
		double[][] res_edge = new double[n][n];
		for (int i = 0; i < n ; i++)
			for (int j = 0; j < n ; j++)
				res_edge[i][j] = this.Max_C;
		
		
		
		
		this.init();
		this.Dijkstra();
		if (d[this.F] == this.Max_C) {

			for (double val : this.d)
				System.out.println(val + " -- ");
			System.out.println("The shortest path cannot be found!");
			
			return null;
		} else {
			System.out.println("The shortest path is found!");
			
		

			while (this.F != this.S) {
				res_node.add(this.F);
				res_edge[this.F][this.trace[this.F]] = 1;
				res_edge[this.trace[this.F]][this.F] = 1;
				this.F = this.trace[this.F];
			}
			res_edge[this.F][this.S] = 1;
			res_edge[this.S][this.F] = 1;
			res_node.add(this.S);
			
			System.err.println(res_node.toString());
			System.err.println(sum_distance);
			
			
			return new Shortest_Path(res_node, res_edge, sum_distance);
		}
	}

}
