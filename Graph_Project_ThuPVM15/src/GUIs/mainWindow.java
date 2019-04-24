package GUIs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class mainWindow extends JFrame {

	private JPanel contentPane;
	private JPanel controlPanel, elementPanel, pathPanel, spanningTreePanel;
	private JPanel drawingPanel;
	private JComponent paintingPanel;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainWindow() {
		setTitle("Graph Simulator Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		controlPanel = new JPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		controlPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		elementPanel = new elementPanel();
		controlPanel.add(elementPanel);
		
		pathPanel = new JPanel();
		controlPanel.add(pathPanel);
		
		spanningTreePanel = new JPanel();
		controlPanel.add(spanningTreePanel);
		
		drawingPanel = new JPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		drawingPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPane = new JScrollPane();
		drawingPanel.add(scrollPane);
		
		paintingPanel = new paintingPanel();
		scrollPane.setViewportView(paintingPanel);
	}

}
