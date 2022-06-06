package OkZoomer;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.*;

public class GUI {
	JFrame okvir;
	JPanel game;
	JPanel pan;
	JPanel main;
	JPanel reset;
	JPanel win;
	JPanel main_menu;
	JLabel timer;
	JLabel winner;
	JButton[] botuni;
	JButton ag;
	JButton vs_AI;
	JButton vs_Human;
	JButton menu;
	Obrada_Botun ob;
	New_Game ng;
	Main_Menu_Listen mm;
	Timer t;
	Time ot;
	Font bigFont;
	Font biggerFont;
	Boolean singleplayer;
	Boolean player_x;
	Color butonc;
	Color font;
	Color back;
	
 	GUI(){
		ob = new Obrada_Botun(this);
		ng = new New_Game(this);
		ot = new Time(this);
		mm = new Main_Menu_Listen(this);
		suc();
		slusac();
		main_menu();
	}
	
	public void suc() {
		okvir = new JFrame("Kriz Krug");
		game = new JPanel();
		pan = new JPanel();
		main = new JPanel();
		reset = new JPanel();
		win = new JPanel();
		main_menu = new JPanel();
		timer = new JLabel("00:00");
		winner = new JLabel("Game is currently in progress...");
		botuni = new JButton[9];
		ag = new JButton("Again???");
		menu = new JButton("Menu???");
		vs_AI = new JButton("Play against AI");
		vs_Human = new JButton("Play against a Human");
		bigFont = timer.getFont().deriveFont(Font.PLAIN, 20f);
		biggerFont = timer.getFont().deriveFont(Font.PLAIN, 25f);
		timer.setFont(bigFont);
		winner.setFont(bigFont);
		ag.setFont(bigFont);
		menu.setFont(bigFont);
		vs_AI.setFont(biggerFont);
		vs_Human.setFont(biggerFont);
		t = new Timer(1000, ot);
		butonc = new Color(27, 69, 67);
		font = new Color(255, 253, 155);
		back = new Color(18, 44, 43);
		player_x = true;
		
		vs_AI.setBackground(butonc);
		vs_Human.setBackground(butonc);
		ag.setBackground(butonc);
		menu.setBackground(butonc);
		main.setBackground(back);
		pan.setBackground(back);
		game.setBackground(back);
		win.setBackground(back);
		reset.setBackground(back);
		
		vs_AI.setForeground(font);
		vs_Human.setForeground(font);
		winner.setForeground(font);
		timer.setForeground(font);
		ag.setForeground(font);
		menu.setForeground(font);
		
		vs_AI.setBorder(BorderFactory.createLineBorder(font,1));
		vs_Human.setBorder(BorderFactory.createLineBorder(font,1));
		ag.setBorder(BorderFactory.createLineBorder(back,2));
		menu.setBorder(BorderFactory.createLineBorder(back,2));
		
		UIManager.put("Button.disabledText", new Color(255, 253, 155));
		
		pan.add(timer);
		for(int i=0; i<botuni.length;i++) {
			botuni[i] = new JButton(" ");
			botuni[i].setBackground(butonc);
			botuni[i].setBorder(BorderFactory.createLineBorder(font,1));

			game.add(botuni[i]);
		}
		reset.add(timer);
		win.add(winner);
		pan.add(win);
		pan.add(reset);
		main.add(pan);
		main.add(game);
		main_menu.add(vs_AI);
		main_menu.add(vs_Human);

		GridLayout ras = new GridLayout(3,3);
		ras.setHgap(15);
		ras.setVgap(15);
		game.setLayout(ras);
		win.setLayout(new BoxLayout(win, 0));
		reset.setLayout(new BoxLayout(reset, 0));
		pan.setLayout(new BoxLayout(pan, 1));
		main.setLayout(new BoxLayout(main, 1));
		main_menu.setLayout(new GridLayout(2, 1));
		
		okvir.setSize(600,700);
		okvir.setVisible(true);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void main_menu() {
		player_x = true;
		okvir.remove(main);
		okvir.add(main_menu);
	}
	
	public void game() {
		t.start();
		
		okvir.remove(main_menu);
		vs_AI.setText("Play against AI");
		vs_Human.setText("Play against a Human");
		okvir.add(main);
	}
	
	public void slusac() {
		for(int i=0;i<botuni.length;i++) {
			botuni[i].addActionListener(ob);
		}
		vs_AI.addActionListener(mm);
		vs_Human.addActionListener(mm);
		menu.addActionListener(mm);
	}
	
	public void end() {
		t.stop();
		reset.remove(timer);
		reset.add(ag);
		reset.add(menu);
		ag.addActionListener(ng);
	}
	
	public void reset() {
		reset.remove(ag);
		reset.remove(menu);
		reset.add(timer);
		winner.setText("Game is currently in progress...");
		ot.resetTime();
		t.start();
		for(int i=0;i<botuni.length;i++) {
			botuni[i].setEnabled(true);
			botuni[i].setText(" ");
		}
		ob.br=0;
		
		if (!player_x) {
			ob.AI = "X";
			ob.pr.win=" ";
			ob.pr.w=false;
			ob.br = 1;
			ob.AIsidpass();
		}
	}
}
