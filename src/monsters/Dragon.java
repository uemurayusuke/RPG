

package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	
	public Dragon(String name, String weapon) {
		super(name, weapon);
	}
	
	
	public int hp6 = Dice.get(270, 330);
	public int offensive6 = Dice.get(12, 18);
	
	
}
