
package bases;

import utils.Dice;

public abstract class Human extends Living {

	public Human(String name, String weapon) {
		super(name, weapon);
	}
	
	
	@Override
//	引数の中身が攻撃する相手
	public void attack(Living target) {
		
//		1から10までのサイコロを振る
		int damage = Dice.get(1, 10)*this.offensive;		
//		offensiveが攻撃力
		
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
//		サイコロの出た数字 × 攻撃力 = ダメージ

		// 相手のHPをダメージ値だけ減らす

		// 自分の攻撃力を1だけ減らす
//		人間に関しては、攻撃したら、攻撃力が1下がる

		// コンソールにステータスを表示
//		「〇〇」が「✕✕」で攻撃！「△△」に▲▲のダメージを与えた。
//	　　　しかし自分の攻撃力も1減少した。
//		「○○」は人間の名前
//		「××」は人間の武器
//		「△△」はモンスターの名前
//		 ▲▲はダメージ値

	}
}


//Livingで定義したコンストラクタを利用するとはどういう事ですか？

