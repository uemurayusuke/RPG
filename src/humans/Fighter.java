

package humans;

import bases.Human;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		super(name, weapon);
	}
	
	
	super.hp = Dice.get(240, 300);
	super.offensive = Dice.get(17, 23);
	
}
