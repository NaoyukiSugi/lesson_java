package lesson_java;

public class Sample0701 {
	public static void main(String[] args){
		int a = 1;	//プリミティブ型変数の初期化
		int b = a;	//プリミティブ型変数同士の代入
		int[] A = {1};	//参照型変数の初期化(new int[]; と A[0]={1} の簡略した書式)
		int[] B = A;	//参照型変数同士の代入
		
		System.out.println("更新前(プリミティブ型)");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	
		System.out.println("「b=2;」の更新後(プリミティブ型)");
		b = 2;	//代入先変数の値を変更
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.out.println("更新前(参照型)");
		System.out.println("A[0]=" + A[0]);
		System.out.println("B[0]=" + B[0]);
		
		System.out.println("「B[0]=2;」の更新後(参照型)");
		B[0] = 2;	//代入先変数の値を変更
		System.out.println("A[0]=" + A[0]);
		System.out.println("B[0]=" + B[0]);
	}
}

/*
 * インスタンス変数の型は参照型(オブジェクト型)となる.
 * 
 */