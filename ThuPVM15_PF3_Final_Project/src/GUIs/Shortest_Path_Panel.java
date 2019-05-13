package GUIs;

import javax.swing.JPanel;

import Constants.Statics;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shortest_Path_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shortest_Path_Panel() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("This button is used for fiding the shortest path from node to node:");
		add(lblNewLabel);
		
		JButton Find_Shortest_Path_Button = new JButton("FIND THE SHORTEST PATH");
		Find_Shortest_Path_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Statics.is_finding_shortest_path = true;
				Statics.is_finding_spanning_tree = false;
				Statics.is_adding_node = false;
				Statics.is_adding_edge = false;
				
				JOptionPane.showMessageDialog(null, "Ready to find a shortest path to node to node!");
			}
		});
		add(Find_Shortest_Path_Button);

	}

}
