package OkZoomer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Main_Menu_Listen implements ActionListener {
	GUI g;
	JButton b;
	Boolean select;
	
	public Main_Menu_Listen(GUI G) {
		g=G;
		select = false;
	}
	
	public void actionPerformed(ActionEvent e) {
		b = (JButton)e.getSource();
		if (!select) {
			if (b == g.vs_AI) {
				g.singleplayer = true;
				g.vs_AI.setText("Play as X");
				g.vs_Human.setText("Play as O");
				select = true;
			}
			else if (b == g.vs_Human) {
				g.singleplayer = false;
				g.reset();
				g.game();
			}
			else if (b == g.menu) {
				g.main_menu();
			}
		}
		else if (select) {
			if (b == g.vs_AI) {
				g.player_x = true;
				select = false;
				g.reset();
				g.game();
			}
			else if (b == g.vs_Human) {
				g.player_x = false;
				select = false;
				g.reset();
				g.game();
			}
		}
	}

}
