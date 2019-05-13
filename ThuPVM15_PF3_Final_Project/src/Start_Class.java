import java.awt.EventQueue;

import Constants.Statics;
import GUIs.Main_Window;

public class Start_Class {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Window window = Statics.main_window;
					window.getFrame().setTitle("Network Simulation Application");
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
