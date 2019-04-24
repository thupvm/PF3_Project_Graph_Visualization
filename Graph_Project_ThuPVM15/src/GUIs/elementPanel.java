package GUIs;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class elementPanel extends JPanel {
	private JButton addNodeBTN, addEdgeBTN;

	/**
	 * Create the panel.
	 */
	public elementPanel() {
		setLayout(new GridLayout(2, 1, 0, 0));
		
		addNodeBTN = new JButton("ADD NODE");
		add(addNodeBTN);
		
		addEdgeBTN = new JButton("ADD EDGE");
		add(addEdgeBTN);

	}

	public JButton getAddNodeBTN() {
		return addNodeBTN;
	}

	public void setAddNodeBTN(JButton addNodeBTN) {
		this.addNodeBTN = addNodeBTN;
	}

	public JButton getAddEdgeBTN() {
		return addEdgeBTN;
	}

	public void setAddEdgeBTN(JButton addEdgeBTN) {
		this.addEdgeBTN = addEdgeBTN;
	}
	
	

}
