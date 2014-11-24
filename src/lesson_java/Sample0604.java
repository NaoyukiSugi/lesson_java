package lesson_java;

public class Sample0604 {
	public static void main(String[] args){
		//コンストラクタで名前を指定するように変更.
		Sample0604Student student1 = new Sample0604Student("Yamamoto Ichiro");
		Sample0604Student student2 = new Sample0604Student("Yamada Hanako");
		
		System.out.println(student1.getName());
		System.out.println(student2.getName());		
	}
}
	
class Sample0604Student{
	public String name = "";
	//コンストラクタを追加。
	public Sample0604Student(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

/*
 * コンストラクタ
 * 「new」をしたときに呼び出される
 * 
 * コンストラクタの条件
 * 1.戻り値を指定しない(voidも記述しない)
 * 2.コンストラクタ名はクラス名と同じである
 * 
 * 
 * 
 * class クラス名{
 * 	[アクセス修飾子] クラス名(引数リスト){
 * 	}
 * }
 */