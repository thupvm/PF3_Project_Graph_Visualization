package GUIs;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Spanning_Tree_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Spanning_Tree_Panel() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("This button is used for finding the spanning tree of the graph:");
		add(lblNewLabel);
		
		JButton Find_Spanning_Tree_Button = new JButton("FIND THE SPANNING TREE OF THIS GRAPH");
		add(Find_Spanning_Tree_Button);

	}

}
