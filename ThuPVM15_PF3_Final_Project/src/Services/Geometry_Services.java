package Services;

import Constants.Constants;
import Models.Node;

public class Geometry_Services {

	public static double distance_between_2_points(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	
	public static double distance_between_2_points(Node n1, Node n2) {
		double x1 = n1.getXP();
		double y1 = n1.getYP();
		double x2 = n2.getXP();
		double y2 = n2.getYP();
		
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static boolean point_inside_node(int x, int y, Node node) {
		return distance_between_2_points(x, y, (int) node.getXP(), (int) node.getYP()) <= Constants.node_radius;
	}

}
