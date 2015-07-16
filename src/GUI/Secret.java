package GUI;

public class Secret {

	//Changed it to conserve room
	public Boolean trigger1, trigger2, trigger3, trigger4, trigger5, trigger6,
    trigger7, trigger8, trigger9, trigger10, trigger11;
	public Boolean value;
	public String SecretName;

	Secret( String SecretN, Boolean t1, Boolean t2, Boolean t3, Boolean t4, Boolean t5, Boolean t6, Boolean t7, Boolean t8, Boolean t9, Boolean t10, Boolean t11){
			this.trigger1 = t1;	// M -> EM
			this.trigger2 = t2;	// M -> EH
			this.trigger3 = t3;	// H -> EM
			this.trigger4 = t4;	// H -> EH
			this.trigger5 = t5;	// MS
			this.trigger6 = t6;	// EM = X
			this.trigger7 = t7;	// EH = X
			this.trigger8 = t8;	// EM = X && M
			this.trigger9 = t9;	// S
			this.trigger10 = t10;	// S ->  EM 
			this.trigger11 = t11;	// S -> EH
			this.SecretName = SecretN;
			this.value = true;
			
		}
	public Boolean isValid(){
		return this.value;
	}
	
	public void setToFalse(){
		this.value = false;
	}
	
	public String getSecretName(){
		return this.SecretName;
		
	}
}


