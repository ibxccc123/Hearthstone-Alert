package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver {
	public static void main (String [] args) {
	
		JFrame frame = new JFrame("Hearthstone Secret Tracker");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(700, 600);
		
		JButton button1 = new JButton("Hunter");
		button1.addActionListener(new HunterEvent());
		panel1.add(button1);
		
		JButton button2 = new JButton("Mage");
		button2.addActionListener(new MageEvent());
		panel2.add(button2);
		
		JButton button3 = new JButton("Paladin");
		button3.addActionListener(new PaladinEvent());
		panel3.add(button3);
		
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.LINE_START);
		frame.getContentPane().add(panel3, BorderLayout.LINE_END);
		
	}
}
