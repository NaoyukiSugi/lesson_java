package lesson_java;

public class Sample1103 {
	public static void main(String[] args){
		Animal1103[] animal = Pet1103.getAnimal();
		for(Animal1103 pet: animal){
			//実際のインスタンスの区別なく動物が鳴くという処理(batk())のみですますことができる
			pet.bark();
		}
	}
}


//ペットクラス
class Pet1103{
	public static Animal1103[] getAnimal(){
		Animal1103[] animals =	{new Cat1103(), new Dog1103(), new Frog1103(), new Duck1103()};
		return animals;
	}
}

//動物クラス(抽象クラス)
abstract class Animal1103{
	public abstract void bark();
}

//ねこクラス
class Cat1103 extends Animal1103{
	public void bark(){
		System.out.println("ねこ:ニャンニャンニャン");
	}	
}

//いぬクラス
class Dog1103 extends Animal1103{
	public void bark(){
		System.out.println("いぬ:ワンワンワン");
	}	
}

//かえるクラス
class Frog1103 extends Animal1103{
	public void bark(){
		System.out.println("かえる:ガァーガアーガァー");
	}	
}

//あひるクラス
class Duck1103 extends Animal1103{
	public void bark(){
		System.out.println("あひる:がぁーがぁーがぁー");
	}	
}