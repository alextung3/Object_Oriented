package midterm;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Canvas extends JPanel{
	
	private Graphics2D g2;
	
	Canvas(){
		setBackground(Color.WHITE);
		setBounds(50,50,800,600);
	}
	
	
	public void set_Draw_class(Toolbar mode) {
		addMouseListener( new MouseAdapter() {
			public void  mouseClicked(MouseEvent e) {
				if(mode.get_mode() == 1) {
					System.out.printf("I'm here");
					new draw_class(e.getX(),e.getY());
				}
			}
		});
	}
}
