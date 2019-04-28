package GUIs;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Finish_Action_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Finish_Action_Panel() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton Finish_Action_Button = new JButton("FINISH MY ACTION");
		add(Finish_Action_Button);

	}

}
