package lesson_java;

public class Sample1101 {
	public static void main(String[] args){
		Cat1101 cat = new Cat1101();
		//ねこクラス(Cat1101)へのアクセス
		cat.bark();	//鳴き声を聞く
		cat.changeCry();	//鳴き声を変える
		cat.bark();	//鳴き声を聞く
	}
}

//ねこクラス
class Cat1101{
	//private修飾子により、外部から直接このcry変数(鳴き声)を変更されることはない
	private String cry = "ニャンニャンニャン";
	//cry変数(鳴き声)を出力するのはこのメソッドのみです。
	public void bark(){
		System.out.println("ねこ	:"+cry);
	}
	//cry変数(鳴き声)を変更できるのはこのメソッドだけです.
	public void changeCry(){
		this.cry = "ニャ〜オ";
	}
}


/*
 * オブジェクト指向の三大要素
 * カプセル化
 * 継承
 * ポリモーフィズム
 * 
 * オブジェクト指向の本質はインスタンスをより独立した「オブジェクト」(もの)として扱えるように向かわせる(指向)のことです。
 * つまり、各オブジェクトの独立性を高めていくことがオブジェクト指向の手法であり、具体的にはインスタンスへのアクセス方法の整備と
 * インスタンス間の結びつきを弱める(汎用的にする)ことだと言える。
 * 
 */