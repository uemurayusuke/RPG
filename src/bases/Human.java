
package bases;

//Diceクラスをimport
import utils.Dice;

public abstract class Human extends Living {

	public Human(String name, String weapon) {
		super(name, weapon);
	}
	
	@Override
//	引数の中身が攻撃する相手
//	実際に使用する時は攻撃する相手の情報が入った変数を入れればいい。
	public void attack(Living target) {
//		offensiveが攻撃力
		int damage = Dice.get(1, 10) * getOffensive();	
		
		super.hp = target.getHp() - damage;
		
		super.offensive = getOffensive() - 1;
		
		System.out.println("「" + name + "」が「" + weapon + "」で攻撃!「" + target + "」に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}









