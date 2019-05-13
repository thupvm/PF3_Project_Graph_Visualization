package GUIs;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;

import Constants.Statics;
import Models.Spanning_Tree;
import Services.Spanning_Tree_Service;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Spanning_Tree_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Spanning_Tree_Panel() {
		setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("This button is used for finding the spanning tree of the graph:");
		add(lblNewLabel);
		
		JButton Find_Spanning_Tree_Button = new JButton("FIND THE SPANNING TREE OF THIS GRAPH");
		Find_Spanning_Tree_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statics.is_adding_edge = false;
				Statics.is_adding_node = false;
				Statics.is_finding_shortest_path = false;
				Statics.is_finding_spanning_tree = true;
				Spanning_Tree_Service STS = new Spanning_Tree_Service(Statics.graph);
				
				Spanning_Tree stp = STS.get_result();
				
				Statics.current_spanning_tree = stp;
				
				double[][] dis = Statics.current_spanning_tree.getEdges();
				
				for (int i = 0 ; i < dis[0].length; i++) {
					for (int j = 0 ; j < dis[0].length; j++)
						System.out.print(dis[i][j]+"----");
					System.out.println();
				}
				
				JOptionPane.showMessageDialog(null,"Total distance: "+ Math.round(Statics.current_spanning_tree.getTotal_distance()));
				
				Main_Window.Drawing_Panel.repaint();
			}
		});
		add(Find_Spanning_Tree_Button);

	}

}
