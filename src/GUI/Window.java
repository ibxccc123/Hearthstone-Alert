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
		
		/* Instead of having three event classes, they are all compressed below.
		 * Reason for this: I'm not sure how to pass the JFrame down to the Event classes
		 * that we created before.  We'll expand each actionPerformed to do its full job here,
		 * in the Window class.
		 * 
		 * Right now, all they do is resize the windows when clicked on.
		 */
		
		JButton hunterButton = new JButton("Hunter");
		hunterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
        		Secret freezing = new Secret(true,true,false,false,false,false,false,false,false,false,false);
        		Secret explosive = new Secret(false,true,false,true,false,false,false,false,false,false,false);
        		Secret snipe = new Secret(false,false,false,false,true,false,false,false,false,false,false);
        		Secret misdirection = new Secret(false,true,false,true,false,false,false,false,false,false,false);
        		Secret snake = new Secret(true,false,true,false,false,false,false,false,false,false,false);
            	frame.setSize(200, 200);
            }
        });
		panel1.add(hunterButton);
		
		JButton mageButton = new JButton("Mage");
		mageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	Secret duplicate = new Secret(false,false,false,false,false,true,false,false,false,false,false);
        		Secret ice_barrier = new Secret(false,true,false,true,false,false,false,false,false,false,false);
        		Secret mirror_entity = new Secret(false,false,false,false,true,false,false,false,false,false,false);
        		Secret counterspell = new Secret(false,false,false,false,false,false,false,false,true,false,false);
        		Secret vaporize = new Secret(false,true,false,false,false,false,false,false,false,false,false);
        		Secret ice_block = new Secret(false,false,false,false,false,false,true,false,false,false,false);
        		Secret spellbender = new Secret(false,false,false,false,false,false,false,false,false,true,false);
            	frame.setSize(200, 200);
            }
        });
		panel2.add(mageButton);
		
		JButton pallyButton = new JButton("Paladin");
		pallyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	Secret avenge = new Secret(false,false,false,false,false,false,false,true,false,false,false);
        		Secret eye = new Secret(false,true,false,true,false,false,false,false,false,false,true);
        		Secret noble_sacrifice = new Secret(true,true,true,true,false,false,false,false,false,false,false);
        		Secret redemption = new Secret(false,false,false,false,false,true,false,false,false,false,false);
        		Secret repentance = new Secret(false,false,false,false,true,false,false,false,false,false,false);
            	frame.setSize(200, 200);
            }
        });
		panel3.add(pallyButton);
		
		
		//Adds the buttons to the JFrame, with the panels they're each in.
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.LINE_START);
		frame.getContentPane().add(panel3, BorderLayout.LINE_END);
		

		
	}

}
