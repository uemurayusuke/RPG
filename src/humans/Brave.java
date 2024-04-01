

package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		super(name, weapon);
	}
	
	super.hp = Dice.get(170, 230);
	super.offensive = Dice.get(7, 13);
	
	
	
}


//Humanを継承する
//引数にname,weaponの2つだけを持つコンストラクタを定義
//name,weaponの値を設定するために、Humanクラスに定義したコンストラクタを利用

//monsterも同じです。

//HPと攻撃力の乱数範囲は決められています

//人間とモンスターの名前と武器はそれぞれ決まっている。



