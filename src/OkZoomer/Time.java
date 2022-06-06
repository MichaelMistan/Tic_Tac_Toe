package OkZoomer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time implements ActionListener {
	GUI g;
	int m;
	int s;
	String min;
	String sec;
	String time;
	
	public Time(GUI G) {
		g=G;
		s=0;
		m=0;
	}
	
	public void actionPerformed(ActionEvent e) {	
		s++;
		min = "";
		sec = "";
		if(s==60) {
			s=0;
			m++;
		}
		
		if(m<10) {
			min = "0"+m;
		}
		else min += m;
		
		if(s<10) {
			sec = "0"+s;
		}
		else sec += s;
		
		time = min+":"+sec;
		
		g.timer.setText(time);
	}
	
	public void resetTime() {
		s=0;
		m=0;
	}
}
