

package humans;

import bases.Human;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
//		superが親クラスのコンストラクタを意味してる
		super(name, weapon);
	}
}


//Humanを継承する
//引数にname,weaponの2つだけを持つコンストラクタを定義
//name,weaponの値を設定するために、Humanクラスに定義したコンストラクタを利用

//monsterも同じです。

//HPと攻撃力の乱数範囲は決められています

//人間とモンスターの名前と武器はそれぞれ決まっている。



