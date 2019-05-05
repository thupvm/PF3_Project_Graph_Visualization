package GUIs;

import javax.swing.JPanel;

import Constants.Statics;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Element_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Element_Panel() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblThoseButtonsAre = new JLabel("Those buttons are used to add graph's elements: ");
		add(lblThoseButtonsAre);
		
		JButton add_node_button = new JButton("ADD NODE");
		add_node_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statics.is_adding_node = true;
				Statics.is_adding_edge = false;
				Statics.is_finding_shortest_path = false;
				Statics.is_finding_spanning_tree = false;
				JOptionPane.showMessageDialog(null, "Ready for adding node!");
			}
		});
		add(add_node_button);
		
		JButton add_edge_button = new JButton("ADD EDGE");
		add_edge_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statics.is_adding_edge = true;
				Statics.is_adding_node = false;
				Statics.is_finding_shortest_path = false;
				Statics.is_finding_spanning_tree = false;
				JOptionPane.showMessageDialog(null, "Ready for adding edge!");
			}
		});
		add(add_edge_button);

	}

}
