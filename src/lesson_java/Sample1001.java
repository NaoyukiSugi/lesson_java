package lesson_java;

interface If1{
	String s1 = "If1";	//修飾子を省略していますが「final pub lic static」となります。
	void m1();	//修飾子を省略していますが「abstract public」となります.
}

interface If2{
	String s2 = "If2";
	void m2();
}

interface If3 extends If1, If2{	//多重継承できる。
	String s3 = "If3";
	void m3();
}

interface If4{
	String s4 = "If4";
	void m4();
}

class IfSample implements If3, If4{
	public void m1(){
		System.out.println("interface"+s1+"の実装");
	}
	
	public void m2(){
		System.out.println("interface"+s2+"の実装");
	}	

	public void m3(){
		System.out.println("interface"+s3+"の実装");
	}
	
	public void m4(){
		System.out.println("interface"+s4+"の実装");
	}
}

public class Sample1001 {
	public static void main(String[] args){
		IfSample ifsample = new IfSample();
		ifsample.m1();
		ifsample.m2();
		ifsample.m3();
		If4	ifsample4 = new IfSample();	//インターフェースを参照型として利用できます。
		ifsample4.m4();
	}
}




/*
 * 継承は1クラスですが、インターフェースは複数でも可能
 * インターフェース同士であれば多重継承することも可能
 * メンバ変数の修飾子は「final public static」のみ
 * メソッドは必ず抽象メソッドであり修飾子は「abstract public」のみ
 * 
 * インターフェースの書式
 * [public] interface インターフェース名{
 * }
 * 
 * インターフェースの実装
 * class クラス名 implemants インターフェースリスト{
 * 	インターフェースで定義されている抽象メソッドの実装;
 * }
 * 
 * インターフェースの継承
 * [public] interface インターフェース名 extends 親インターフェースリスト{
 * }
 * 
 */