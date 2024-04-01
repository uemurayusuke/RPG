

package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	
	public Slime(String name, String weapon) {
		super(name, weapon);
	}
	
	public int hp4 = Dice.get(70, 130);
	public int offensive4 = Dice.get(5, 11);
	
}
