package OkZoomer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class Obrada_Botun implements ActionListener {
	boolean p;
	Provjera pr;
	GUI g;
	Random r;
	int k;
	int br;
	JButton b;
	Boolean x;
	String AI;
	String player;
	
	public Obrada_Botun(GUI G) {
		g = G;
		r = new Random();
		k = 0;
		br = 0;
		x = true;
		pr = new Provjera(g);
	}
	
	public void actionPerformed(ActionEvent e) {
		b = (JButton)e.getSource();
		if (g.singleplayer) {
			if (g.player_x) {
				AI = "O";
				player = "X";
				pr.win=" ";
				pr.w=false;
				b.setText(player);
				b.setEnabled(false);
				br++;
				if(pr.provsve()) {
					end();
					return;
				}
				if(br==5) {
					end();
					return;
				}
				AI();
				if(pr.provsve()) {
					end();
					return;
				}
			}
			else if(!g.player_x) {
				AI = "X";
				player = "O";
				pr.win=" ";
				pr.w=false;			
				b.setText(player);
				b.setEnabled(false);
				if(pr.provsve()) {
					end();
					return;
				}
				AI();				
				if(pr.provsve()) {
					end();
					return;
				}
				br++;
				if(br==5) {
					end();
					return;
				}
			}
		}
		else if(!g.singleplayer) {
			pr.win=" ";
			pr.w=false;
			if (x) {
				b.setText("X");
				b.setEnabled(false);
				br++;
				x = false;
				if(pr.provsve()) {
					end();
					return;
				}
				if(br==5) {
					end();
					return;
				}
			}
			else if(!x) {
				b.setText("O");
				b.setEnabled(false);
				x = true;
				if(pr.provsve()) {
					end();
					return;
				}
			}
		}
	}
	
	public void AI() {
		if(AIproac()) return;
		else if (AIpass()) return;
		else {
			k = r.nextInt(2);
			switch (k) {
			case 0:
				for (int i=0; i<g.botuni.length;i++) {
					if(g.botuni[i].getText() == " ") {
						g.botuni[i].setText(AI);
						g.botuni[i].setEnabled(false);
						break;
					}
				}
				break;
			case 1:
				for (int i=g.botuni.length; i>0;i--) {
					if(g.botuni[i].getText() == " ") {
						g.botuni[i].setText(AI);
						g.botuni[i].setEnabled(false);
						break;
					}
				}
				break;
			}
		}
	}
	
	public boolean AIproac() {
		if(pr.AIstup11() && g.botuni[6].getText() == " ") {
			g.botuni[6].setText(AI);
			g.botuni[6].setEnabled(false);
			return true;
		}
		else if(pr.AIstup12() && g.botuni[3].getText() == " ") {
			g.botuni[3].setText(AI);
			g.botuni[3].setEnabled(false);
			return true;
		}
		else if(pr.AIstup13() && g.botuni[0].getText() == " ") {
			g.botuni[0].setText(AI);
			g.botuni[0].setEnabled(false);
			return true;
		}
		else if(pr.AIstup21() && g.botuni[7].getText() == " ") {
			g.botuni[7].setText(AI);
			g.botuni[7].setEnabled(false);
			return true;
		}
		else if(pr.AIstup22() && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if(pr.AIstup23() && g.botuni[1].getText() == " ") {
			g.botuni[1].setText(AI);
			g.botuni[1].setEnabled(false);
			return true;
		}
		else if(pr.AIstup31() && g.botuni[8].getText() == " ") {
			g.botuni[8].setText(AI);
			g.botuni[8].setEnabled(false);
			return true;
		}
		else if(pr.AIstup32() && g.botuni[5].getText() == " ") {
			g.botuni[5].setText(AI);
			g.botuni[5].setEnabled(false);
			return true;
		}
		else if(pr.AIstup33() && g.botuni[2].getText() == " ") {
			g.botuni[2].setText(AI);
			g.botuni[2].setEnabled(false);
			return true;
		}
		else if(pr.AIred11() && g.botuni[2].getText() == " ") {
			g.botuni[2].setText(AI);
			g.botuni[2].setEnabled(false);
			return true;
		}
		else if(pr.AIred12() && g.botuni[1].getText() == " ") {
			g.botuni[1].setText(AI);
			g.botuni[1].setEnabled(false);
			return true;
		}
		else if(pr.AIred13() && g.botuni[0].getText() == " ") {
			g.botuni[0].setText(AI);
			g.botuni[0].setEnabled(false);
			return true;
		}
		else if(pr.AIred21() && g.botuni[5].getText() == " ") {
			g.botuni[5].setText(AI);
			g.botuni[5].setEnabled(false);
			return true;
		}
		else if(pr.AIred22() && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if(pr.AIred23() && g.botuni[3].getText() == " ") {
			g.botuni[3].setText(AI);
			g.botuni[3].setEnabled(false);
			return true;
		}
		else if(pr.AIred31() && g.botuni[8].getText() == " ") {
			g.botuni[8].setText(AI);
			g.botuni[8].setEnabled(false);
			return true;
		}
		else if(pr.AIred32() && g.botuni[7].getText() == " ") {
			g.botuni[7].setText(AI);
			g.botuni[7].setEnabled(false);
			return true;
		}
		else if(pr.AIred33() && g.botuni[6].getText() == " ") {
			g.botuni[6].setText(AI);
			g.botuni[6].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag11() && g.botuni[8].getText() == " ") {
			g.botuni[8].setText(AI);
			g.botuni[8].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag12() && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag13() && g.botuni[0].getText() == " ") {
			g.botuni[0].setText(AI);
			g.botuni[0].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag21() && g.botuni[6].getText() == " ") {
			g.botuni[6].setText(AI);
			g.botuni[6].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag22() && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if(pr.AIdiag23() && g.botuni[2].getText() == " ") {
			g.botuni[2].setText(AI);
			g.botuni[2].setEnabled(false);
			return true;
		}
		
		else if(pr.AIdiagdef1()) {
			k = r.nextInt(2);
			switch (k) {
			case 0:
				if (g.botuni[6].getText() == " "){
					g.botuni[6].setText(AI);
					g.botuni[6].setEnabled(false);
					return true;
				}
			case 1:
				if (g.botuni[2].getText() == " "){
					g.botuni[2].setText(AI);
					g.botuni[2].setEnabled(false);
					return true;
				}
			default: 
				return false;
			}
		}
		
		else if(pr.AIdiagdef2()) {
			k = r.nextInt(2);
			switch (k) {
			case 0:
				if (g.botuni[0].getText() == " "){
					g.botuni[0].setText(AI);
					g.botuni[0].setEnabled(false);
					return true;
				}
			case 1:
				if (g.botuni[8].getText() == " "){
					g.botuni[8].setText(AI);
					g.botuni[8].setEnabled(false);
					return true;
				}
			default: 
				return false;
			}
		}
		else return false;
	}
	
	public boolean AIpass() {
		if (g.botuni[4].getText() != " ") {
			if(AImidpass())return true;
		}
		else if (g.botuni[0].getText() != " " && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if (g.botuni[2].getText() != " " && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if (g.botuni[6].getText() != " " && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if (g.botuni[8].getText() != " " && g.botuni[4].getText() == " ") {
			g.botuni[4].setText(AI);
			g.botuni[4].setEnabled(false);
			return true;
		}
		else if (g.botuni[1].getText() != " " ){
			if(AIsidpass())return true;
		}
		else if (g.botuni[3].getText() != " "){
			if(AIsidpass())return true;
		}
		else if (g.botuni[5].getText() != " "){
			if(AIsidpass())return true;
		}
		else if (g.botuni[7].getText() != " "){
			if(AIsidpass())return true;
		}
		else return false;
		return false;
	}
	
	public boolean AIsidpass() {
		for (int i = 0;i<=5;i++) {
			k = r.nextInt(2);
			switch (k) {
			case 0:
				if(AImidpass())return true;
				break;
			case 1:
				if (g.botuni[4].getText() == " "){
					g.botuni[4].setText(AI);
					g.botuni[4].setEnabled(false);
					return true;
				}
				break;
			}
		}
		return false;
	}
	
	public boolean AImidpass() {
		for (int i = 0;i<=10;i++) {
			k = r.nextInt(4);
			switch (k) {
			case 0:
				if (g.botuni[0].getText() == " "){
					g.botuni[0].setText(AI);
					g.botuni[0].setEnabled(false);
					return true;
				}
				break;
			case 1:
				if (g.botuni[2].getText() == " "){
					g.botuni[2].setText(AI);
					g.botuni[2].setEnabled(false);
					return true;
				}
				break;
			case 2:
				if (g.botuni[6].getText() == " "){
					g.botuni[6].setText(AI);
					g.botuni[6].setEnabled(false);
					return true;
				}
				break;
			case 3:
				if (g.botuni[8].getText() == " "){
					g.botuni[8].setText(AI);
					g.botuni[8].setEnabled(false);
					return true;
				}
				break;
			}
		}
		return false;
	}
	
	public void end() {
		for(int i = 0;i<g.botuni.length;i++) {
			g.botuni[i].setEnabled(false);
		}
		if(g.singleplayer) {
			if(pr.win.equals(player)) g.winner.setText("You Won in "+g.ot.time+"!!!");
			else if(pr.win.equals(AI)) g.winner.setText("You Lost in "+g.ot.time+"!!!");
			else g.winner.setText("It was a Tie after "+g.ot.time+"!!!");
		}
		if(!g.singleplayer) {
			if(pr.win.equals("X")) g.winner.setText("Player X Wins in "+g.ot.time+"!!!");
			else if(pr.win.equals("O")) g.winner.setText("Player O Wins in "+g.ot.time+"!!!");
			else g.winner.setText("It was a Tie after "+g.ot.time+"!!!");
			x = true;
		}
		g.end();
	}
}
