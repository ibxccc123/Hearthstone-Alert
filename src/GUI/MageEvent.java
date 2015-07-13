package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MageEvent implements ActionListener {
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
		Secret duplicate = new Secret(false,false,false,false,false,true,false,false,false,false,false);
		Secret ice_barrier = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret mirror_entity = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		Secret counterspell = new Secret(false,false,false,false,false,false,false,false,true,false,false);
		Secret vaporize = new Secret(false,true,false,false,false,false,false,false,false,false,false);
		Secret ice_block = new Secret(false,false,false,false,false,false,true,false,false,false,false);
		Secret spellbender = new Secret(false,false,false,false,false,false,false,false,false,true,false);
		}
	}
	


