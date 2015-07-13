package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class HunterEvent implements ActionListener {
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
		Secret freezing = new Secret(true,true,false,false,false,false,false,false,false,false,false);
		Secret explosive = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret snipe = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		Secret misdirection = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret snake = new Secret(true,false,true,false,false,false,false,false,false,false,false);
		}
	}
	


