package midterm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	JButton BClass;
	JButton UClass;
	private int mode = 0;
	Toolbar(){
		bt_listener bt = new bt_listener();
		BClass = new JButton("B");
		UClass = new JButton("U");
		BClass.addActionListener(bt);
		setLayout(new GridLayout(2,1));
		setBounds(0, 0, 60, 200);
		add(BClass);
		add(UClass);
	}

	private class bt_listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == BClass) {
				BClass.setEnabled(false);
				mode = 1;
			}
		}
		
	}
	
	public int get_mode() {
		return mode;
	}
	
}
