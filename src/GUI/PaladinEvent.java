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
		Secret avenge = new Secret(false,false,false,false,false,false,false,true,false,false,false);
		Secret eye = new Secret(false,true,false,true,false,false,false,false,false,false,true);
		Secret noble_sacrifice = new Secret(true,true,true,true,false,false,false,false,false,false,false);
		Secret redemption = new Secret(false,false,false,false,false,true,false,false,false,false,false);
		Secret repentance = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		}
	}
	


