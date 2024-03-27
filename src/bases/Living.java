//完成コード

package bases;

//生物を表現する抽象クラス
public abstract class Living {

	// フィールド
//	これはフィールド変数。
//	属性を表す変数
	protected String name; // キャラクターの名前
	protected String weapon; // 武器名
	protected int hp; // ヒットポイント（生命力）
	protected int offensive; // 攻撃力

	// コンストラクタ
	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
	}

	// ゲッター、セッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOffensive() {
		return offensive;
	}

	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

    // ターゲットに攻撃するメソッド
	public abstract void attack(Living target); 

	// 自分自身を表現する文字列のオーバーライド
	@Override
	public String toString() {
		String alert = "";
		if (this.hp <= 50) {
			alert = "★ HP残りわずか！アブナイ";
		}
		return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d %s", this.name, this.hp, this.offensive, alert);
	}

}




//コンストラクタとは
//クラスのインスタンス生成時に実行されるメソッド。
//コンストラクタとは、メソッド
//条件がある。
//インスタンス生成時に実行される。
//クラスからインスタンスを生成した時に最初に実行されるメソッド
//
//インスタンス
//クラスをもとに生成された実体(オブジェクト)の事。


//抽象メソッド
//具体的な処理内容を記述せず、メソッド名や引数だけの定義だけを宣言するメソッド
//抽象メソッドは先頭に「abstract」をつける事で定義できる。
//抽象メソッドは、そのままでは利用できない。
//サブクラスでオーバーライドしないいけない。

//抽象メソッドは、
//複数人で開発する時にメリットがあるらしい。
//抽象メソッドの性質は、サブクラスに記述がないとエラーになるという事。
//この性質を利用して、他の人の記述漏れを防ぐみたいなニュアンスで使用するらしい。

//@Override
//これはアノテーションと呼ばれる。
//アノテーションとは、オーバーライドすることを宣言するために記述する。
//これを記述することで、もしスーパークラスに同名のメソッドがなければコンパイラが
//エラーメッセージを出す。








