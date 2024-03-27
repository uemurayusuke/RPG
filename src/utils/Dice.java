//これは完成コード

package utils;

import java.util.Random;

//乱数を作成する便利なクラス
public class Dice {
	
//        乱数インスタンスの作成
//	importで宣言してるから、Randomだけで良いって話やな
		private static Random r = new Random();

//		minからmaxまでの間で整数値のサイコロを振り、その値を戻り値とするメソッド
		public static int get(int min, int max) {
			return r.nextInt(max - min + 1) + min;
		}

}


//パッケージ
//クラスをグループ化してまとめたもの
//パッケージを利用するメソッド。
//別パッケージのクラスの名前が同じでも使用できる。
//命名の手間が減る。

//import文
//import パッケージ名.クラス名
//これを宣言する事で、パッケージ名を省略できる。
//クラス名だけで、プログラムに記述できる。