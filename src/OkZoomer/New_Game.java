package OkZoomer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class New_Game implements ActionListener {
	GUI g;
	
	public New_Game(GUI G) {
		g=G;
	}
	
	public void actionPerformed(ActionEvent e) {
		g.reset();
	}
}
