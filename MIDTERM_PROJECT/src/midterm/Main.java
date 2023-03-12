package midterm;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
	static Toolbar tool_bar;
	static Canvas canvas;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		tool_bar = new Toolbar();
		tool_bar.setBounds(0, 27, 60, 140);
		canvas = new Canvas();
		canvas.setSize(1014, 706);
		canvas.setLocation(60, 27);
		canvas.set_Draw_class(tool_bar);
		frame.setSize(1090, 772);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().setLayout(null);
	    frame.getContentPane().add(tool_bar);
	    frame.getContentPane().add(canvas);
	    frame.setVisible(true);
	}
}
