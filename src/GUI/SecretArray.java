package GUI;

public class SecretArray {

	/* hunter is 1
	 * mage is 2
	 * palladin is 3
	 */
	SecretArray(int classnum){
		switch(classnum){
		case 1:
			Secret[] hunterarray;
			hunterarray = new Secret[5];
			
    		Secret freezing = new Secret(true,true,false,false,false,false,false,false,false,false,false);
    		Secret explosive = new Secret(false,true,false,true,false,false,false,false,false,false,false);
    		Secret snipe = new Secret(false,false,false,false,true,false,false,false,false,false,false);
    		Secret misdirection = new Secret(false,true,false,true,false,false,false,false,false,false,false);
    		Secret snake = new Secret(true,false,true,false,false,false,false,false,false,false,false);
    		hunterarray[0] = freezing;
    		hunterarray[1] = explosive;
    		hunterarray[2] = snipe;
    		hunterarray[3] = misdirection;
    		hunterarray[4] = snake;
    		break;
		case 2:
			Secret[] magearray;
			magearray = new Secret[7];
        	Secret duplicate = new Secret(false,false,false,false,false,true,false,false,false,false,false);
    		Secret ice_barrier = new Secret(false,true,false,true,false,false,false,false,false,false,false);
    		Secret mirror_entity = new Secret(false,false,false,false,true,false,false,false,false,false,false);
    		Secret counterspell = new Secret(false,false,false,false,false,false,false,false,true,false,false);
    		Secret vaporize = new Secret(false,true,false,false,false,false,false,false,false,false,false);
    		Secret ice_block = new Secret(false,false,false,false,false,false,true,false,false,false,false);
    		Secret spellbender = new Secret(false,false,false,false,false,false,false,false,false,true,false);
    		magearray[0] = duplicate;
    		magearray[1] = ice_barrier;
    		magearray[2] = mirror_entity;
    		magearray[3] = counterspell;
    		magearray[4] = vaporize;
    		magearray[5] = ice_block;
    		magearray[6] = spellbender;
    		break;
		case 3:
			Secret[] pallyarray;
			pallyarray = new Secret[5];
        	Secret avenge = new Secret(false,false,false,false,false,false,false,true,false,false,false);
    		Secret eye = new Secret(false,true,false,true,false,false,false,false,false,false,true);
    		Secret noble_sacrifice = new Secret(true,true,true,true,false,false,false,false,false,false,false);
    		Secret redemption = new Secret(false,false,false,false,false,true,false,false,false,false,false);
    		Secret repentance = new Secret(false,false,false,false,true,false,false,false,false,false,false);
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
}
