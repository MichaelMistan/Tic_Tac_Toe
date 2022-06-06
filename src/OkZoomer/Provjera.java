package OkZoomer;

public class Provjera {
	GUI g;
	boolean w;
	String win;
	
	public Provjera(GUI G) {
		g = G;
		w = false;
		win = " ";
	}
	
	public void Redci() {
		if((g.botuni[0].getText() == g.botuni[1].getText() && g.botuni[1].getText() == g.botuni[2].getText()) 
				&&  (g.botuni[0].getText() != " " && g.botuni[1].getText() != " " && g.botuni[2].getText() != " ")) {
			w = true;
			win = g.botuni[0].getText();
		}
		if(g.botuni[3].getText() == g.botuni[4].getText() && g.botuni[4].getText() == g.botuni[5].getText()
				&& (g.botuni[3].getText() != " " && g.botuni[4].getText() != " " && g.botuni[5].getText() != " ")) {
			w = true;
			win = g.botuni[3].getText();
		}
		if(g.botuni[6].getText() == g.botuni[7].getText() && g.botuni[7].getText() == g.botuni[8].getText()
				&& (g.botuni[6].getText() != " " && g.botuni[7].getText() != " " && g.botuni[8].getText() != " ")) {
			w = true;
			win = g.botuni[6].getText();
		}
	}
	
	public void Stupci() {
		if(g.botuni[0].getText() == g.botuni[3].getText() && g.botuni[3].getText() == g.botuni[6].getText()
			    && (g.botuni[0].getText() != " " && g.botuni[3].getText() != " " && g.botuni[6].getText() != " ")) {
			w = true;
			win = g.botuni[0].getText();
		}
		if(g.botuni[1].getText() == g.botuni[4].getText() && g.botuni[4].getText() == g.botuni[7].getText()
				&& (g.botuni[1].getText() != " " && g.botuni[4].getText() != " " && g.botuni[7].getText() != " ")) {
			w = true;
			win = g.botuni[1].getText();
		}
		if(g.botuni[2].getText() == g.botuni[5].getText() && g.botuni[5].getText() == g.botuni[8].getText()
				&& (g.botuni[2].getText() != " " && g.botuni[5].getText() != " " && g.botuni[8].getText() != " ")) {
			w = true;
			win = g.botuni[2].getText();
		}
	}
	
	public void Dijagonale() {
		if(g.botuni[0].getText() == g.botuni[4].getText() && g.botuni[4].getText() == g.botuni[8].getText()
				&& (g.botuni[0].getText() != " " && g.botuni[4].getText() != " " && g.botuni[8].getText() != " ")) {
			w = true;
			win = g.botuni[0].getText();
		}
		if(g.botuni[2].getText() == g.botuni[4].getText() && g.botuni[4].getText() == g.botuni[6].getText()
				&& (g.botuni[2].getText() != " " && g.botuni[4].getText() != " " && g.botuni[6].getText() != " ")) {
			w = true;
			win = g.botuni[2].getText();
		}
	}
	
	public boolean provsve() {
		Redci();
		Stupci();
		Dijagonale();
		return w;
	}
	
	public boolean AIstup11() {
		if((g.botuni[0].getText() == g.botuni[3].getText()) && (g.botuni[0].getText() != " " && g.botuni[3].getText() != " ")) return true;
		else return false;
	}

	public boolean AIstup12() {
		if((g.botuni[0].getText() == g.botuni[6].getText()) && (g.botuni[0].getText() != " " && g.botuni[6].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup13() {
		if((g.botuni[3].getText() == g.botuni[6].getText()) && (g.botuni[3].getText() != " " && g.botuni[6].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup21() {
		if((g.botuni[1].getText() == g.botuni[4].getText()) && (g.botuni[1].getText() != " " && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup22() {
		if((g.botuni[1].getText() == g.botuni[7].getText()) && (g.botuni[1].getText() != " " && g.botuni[7].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup23() {
		if((g.botuni[4].getText() == g.botuni[7].getText()) && (g.botuni[4].getText() != " " && g.botuni[7].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup31() {
		if((g.botuni[2].getText() == g.botuni[5].getText()) && (g.botuni[2].getText() != " " && g.botuni[5].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup32() {
		if((g.botuni[2].getText() == g.botuni[8].getText()) && (g.botuni[2].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIstup33() {
		if((g.botuni[5].getText() == g.botuni[8].getText()) && (g.botuni[5].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred11() {
		if((g.botuni[0].getText() == g.botuni[1].getText()) && (g.botuni[0].getText() != " " && g.botuni[1].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred12() {
		if((g.botuni[0].getText() == g.botuni[2].getText()) && (g.botuni[0].getText() != " " && g.botuni[2].getText() != " ")) return true;
		else return false;
	}

	public boolean AIred13() {
		if((g.botuni[1].getText() == g.botuni[2].getText()) && (g.botuni[1].getText() != " " && g.botuni[2].getText() != " ")) return true;
		else return false;
	}

	public boolean AIred21() {
		if((g.botuni[3].getText() == g.botuni[4].getText()) && (g.botuni[3].getText() != " " && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred22() {
		if((g.botuni[3].getText() == g.botuni[5].getText()) && (g.botuni[3].getText() != " " && g.botuni[5].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred23() {
		if((g.botuni[4].getText() == g.botuni[5].getText()) && (g.botuni[4].getText() != " " && g.botuni[5].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred31() {
		if((g.botuni[6].getText() == g.botuni[7].getText()) && (g.botuni[6].getText() != " " && g.botuni[7].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred32() {
		if((g.botuni[6].getText() == g.botuni[8].getText()) && (g.botuni[6].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIred33() {
		if((g.botuni[7].getText() == g.botuni[8].getText()) && (g.botuni[7].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag11() {
		if((g.botuni[0].getText() == g.botuni[4].getText()) && (g.botuni[0].getText() != " " && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag12() {
		if((g.botuni[0].getText() == g.botuni[8].getText()) && (g.botuni[0].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag13() {
		if((g.botuni[4].getText() == g.botuni[8].getText()) && (g.botuni[4].getText() != " " && g.botuni[8].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag21() {
		if((g.botuni[2].getText() == g.botuni[4].getText()) && (g.botuni[2].getText() != " " && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag22() {
		if((g.botuni[2].getText() == g.botuni[6].getText()) && (g.botuni[2].getText() != " " && g.botuni[6].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiag23() {
		if((g.botuni[4].getText() == g.botuni[6].getText()) && (g.botuni[4].getText() != " " && g.botuni[6].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiagdef1() {
		if((g.botuni[0].getText() == g.botuni[8].getText()) && (g.botuni[4].getText() != g.botuni[0].getText() && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
	
	public boolean AIdiagdef2() {
		if((g.botuni[2].getText() == g.botuni[6].getText()) && (g.botuni[4].getText() != g.botuni[2].getText() && g.botuni[4].getText() != " ")) return true;
		else return false;
	}
}