package GUIs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import org.omg.CORBA.Any;

import Constants.Constants;
import Constants.Statics;
import Models.Graph;
import Models.Node;
import Services.Geometry_Services;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Drawing_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing_Panel() {

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (Statics.is_adding_node == true) {
					Graph graph = Statics.graph;

					ArrayList<Node> graph_nodes = graph.getNode_arr();

					int new_node_ID = graph_nodes.size();

					Node new_node = new Node(new_node_ID, e.getX(), e.getY());

					graph_nodes.add(new_node);

					graph.display();

					repaint();
				} else if (Statics.is_adding_edge == true) {
					Graph graph = Statics.graph;

					ArrayList<Node> graph_nodes = graph.getNode_arr();

					for (Node node : graph_nodes) {
						if (Geometry_Services.point_inside_node(e.getX(), e.getY(), node)) {

							if (Statics.selected_node_id == -1)
								Statics.selected_node_id = node.getID();
							else {
								Node prev_node = graph_nodes.get(Statics.selected_node_id);
								prev_node.add_next_node(node);
								node.add_next_node(prev_node);
								Statics.selected_node_id = -1;
							}
							break;
						}
					}

					repaint();

				}

			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		draw_all_element(g);
	}

	private void draw_all_element(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		this.setBackground(Color.WHITE);

		ArrayList<Node> current_graph_nodes = Statics.graph.getNode_arr();

		for (Node node : current_graph_nodes) {
			if (node.getID() == Statics.selected_node_id)
				g2d.setColor(Color.RED);
			g2d.fillOval((int) Math.round(node.getXP()), (int) Math.round(node.getYP()), Constants.node_radius,
					Constants.node_radius);

			g2d.setColor(Color.BLACK);
		}

		for (Node node : current_graph_nodes) {
			Set<Integer> edges_set = node.get_next_nodes_id();
			Iterator<Integer> ite = edges_set.iterator();

			while (ite.hasNext()) {
				Node target_node = current_graph_nodes.get(ite.next());
				this.draw_edge(g2d, node, target_node);
			}
		}
	}

	private void draw_edge(Graphics2D g2d, Node from_node, Node to_node) {
		int radius = Constants.node_radius / 2;
		g2d.drawLine((int) from_node.getXP() + radius, (int) from_node.getYP() + radius, (int) to_node.getXP() + radius,
				(int) to_node.getYP() + radius);
	}

}
