package GUI;

import java.awt.BorderLayout;
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
		frame.setVisible(true);
		frame.setSize(200, 400);
		
		//Initial Class Choice
		//The first cell of secrets[] is the first secret
		JButton hunterButton = new JButton("Hunter");
		hunterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray[] secrets = new SecretArray[5];
            	secrets[0] = new SecretArray(1);
            	rework(frame, secrets, 1);     	
            }
        });
		JButton mageButton = new JButton("Mage");
		mageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray[] secrets = new SecretArray[5];
            	secrets[0] = new SecretArray(2);
            	rework(frame, secrets, 2);   	
            }
        });	
		JButton pallyButton = new JButton("Paladin");
		pallyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	SecretArray[] secrets = new SecretArray[5];
            	secrets[0] = new SecretArray(3);
            	rework(frame, secrets, 3);      	
            }
        });
		
		panel1.add(hunterButton);
		panel2.add(mageButton);
		panel3.add(pallyButton);
		//Adds the buttons to the JFrame, with the panels they're each in.
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.LINE_START);
		frame.getContentPane().add(panel3, BorderLayout.LINE_END);	
		
		
	}
	
	//rework() takes in arguments for an array of SecretArrays(five in total), the JFrame, and class
	//rework() creates an array of JLabels and is passed an array of SecretArrays
	public void rework(final JFrame frame, final SecretArray[] secrets, final int secretType){
		
	 	frame.setSize(600, 500);
    	frame.getContentPane().removeAll();
    	JPanel[] panelArray = new JPanel[20]; 
    	JButton[] buttonArray = new JButton[20];
    	for(int i=0; i<11; i++){  //Creating panels/buttons for triggers, 11 triggers
    		panelArray[i] = new JPanel();
    		buttonArray[i] = new JButton();
    		panelArray[i].add(buttonArray[i]);
    	}
    	
    	//Array of JLabels to hold up to five different Secrets
    	final JLabel secretLabels[] = new JLabel[5];
		panelArray[11] = new JPanel();  
		final JLabel secretText = new JLabel(secrets[0].returnArray(secrets[0],secretType));
		secretLabels[0] = secretText; //The first and default JLabel Secret
		panelArray[11].add(secretText);
		
		for(int i=1; i<5; i++){  //Adding in all of the JLabels for Secrets to panelArray
			secretLabels[i] = new JLabel("---");
			panelArray[i+11] = new JPanel();
			panelArray[i+11].add(secretLabels[i]);
		}
		
		//Button for adding in a secret
		panelArray[16] = new JPanel();
		buttonArray[11] = new JButton("Add Another Secret");
		panelArray[16].add(buttonArray[11]);
		//Button for resetting the entire window 
		panelArray[17] = new JPanel();
		buttonArray[12] = new JButton("Reset");
		panelArray[17].add(buttonArray[12]);
    	
    	//ButtonArray populated with Action Listeners.
   		buttonArray[0].setText("Minion Attacks Enemy Minion");
		buttonArray[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(0, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[1].setText("Minion Attacks Enemy Hero");
		buttonArray[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(1, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[2].setText("Hero Attacks Enemy Minion");
		buttonArray[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(2, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[3].setText("Hero Attacks Enemy Hero");
		buttonArray[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(3, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[4].setText("Minion is Summoned");
		buttonArray[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(4, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[5].setText("Enemy Minion Dies");
		buttonArray[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(5, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[6].setText("Enemy Hero Dies");
		buttonArray[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(6, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[7].setText("Enemy Minion Dies with Enemy Minion Left on the Board");
		buttonArray[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(7, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[8].setText("Spell Cast");
		buttonArray[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(8, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[9].setText("Spell Cast on Enemy Minion");
		buttonArray[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(9, frame, secrets, secretType, secretLabels);
			}
		});
		buttonArray[10].setText("Spell Cast on Enemy Hero");
		buttonArray[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				eliminateSecrets(10, frame, secrets, secretType, secretLabels);
			}
		});
		
		//Add Another Secret Button
		buttonArray[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){			
            	addSecret(secrets, secretType, secretLabels);
			}
		});
		
		//Reset Button
		buttonArray[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				SecretArray[] secrets = new SecretArray[3];
            	secrets[0] = new SecretArray(secretType);
            	rework(frame, secrets, secretType);
			}
		});
		
		//Adds in all of the JPanels to the JWindow
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		for(int i=0; i<18; i++){
			panelArray[i].setBounds(50,50,100, i*70);
			frame.add(panelArray[i]);
		}    
		//Resizes the window to fit all of the components within
		frame.pack();
		
	}
	
	
	//Got rid of TriggerCheck, placed it in here and SecretArray is printed out in JLabels
	//Need to edit for eliminate secrets from multiple SecretArrays in secrets
	public void eliminateSecrets(int trigger, JFrame frame, SecretArray[] secrets, int secretType, 
			JLabel[] secretLabels){
		
		String text;  //Text for secrets
		String finale = "The secret has been activated.";
		
		switch(secretType){
		//hunter
		case 1:
			for(int i = 0; i < 5; i++){
				if(secrets[0].hunterarray[i].TriggerArray[trigger]){
					secrets[0].remove(secrets[0], i, 1);
				}
			}
			text = secrets[0].returnArray(secrets[0], secretType);
			if(text.isEmpty()){
				secretLabels[0].setText(finale);
			}
			else{
				secretLabels[0].setText(secrets[0].returnArray(secrets[0], secretType));
			}
			break;
			
		//mage
		case 2:
			for(int i = 0; i < 7; i++){
				if(secrets[0].magearray[i].TriggerArray[trigger]){
					secrets[0].remove(secrets[0], i, 2);
				}
			}
			text = secrets[0].returnArray(secrets[0], secretType);
			if(text.isEmpty()){
				secretLabels[0].setText(finale);
			}
			else{
				secretLabels[0].setText(secrets[0].returnArray(secrets[0], secretType));
			}
			break;
			
		//paladin
		case 3:
			for(int i = 0; i < 5; i++){
				if(secrets[0].pallyarray[i].TriggerArray[trigger]){
					secrets[0].remove(secrets[0], i, 3);
				}	
			}
			text = secrets[0].returnArray(secrets[0], secretType);
			if(text.isEmpty()){
				secretLabels[0].setText(finale);
			}
			else{
				secretLabels[0].setText(secrets[0].returnArray(secrets[0], secretType));
			}
			break;
		}
	}	
	
	public void addSecret(SecretArray[] secrets, int secretType, JLabel[] secretLabels){

		
	}
}
	

