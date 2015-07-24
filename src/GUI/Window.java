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
		//The first cell of secrets[] is always the first secret
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
			//"---" means that the secret has not been added yet and this string is used 
			//as a check for whether or not the secret is valid (these checks in eliminateSecrets()
			//can and should be improved upon as to check for the secret regardless of what its 
			//corresponding JLabel in secretLabels is set to
			secretLabels[i] = new JLabel("---");  
			//The secrets' JLabels take space directly after the trigger buttons
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
				SecretArray[] secrets = new SecretArray[5];
            	secrets[0] = new SecretArray(secretType);
            	rework(frame, secrets, secretType);
			}
		});
		
		//Adds in all of the 18 JPanels to the JWindow
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		for(int i=0; i<18; i++){
			panelArray[i].setBounds(50,50,100, i*70);
			frame.add(panelArray[i]);
		}    
		//Resizes the window to fit all of the components within
		frame.pack();
		
	}
	
	
	//Got rid of TriggerCheck, placed it in here and SecretArray is printed out in JLabels
	//Most code: Looping through secretLabels/secrets and ensuring no null pointer errors
	
	//If secrets' secretArray is empty/its corresponding JLabel in secretLabels is "---", 
	//then eliminateSecrets ignores removing secrets from that cell and this prevents possible
	//null pointer errors.
	
	//eliminateSecrets takes in the trigger, the JFrame window, and the array of SecretArrays(5)
	//and the array of JLabels(5)
	public void eliminateSecrets(int trigger, JFrame frame, SecretArray[] secrets, int secretType, 
			JLabel[] secretLabels){
		
		String text;  //Text for secrets
		String finale = "The secret has been activated.";
		
		switch(secretType){
		//hunter
		case 1:
			//Removes the secrets from secrets' secretarrays if they are already set/valid
			for(int i=0; i<5; i++){ //5 secretarrays in secrets
				for(int j=0; j<5;j++){  //5 secrets in secretarray for hunter
					if(!(secretLabels[i].getText().equals("---"))){ //If secretLabel's label is set
						if(secrets[i].hunterarray[j].TriggerArray[trigger]){ //If secret's trigger is true
							secrets[i].remove(secrets[i], j, 1);  //1 for hunter
						}						
					}
				}
			}
			//Sets the text for the JLabels in secretLabels
			for(int i=0; i<5; i++){ //5 secretarrays and 5 secretLabels
				if(!(secretLabels[i].getText().equals("---"))){ 
					//If the secret's corresponding's JLabel is set
					text = secrets[i].returnArray(secrets[i], secretType);
					if(text.isEmpty()){  
						//If the secret has all secrets removed from it
						secretLabels[i].setText(finale);
					}
					else{
						//If the secret has at least 1 secret in it
						secretLabels[i].setText(secrets[i].returnArray(secrets[i], secretType));
					}
				}
			}
			break;
			
		//mage
		case 2:
			//Removes the secrets from secrets' secretarrays if they are already set/valid
			for(int i=0; i<5; i++){ //5 secretarrays in secrets
				for(int j=0; j<7;j++){  //5 secrets in secretarray for mage
					if(!(secretLabels[i].getText().equals("---"))){ //If secretLabel's label is set
						if(secrets[i].magearray[j].TriggerArray[trigger]){ //If secret's trigger is true
							secrets[i].remove(secrets[i], j, 2);  //2 for mage
						}						
					}
				}
			}
			//Sets the text for the JLabels in secretLabels
			for(int i=0; i<5; i++){ //5 secretarrays and 5 secretLabels
				if(!(secretLabels[i].getText().equals("---"))){ 
					//If the secret's corresponding's JLabel is set
					text = secrets[i].returnArray(secrets[i], secretType);
					if(text.isEmpty()){  
						//If the secret has all secrets removed from it
						secretLabels[i].setText(finale);
					}
					else{
						//If the secret has at least 1 secret in it
						secretLabels[i].setText(secrets[i].returnArray(secrets[i], secretType));
					}
				}
			}
			break;
			
		//paladin
		case 3:
			//Removes the secrets from secrets' secretarrays if they are already set/valid
			for(int i=0; i<5; i++){ //5 secretarrays in secrets
				for(int j=0; j<5;j++){  //5 secrets in secretarray for pally
					if(!(secretLabels[i].getText().equals("---"))){ //If secretLabel's label is set
						if(secrets[i].pallyarray[j].TriggerArray[trigger]){ //If secret's trigger is true
							secrets[i].remove(secrets[i], j, 3);  //3 for pally
						}						
					}
				}
			}
			//Sets the text for the JLabels in secretLabels
			for(int i=0; i<5; i++){ //5 secretarrays and 5 secretLabels
				if(!(secretLabels[i].getText().equals("---"))){ 
					//If the secret's corresponding's JLabel is set
					text = secrets[i].returnArray(secrets[i], secretType);
					if(text.isEmpty()){  
						//If the secret has all secrets removed from it
						secretLabels[i].setText(finale);
					}
					else{
						//If the secret has at least 1 secret in it
						secretLabels[i].setText(secrets[i].returnArray(secrets[i], secretType));
					}
				}
			}
			break;
			
		}
	}	
	
	//Adds a new secret to secrets and sets its corresponding JLabel in secretLabels 
	public void addSecret(SecretArray[] secrets, int secretType, JLabel[] secretLabels){
		for(int i=0; i<5; i++){
			if(secretLabels[i].getText() == "---"){  //Searches for next empty space in secretLabels
				SecretArray newSecret = new SecretArray(secretType);
				secretLabels[i].setText(newSecret.returnArray(newSecret,secretType));
				secrets[i] = newSecret;
				break;  //Breaks after creating a single next secret
			}
		}
		
	}
}
	

