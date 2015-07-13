package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver {
	public static void main (String [] args) {
	
		JFrame frame = new JFrame("Hearthstone Secret Tracker");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(panel5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(700, 600);
		
		JButton button1 = new JButton("Hunter");
		button1.addActionListener(new Events());
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Mage");
		button2.addActionListener(new Events());
		frame.add(button2);
		
		JButton button3 = new JButton("Paladin");
		button3.addActionListener(new Events());
		frame.add(button3);
		
		//cancer
		Secret freezing = new Secret(true,true,false,false,false,false,false,false,false,false,false);
		Secret explosive = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret snipe = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		Secret misdirection = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret snake = new Secret(true,false,true,false,false,false,false,false,false,false,false);
		// mage
		Secret duplicate = new Secret(false,false,false,false,false,true,false,false,false,false,false);
		Secret ice_barrier = new Secret(false,true,false,true,false,false,false,false,false,false,false);
		Secret mirror_entity = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		Secret counterspell = new Secret(false,false,false,false,false,false,false,false,true,false,false);
		Secret vaporize = new Secret(false,true,false,false,false,false,false,false,false,false,false);
		Secret ice_block = new Secret(false,false,false,false,false,false,true,false,false,false,false);
		Secret spellbender = new Secret(false,false,false,false,false,false,false,false,false,true,false);
		// paladin
		Secret avenge = new Secret(false,false,false,false,false,false,false,true,false,false,false);
		Secret eye = new Secret(false,true,false,true,false,false,false,false,false,false,true);
		Secret noble_sacrifice = new Secret(true,true,true,true,false,false,false,false,false,false,false);
		Secret redemption = new Secret(false,false,false,false,false,true,false,false,false,false,false);
		Secret repentance = new Secret(false,false,false,false,true,false,false,false,false,false,false);
		
	

	}
}
