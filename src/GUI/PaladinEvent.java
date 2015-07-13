package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PaladinEvent implements ActionListener {
	private int i;
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ARTWORK IS MEANT TO BE SHOWN");
		System.out.println("IT WANTS TO BE SEEN");
		i++;
		JFrame frame = new JFrame("TEEHEE");
		frame.pack();
		frame.setVisible(true);
		frame.setBounds(i*100, i*100, 250, 50);
		}
	}
	


