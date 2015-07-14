package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	public void init(){
		
		final JFrame frame = new JFrame("Hearthstone Secret Tracker");
		//Panels add ability for organization.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		//App will exit on closing the window.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(700, 600);
		
		/* moved all lines where the Secrets are instantiated to SecretArray.java
		 * Instead the actionlisteners just create new SecretArrays
		 * 
		 * Also made it so the actionlisteners get rid of all buttons 
		 * should work properly
		 * We should discuss if we are making the loops in the actionlisteners or if the ALs call another function next
		 * 
		 */
		
		JButton hunterButton = new JButton("Hunter");
		hunterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray myHunterSecret = new SecretArray(1);
            	frame.setSize(200, 200);
            	frame.getContentPane().removeAll();
            }
        });
		panel1.add(hunterButton);
		
		JButton mageButton = new JButton("Mage");
		mageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray myMageSecret = new SecretArray(2);
            	frame.setSize(200, 200);
            	frame.getContentPane().removeAll();
            }
        });
		panel2.add(mageButton);
		
		JButton pallyButton = new JButton("Paladin");
		pallyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray myPallySecret = new SecretArray(3);
            	frame.setSize(200, 200);
            	frame.getContentPane().removeAll();
            }
        });
		panel3.add(pallyButton);
		
		
		//Adds the buttons to the JFrame, with the panels they're each in.
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.LINE_START);
		frame.getContentPane().add(panel3, BorderLayout.LINE_END);
		

		
	}

}
