

package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	
	public Wizard(String name, String weapon) {
		super(name, weapon);
	}
	
	public int hp3 = Dice.get(120, 180);
	public int offensive3 = Dice.get(12, 18);
	
}

