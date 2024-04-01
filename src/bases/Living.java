
package bases;

public abstract class Living {

	protected String name; 
	protected String weapon; 
	protected int hp; 
	protected int offensive; 

	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

//	引数で入れたnameを入れるという事
	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

//	引数で入れたweaponを入れるという事
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

//	引数で入れたhpを入れるという事
	public void setHp(int hp) {
		this.hp = hp;
	}

//	別のクラスで代入していいって事よね？
	public int getOffensive() {
		return offensive;
	}

//	引数で入れたoffensiveを入れるという事
	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

   
//	抽象メソッドでは、処理内容が未定の為、{}を付ける事ができない。
//	引数にLiving targetが入っているが、これはどういう意味なのか？
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



