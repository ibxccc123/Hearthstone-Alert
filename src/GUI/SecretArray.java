package GUI;

public class SecretArray {

	public Secret[] hunterarray;
	public Secret[] magearray;
	public Secret[] pallyarray;
	
	/* hunter is 1
	 * mage is 2
	 * palladin is 3
	 */
	SecretArray(int classnum){
		switch(classnum){
		case 1:
			hunterarray = new Secret[5];
			
    		Secret freezing = new Secret("Freezing Trap",true,true,false,false,false,false,false,false,false,false,false);
    		Secret explosive = new Secret("Explosive Trap",false,true,false,true,false,false,false,false,false,false,false);
    		Secret snipe = new Secret("Snipe", false,false,false,false,true,false,false,false,false,false,false);
    		Secret misdirection = new Secret("Misdirection",false,true,false,true,false,false,false,false,false,false,false);
    		Secret snake = new Secret("Snake Trap", true,false,true,false,false,false,false,false,false,false,false);
    		hunterarray[0] = freezing;
    		hunterarray[1] = explosive;
    		hunterarray[2] = snipe;
    		hunterarray[3] = misdirection;
    		hunterarray[4] = snake;
    		break;
		case 2:
			magearray = new Secret[7];
        	Secret duplicate = new Secret("Duplicate", false,false,false,false,false,true,false,false,false,false,false);
    		Secret ice_barrier = new Secret("Ice Barrier", false,true,false,true,false,false,false,false,false,false,false);
    		Secret mirror_entity = new Secret("Mirror Entity", false,false,false,false,true,false,false,false,false,false,false);
    		Secret counterspell = new Secret("CounterSpell", false,false,false,false,false,false,false,false,true,true,true);
    		Secret vaporize = new Secret("Vaporize", false,true,false,false,false,false,false,false,false,false,false);
    		Secret ice_block = new Secret("Ice Block", false,false,false,false,false,false,true,false,false,false,false);
    		Secret spellbender = new Secret("Spellbender", false,false,false,false,false,false,false,false,false,true,false);
    		magearray[0] = duplicate;
    		magearray[1] = ice_barrier;
    		magearray[2] = mirror_entity;
    		magearray[3] = counterspell;
    		magearray[4] = vaporize;
    		magearray[5] = ice_block;
    		magearray[6] = spellbender;
    		break;
		case 3:
			pallyarray = new Secret[5];
        	Secret avenge = new Secret("Avenge", false,false,false,false,false,false,false,true,false,false,false);
    		Secret eye = new Secret("Eye for an Eye", false,true,false,true,false,false,false,false,false,false,true);
    		Secret noble_sacrifice = new Secret("Noble Sacrifice", true,true,true,true,false,false,false,false,false,false,false);
    		Secret redemption = new Secret("Redemption", false,false,false,false,false,true,false,false,false,false,false);
    		Secret repentance = new Secret("Repentance", false,false,false,false,true,false,false,false,false,false,false);
    		pallyarray[0] = avenge;
    		pallyarray[1] = eye;
    		pallyarray[2] = noble_sacrifice;
    		pallyarray[3] = redemption;
    		pallyarray[4] = repentance;
    		break;
    		// default should never occur and might be obsolete
		default:
			break;
			
		}
		
	}
	public String ReturnArray(SecretArray sa, int classnum){
		String s;
		s = new String();
		
		switch(classnum){
		case 1:
			for(int i = 0; i > 5; i++){
				if (sa.hunterarray[i].isValid()){
					s = s + " " + hunterarray[i].getSecretName();
				}

					
				
			}
			break;
		case 2:
			for(int i = 0; i > 7; i++){
				if(sa.magearray[i].isValid()){
					s = s + " " + magearray[i].getSecretName();
				}
			}
			break;
		case 3:
			for(int i = 0; i > 5; i++){
				if(sa.pallyarray[i].isValid()){
					s = s + " " + pallyarray[i].getSecretName();
				}
			}
			
		}
		return s;
	}
	
	
}
