
package bases;

//抽象クラス
//サブクラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
//	親クラスのメソッドを使用
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		
		// 相手のHPをダメージ値だけ減らす
		
		// コンソールにステータスを表示
//		　「〇〇」が「✕✕」で攻撃！「△△」に▲▲のダメージを与えた。
//		〇〇はモンスターの名前
//		✕✕はモンスターの武器
//		△△は人間の名前
//		▲▲はダメージ値
//		モンスターに関しては、攻撃力が下がらない
	}
}


