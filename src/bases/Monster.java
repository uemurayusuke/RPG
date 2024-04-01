
package bases;

import utils.Dice;

public abstract class Monster extends Living {


	public Monster(String name, String weapon) {
	  super(name, weapon);
	}

	@Override
	public void attack(Living target) {
		
		int damage = Dice.get(1, 10) * getOffensive();	
		
		super.hp = target.getHp() - damage;
		
		System.out.println("「" + name + "」が「" + weapon + "」で攻撃!「" + target + "」に" + damage + "のダメージを与えた。");
	}
}


