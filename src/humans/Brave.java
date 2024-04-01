

package humans;

import bases.Human;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		super(name, weapon);
	}
	
	
	super.hp = Dice.get(240, 300);
	super.offensive = Dice.get(17, 23);
	
}








