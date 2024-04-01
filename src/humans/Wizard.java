

package humans;

import bases.Human;

public class Wizard extends Human {
	
	public Wizard(String name, String weapon) {
		super(name, weapon);
	}
	
	
	
	super.hp = Dice.get(120, 180);
	super.offensive = Dice.get(12, 18);
	

}

