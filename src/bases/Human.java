
package bases;

//Diceクラスをimport
import utils.Dice;

public abstract class Human extends Living {

	public Human(String name, String weapon) {
		super(name, weapon);
	}
	
	@Override
//	引数の中身が攻撃する相手
	public void attack(Living target) {
		
//		offensiveが攻撃力
		int damage = Dice.get(1, 10) * getOffensive();	
		
		target.getHp() - damage;
		
		offensive--;
		
		System.out.println("「" + name + "」が「" + weapon + "」で攻撃!「" + target + "」に" + damege + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");

	}
}
















