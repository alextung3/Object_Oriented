package midterm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paint_line extends JPanel{
	private int old_x=-1,old_y=-1;
	private Image image;
	private Graphics2D g2;
	public paint_line() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(old_x == -1 && old_y == -1 ) {
					old_x = e.getX();
					old_y = e.getY();
				}
				else {
					if(g2 != null) {
						g2.drawLine(old_x, old_y, e.getX(), e.getY());
						repaint();
						old_x = -1;
						old_y = -1;
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton p2d = new JButton("Press to draw!");
		p2d.setBounds(0, 0, 200, 60);
		p2d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new paint_line();
				p2d.setVisible(false);
			}
		});
		paint_line draw_area = new paint_line();
		JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.add(p2d);
        frame.add(draw_area);
        frame.setVisible(true);
	}
	protected void paintComponent(Graphics g) {
		if (image == null) {
		      // image to draw null ==> we create
		      image = createImage(getSize().width, getSize().height);
		      System.out.printf("%d , %d \n",getSize().width, getSize().height);
		      g2 = (Graphics2D) image.getGraphics();
		      // enable antialiasing
		      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		      // clear draw area
		      clear();
		    }
		 
		    g.drawImage(image, 0, 0, null);
	}
	public void clear() {
		  g2.setPaint(Color.white);
		  // draw white on entire draw area to clear
		  g2.fillRect(0, 0, getSize().width, getSize().height);
		  g2.setPaint(Color.black);
		  repaint();
	}
}
