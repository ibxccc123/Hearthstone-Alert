package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		frame.setSize(400, 400);
		
		/* moved all lines where the Secrets are instantiated to SecretArray.java
		 * Instead the actionlisteners just create new SecretArrays
		 * 
		 * Also made it so the actionlisteners get rid of all buttons 
		 * should work properly
		 * We should discuss if we are making the loops in the actionlisteners or if the ALs call another function next
		 * 
		 * If we are implementing an "Add Secret" function the ALs for Class choosing should not create a SecretArray and
		 * should instead just enter a new window where a "Add Secret" button exists.
		 */
	
		JButton hunterButton = new JButton("Hunter");
		hunterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	frame.setSize(400, 500);
            	SecretArray myHunterSecret = new SecretArray(1);
            	rework(frame, myHunterSecret);     	//AL's will call another function that can loop upon itself
            }
        });
		
		JButton mageButton = new JButton("Mage");
		mageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	frame.setSize(400, 500);
            	SecretArray myMageSecret = new SecretArray(1);
            	rework(frame, myMageSecret);     	
            }
        });	

		JButton pallyButton = new JButton("Paladin");
		pallyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	frame.setSize(400, 500);
            	SecretArray myPallySecret = new SecretArray(1);
            	rework(frame, myPallySecret);     	
            }
        });
		
		panel1.add(hunterButton);
		panel2.add(mageButton);
		panel3.add(pallyButton);
		//Adds the buttons to the JFrame, with the panels they're each in.
		frame.setLayout(new GridLayout(2, 2));
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.LINE_START);
		frame.getContentPane().add(panel3, BorderLayout.LINE_END);	
		
	}
	
	//Method that will loop upon itself to refresh the window every time it's called
	//Should remove elements of SecretArray every time a button is pressed
	//Define buttons' ActionListeners in here, or through another method
	public void rework(JFrame frame, SecretArray secrets){
		
    	frame.getContentPane().removeAll();
    	JPanel[] panelArray = new JPanel[20]; 
    	JButton[] buttonArray = new JButton[20];
    	for(int i=0; i<11; i++){  //Creating panels/buttons for triggers, 11 overall
    		panelArray[i] = new JPanel();
    		buttonArray[i] = new JButton("Placeholder");
    		buttonArray[i].addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e){
    				
    			}
    		});
    		panelArray[i].add(buttonArray[i]);
    	}
    	//12th panel is a JLabel for the text of what secrets are left
    	
    	//Start of placeholder code
		JLabel paneltext = new JLabel("Freezing, Explosive, Snipe, Misdirection, Snake");
    	panelArray[11] = new JPanel();
    	panelArray[11].add(paneltext);
    	
    	//End of placeholder Code
    	
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		for(int i=0; i<11; i++){
			panelArray[i].setBounds(50,50,100, i*70);
			frame.add(panelArray[i]);
		}
		frame.add(panelArray[11]);       
		
	}
	
}
