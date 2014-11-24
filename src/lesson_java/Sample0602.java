package lesson_java;

public class Sample0602 {
	public static void main(String[] args){
		Sample0602.load("a");
		
		//ちなみに自クラスのメソッドの時は次のようにクラス指定せずに呼び出せる.
		load("a");
		load("a", "b");		//引数の数が違う
		load(1);			//引数が違う
	}
	
	public static void load(String s){
		System.out.println("「load(String s)」が呼ばれました。");
	}
	
	public static void load(String s1, String s2){
		System.out.println("「load(String s1, String s2)」が呼ばれました。");
	}
	
	public static void load(int i){
		System.out.println("「load(int i)」が呼ばれました。");
	}	
}


/*
 * 「メソッド+引数リスト」の組み合わせを「シグニチャ」と呼ぶ
 *	「引数の型」や「引数の数が異なれば」同じ名前のメソッドを複数作ることができる
 * 
 * 	同じメソッド名で「引数リスト」のみが異なるメソッドを用意することを「オーバーロード」という
 * 
 */