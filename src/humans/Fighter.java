

package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		super(name, weapon);
	}
	
	public int hp2 = Dice.get(240, 300);
	public int offensive2 = Dice.get(17, 23);
}
