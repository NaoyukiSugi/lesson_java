package lesson_java;
import package1.Package1301;


public class Sample1302 {
	public static void main(String[] args){
		//「package1.Package1301」をインポートしているので次のようにクラス名のみで使用できる.
		Package1301 pk = new Package1301();
		
		System.out.println("使用したクラスは");
		System.out.println(pk.getName());
	}	
}


/*
 * パッケージ内のクラスやインターフェースをインポートするには、次の書式に指定する
 * import パッケージ名.クラス名;
 * import パッケージ名.インターフェース名;
 * 
 * import.パッケージ名.*;
 * とするとすべてインポートできる.
 * 
 */