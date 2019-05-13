package GUIs;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSeparator;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Main_Window {

	private JFrame frame;
	public static JPanel Drawing_Panel;
	private JPanel Element_Panel;
	private JPanel Shortest_Path_Panel;
	private JPanel Spanning_Tree_Panel;
	private JPanel Control_Panel;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JSeparator separator;
	/**
	 * Create the application.
	 */
	public Main_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(100, 100, screenSize.width-50, screenSize.height-50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setLocationRelativeTo(null);
		
		Drawing_Panel = new Drawing_Panel();
		frame.getContentPane().add(Drawing_Panel, BorderLayout.CENTER);
		
		Control_Panel = new JPanel();
		frame.getContentPane().add(Control_Panel, BorderLayout.SOUTH);
		Control_Panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		Element_Panel = new Element_Panel();
		Control_Panel.add(Element_Panel);
		
		Shortest_Path_Panel = new Shortest_Path_Panel();
		Control_Panel.add(Shortest_Path_Panel);
		
		Spanning_Tree_Panel = new Spanning_Tree_Panel();
		
		Control_Panel.add(Spanning_Tree_Panel);
		
		menuBar = new JMenuBar();
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		mnNewMenu = new JMenu("ADMINISTRATOR'S TOOLS");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("RESET");
		mnNewMenu.add(mntmNewMenuItem);
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmNewMenuItem_1 = new JMenuItem("EXIT");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JPanel getElement_Panel() {
		return Element_Panel;
	}

	public JPanel getShortest_Path_Panel() {
		return Shortest_Path_Panel;
	}

	public JPanel getSpanning_Tree_Panel() {
		return Spanning_Tree_Panel;
	}
	
	

}
