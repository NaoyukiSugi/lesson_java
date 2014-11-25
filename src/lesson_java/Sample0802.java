package lesson_java;

class Parent0802{
	public void same(){
		System.out.println("親クラスのsameメソッドが呼ばれました.");	
	}	
}

class Child0802 extends Parent0802{
	public void same(){
		System.out.println("自クラスのsameメソッドが呼び出されました");
	}
	public void calltest(){
		same();
		super.same();
	}
}

public class Sample0802 {
	public static void main(String[] args){
		Child0802 child = new Child0802();
		child.calltest();
	}	
}


/*
 * 親クラスに存在するメソッドと同じシグニチャのメソッドを生成すること
 *をオーバーライドという。
 *親クラスのメソッドが子クラスで書き換えられたような感じになる
 *
 *オーバーライドされた親クラスメソッドを呼び出したいときは、super.を付加し、親クラスを明示することで呼び出し可能となる。
 * 
 */