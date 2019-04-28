package GUIs;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Shortest_Path_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shortest_Path_Panel() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("This button is used for fiding the shortest path from node to node:");
		add(lblNewLabel);
		
		JButton Find_Shortest_Path_Button = new JButton("FIND THE SHORTEST PATH");
		add(Find_Shortest_Path_Button);

	}

}
