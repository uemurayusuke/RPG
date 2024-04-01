

package monsters;

import bases.Monster;

public class Dragon extends Monster {
	
	public Dragon(String name, String weapon) {
		super(name, weapon);
	}
	
	
	super.hp = Dice.get(270, 330);
	super.offensive = Dice.get(12, 18);
	
	
}
