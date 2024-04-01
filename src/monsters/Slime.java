

package monsters;

import bases.Monster;

public class Slime extends Monster {
	
	public Slime(String name, String weapon) {
		super(name, weapon);
	}
	
	super.hp = Dice.get(70, 130);
	super.offensive = Dice.get(5, 11);
	
}
