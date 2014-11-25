package lesson_java;

class Parent0801 {
	public String ps1 = "親クラスのメンバ変数が参照されました。";
	public Parent0801(){
		System.out.println("親クラスのコンストラクタ(引数なし)が呼ばれました");
	}
	public void pm(){
		System.out.println("親クラスのメソッドが呼ばれました.");
	}
}

class  Child0801 extends Parent0801{
	public String cs1 = "子クラスのメンバ変数が参照されました.";
	public Child0801(){
		System.out.println("自クラスのコンストラクタ(引数なし)が呼ばれました");
	}
	public void cm(){
		System.out.println("子クラスのメソッドが呼ばれました");
	}
}



public class Sample0801{
	public static void main(String[] args){
		Child0801 child = new Child0801();	//子クラスのインスタンスを生成
		System.out.println(child.ps1);	//親クラスのメンバ変数を参照
		System.out.println(child.cs1);	//子クラスのメンバ変数を参照.
		child.pm();	//親クラスのメソッドの呼び出し
		child.cm();	//子クラスのメソッドの呼び出し
	}
}





/*
 * 継承
 * 親クラスの要素で,アクセス就職しがprivateのもの,およびコンストラクタは引き継ぐことができない。
 * 
 * 継承の書式
 * class 子クラス名　extends 親クラス名{
 * }
 * 
 * 子クラスから親クラスへのアクセス
 * class 子クラス名　extends 親クラス名{
 * 	super.親クラスのメンバ変数		//superは省略可能(子クラスと親クラスのメンバ変数やメソッド名が同じ場合はつける(そうじゃないと子クラスのものが使われる))
 * 	super.親クラスのメソッド
 * }
 * 
 * 親クラスから子クラスへのアクセスはできない.
 * 
 */