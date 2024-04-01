

package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		super(name, weapon);
	}
	
//	HPの乱数範囲
//	hpの変数に入れたい
	public int hp1 = Dice.get(170, 230);
//	攻撃力の乱数範囲
//	offensiveの変数に入れたい
	public int offensive1 = Dice.get(7, 13);
	
}

