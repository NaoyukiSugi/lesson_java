package lesson_java;

public class Sample0603 {
	public static void main(String[] args){
		//インスタンスの生成
		Sample0603Student student1 = new Sample0603Student();
		Sample0603Student student2 = new Sample0603Student();
		
		//それぞれのインスタンスに名前を設定
		student1.setName("Yamamoto Ichiro");
		student2.setName("Yamada Hanako");
		
		//それぞれのインスタンスから名前を取得
		System.out.println(student1.getName());
		System.out.println(student2.getName());
	}
}

class Sample0603Student{
	public String name = "";
	public void setName(String name){	//アクセサのセッター
		this.name = name;		//「メンバ変数のname」と「引数のname」が同じ名前なので、この場合はthisがいる
	}
	
	public String getName(){			//アクセサのゲッター
		return name;
	}
}


/*
 * インスタンスとオブジェクトは同義語
 * 
 * インスタンス生成の書式
 * インスタンスの型 インスタンス変数 = new クラス名(引数リスト);
 * 
 * ※インスタンスの型とはインスタンス自身の「クラス」の他、その「親クラス(スーパークラス)」や実装している「インターフェース」になります。
 * 
 * 
 * インスタンスの「メンバ変数」と「メソッド」はそれぞれ、「インスタンス変数」、「インスタンスメソッド」と呼ばれる。
 * アクセス方法はクラスの時と同様に「.」(ドット演算子)を使用する.
 */