package lesson_java;

class Human0803{
	public void think(){
		System.out.println("考えています");
	}
}

class Computer0803{
	public void process(){
		System.out.println("処理をしています...");
	}
}

class Programmer0803 extends Human0803{
	public Computer0803 comp = new Computer0803();
}

public class Sample0803 {
	public static void main(String[] args){
		Programmer0803 pg = new Programmer0803();
		pg.think();
		pg.comp.process();
	}
}

/*
 * オーバーライドを行うとき、アクセス修飾子の制限レベルを上げることはできません。
 * アクセス修飾子の制限レベルの強度は次のようになる
 * 制限が弱い ← public < protected < デフォルト(省略時) < private →制限が強い
 * 
 * 従って、例えば親クラスのアクセス修飾子がprotectedのものをオーバ０ライド時に、修飾子を省略したり、privateにすることはできない
 * 
 * 
 * 別のクラスの要素を利用できる方法として、「継承」の他に「コンポジション」(集約)があります。
 * 「コンポジション」はメンバ変数として別のクラスを取り込んだ形です
 * 
 * 
 *1.「継承」の関係
 *「継承」は「A is a B」のとき、つまりう「AはBである」といえる場合に使用します。
 *例えば、「人間クラス」と「プログラマークラス」があった場合、「プログラマーは人間である」といえるので「継承」関係にすることができる
 *これを「IS-a」関係と呼びます。
 *
 *2.「コンポジション」の関係
 *「コンポジション」は「A has a B」のよき、つまり、「AはBをもっている」といえる場合に使用します。
 *例えば、「プログラマークラス」と「パソコンクラス」があった場合、「プログラマーはパソコンを持っている」といえるので「コンポジション」関係にすることができる
 *
*/