


package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	
	public Oak(String name, String weapon) {
		super(name, weapon);
	}
	
	
	public int hp5 = Dice.get(170, 230);
	public int offensive5 = Dice.get(9, 15);
	
	
}
