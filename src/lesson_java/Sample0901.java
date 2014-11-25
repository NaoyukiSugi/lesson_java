package lesson_java;

abstract class Employee0901{
	protected String name = "社員";
	abstract void work();	//抽象メソッド
	public void goOffice(){
		System.out.println(name + "が出社しました。");
	}
	public void goHome(){
		System.out.println(name + "が帰宅しました。");
	}
}

class SalesMan0901 extends Employee0901{
	public SalesMan0901(String name){
		super.name = name;
	}
	public void work(){
		System.out.println("営業の仕事を行います.");
		
	}
}

class Developer0901 extends Employee0901{
	public Developer0901(String name){
		super.name = name;
	}
	public void work(){
		System.out.println("開発の仕事を行います.");
	}
}

class GeneralManager0901 extends Employee0901{
	public GeneralManager0901(String name){
		super.name = name;
	}
	public void work(){
		System.out.println("総務の仕事を行います.");
	}
}



public class Sample0901 {
	public static void main(String[] args){
		//営業部の社員
		Employee0901 sm = new SalesMan0901("営業部の社員A"); //抽象クラスを参照型として使用できます。		
		//開発部の社員
		Employee0901 dp = new Developer0901("開発部の社員B"); //抽象クラスを参照型として使用できます。		
		//総務部の社員
		Employee0901 gm = new GeneralManager0901("総務部の社員C"); //抽象クラスを参照型として使用できます。		
		
		//出社
		sm.goOffice();
		dp.goOffice();
		gm.goOffice();
		
		//業務
		sm.work();
		dp.work();
		gm.work();
		
		//帰宅
		sm.goHome();
		dp.goHome();
		gm.goHome();
	}	
}


/*
 * 抽象クラスは文字通り抽象的存在のクラスである具体的な処理はこれを継承したクラスに記述させる。抽象クラスの存在は複数のクラスに対して
 * 共通性をもたせることであり、クラス設計においてとても重要な役割を担う。
 * 
 * 抽象クラスの特徴
 * 1.抽象メソッドを定義することができる。
 * 抽象メソッドとは、実際の処理を自身にではなく子クラスに記述させるためのメソッドです。
 * この抽象メソッドを記述できることが、抽象クラスの最大の特徴です。抽象クラスを継承したクラスは、この抽象メソッドを必ず「オーバーライド」しなければならない。
 * (オーバーライドしなければコンパイルエラーになる)
 * 
 * 2.抽象クラス単体でインスタンスを生成することはできない
 * 抽象メソッドを定義している。つまり、実際の処理を記述していなので、当然インスタンスを生成して使用することはできません。
 * 
 * 
 * 抽象クラス及び抽象メソッドの書式
 * abstract class クラス名{
 * 	abstract 戻り値 メソッド名(引数リスト);
 * }
 * 
 */