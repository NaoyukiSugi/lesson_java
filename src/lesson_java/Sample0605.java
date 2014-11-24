package lesson_java;

public class Sample0605 {
	public static void main(String[] args){
	Sample0605Pc pcW = new Sample0605Pc("Win");	//「Winパソコン」インスタンス
	Sample0605Pc pcM = new Sample0605Pc("Mac");	//「Macパソコン」インスタンス
	Sample0605Pc pcL = new Sample0605Pc("Linux");	//「Linuxパソコン」インスタンス
	
	System.out.println(pcW.execOs());
	System.out.println(pcM.execOs());
	System.out.println(pcL.execOs());
	
	System.out.println(Sample0605Pc.isSpec());
	
	}
}

class Sample0605Pc{
	private String os = "";	//インスタンス変数
	private static String spec = "【スペック】CPU:1Ghz Mem:1GB HD:500GB";	//クラス変数
	
	public Sample0605Pc(String os){		//コンストラクタ
		this.os = os;
	}
	public String execOs(){		//インスタンスメソッド
		return "「" + os + "」パソコンを起動しました。";
	}
	public static String isSpec(){	//クラスメソッド
		return spec;
	}
}





/*
 * 次のような場合newせずとっもインスタンスを生成できる.
 * 1.String型を使用するとき
 * String s = "「new」してません。";
 * 
 * 2.配列の初期化するとき.(初期化以外はnewが必要)
 * int array[] = {1, 2, 3};
 * 
 * 3.基本データ型のラッパークラスに対するオートボクシング機能による自動変換のとき.
 * integer i = 0;
 * 
 * 
 * 
 * クラスに紐づく「メンバ変数」及び「メソッド」と、インスタンスに紐づく「メンバ変数」及び「メソッド」の違いは、「static」がついているかどうか.
 * クラス→つく
 * インスタンス→ついていない
 * 
 * 
 * 
 */