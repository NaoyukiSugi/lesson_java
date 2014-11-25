package lesson_java;

public class Sample1102 {
	public static void main(String[] args){
		Cat1102 pet = new Cat1102();
		//「ねこクラス」は次のように「動物クラス」型変数に代入して使用することも可能です。
		//Animal1102 pet = new Cat1102();
		//引数が「動物クラス」の場合、「ねこクラス」のインスタンスを「動物クラス」のインスタンスとして使用できる
		PetCare1102.giveBait(pet);
	}
}

//動物クラス
class Animal1102{
	public void eat(String food){
		System.out.println(food + "を食べました");
	}
}

//ねこクラス
class Cat1102 extends Animal1102{
	private final String CRY = "ニャンニャンニャン";
	public void bark(){
		System.out.println("ねこ:" + CRY);
	}
}

//ペットの世話用クラス
class PetCare1102{
	//引数が「動物クラス」なので、「ペットの世話用クラス」は「ねこクラス」専用のクラスではなくなります。(汎用化)
	public static void giveBait(Animal1102 animal){
		animal.eat("エサ");
	}
}