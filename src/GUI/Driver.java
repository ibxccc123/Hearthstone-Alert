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
		
		
		Secret freezing = new Secret();
		Secret explosive = new Secret();
		Secret snipe = new Secret();
		Secret misdirection = new Secret();
		Secret snake = new Secret();
		
		Secret duplicate = new Secret();
		Secret ice_barrier = new Secret();
		Secret mirror_entity = new Secret();
		Secret counterspell = new Secret();
		Secret vaporize = new Secret();
		Secret ice_block = new Secret();
		Secret spellbender = new Secret();
		
		Secret avenge = new Secret();
		Secret eye = new Secret();
		Secret noble_sacrifice = new Secret();
		Secret redemption = new Secret();
		Secret repentance = new Secret();
		
	

	}
}
