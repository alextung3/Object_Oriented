package midterm;

import java.awt.Graphics;

import javax.swing.JPanel;

public class draw_class extends JPanel{
	private int x,y;
	draw_class(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x, y,100,100);
	}
}
