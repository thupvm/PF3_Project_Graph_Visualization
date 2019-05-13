package Constants;

import GUIs.Main_Window;
import Models.Graph;
import Models.Shortest_Path;
import Models.Spanning_Tree;

public class Statics {
	public static Main_Window main_window = new Main_Window();

	public static Graph graph = new Graph();
	public static boolean is_adding_node = false;
	public static boolean is_adding_edge = false;
	public static boolean is_finding_shortest_path = false;
	public static boolean is_finding_spanning_tree = false;
	public static int selected_node_id = -1;

	public static Spanning_Tree current_spanning_tree;

	public static int start_node_for_stp_id = -1;
	public static int end_node_for_stp_id = -1;
	
	public static Shortest_Path current_shortest_path = null;

}
