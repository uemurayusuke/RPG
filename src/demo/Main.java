
package demo;

import java.util.ArrayList;
import java.util.List;

import bases.Human;
import bases.Monster;
import utils.Dice;

public class Main {
	public static void main(String[] args) {

		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");
		
		Human brave = new Human("沖田総司", "剣");
		Human fighter = new Human("金太郎", "斧");
		Human wizard = new Human("安倍晴明", "魔法");

		List<Human> humans = new ArrayList<>();
		
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizard);
		
		Monster slime = new Monster("キングスライム", "体当たり");
		Monster oak = new Monster("オークキング", "槍");
		Monster dragon = new Monster("紅龍", "炎");

		List<Monster> monsters = new ArrayList<>();
		
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);

		showGroupInfos(humans, monsters);

		int count = 1;
		
		while (true) {

			System.out.printf("\n★ 第%d回戦 ==========\n", count);

			System.out.println("\n[人間のターン！]\n");
			
			Main.choiceHuman(humans);
			
			Main.choiceMonster(monsters);
            
			attack();
			
			if (hp <= 0) {
				System.out.println("「" +   + "」は倒れた。");
				monsters.remove()
			}
		

			// モンスターグループに誰もいなくなれば、人間グループの勝利

			System.out.println("\n[モンスターのターン！]\n");
			
			Main.choiceHuman(humans);
			
			Main.choiceMonster(monsters);
			
			attack();
		
			// 人間のHPが0以下になれば、人間は倒れ、その人間をモンスターグループから削除
			if (hp <= 0) {
				System.out.println("「" +   + "」は倒れた。");
				humans.remove()
			}
			

			// 人間グループに誰もいなくなれば、人間グループの敗北
			
		
			showGroupInfos(humans, monsters);
			
			count++;
		}

		showGroupInfos(humans, monsters);

	}

	// 引数でもらった人間グループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Human choiceHuman(List<Human> humans) {
		Human human = humans.get(Dice.get(0, humans.size() - 1));
		System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
		return human;
	}

	// 引数でもらったモンスターグループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
		return monster;
	}

	// 引数でもらった人間グループリストとモンスターグループリストのそれぞれの情報一覧を表示するメソッド
	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {

		System.out.println("\n## === グループ情報 === ##");
		System.out.printf("# [人間グループ]: %d人\n", humans.size());
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}

}