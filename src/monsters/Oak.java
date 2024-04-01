


package monsters;

import bases.Monster;

public class Oak extends Monster {
	
	public Oak(String name, String weapon) {
		super(name, weapon);
	}
	
	
	super.hp = Dice.get(170, 230);
	super.offensive = Dice.get(9, 15);
	
	
}
