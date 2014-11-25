package lesson_java;

public class Sample0705 {
	public static void main(String[] args){
		String s1 = new String("ABC");	//オブジェクト生成を明示した書式です(「String s1 = "ABC"」と等価)
		String s2 = new String("ABC");	//オブジェクト生成を明示した書式です(「String s2 = "ABC"」と等価)
		System.out.println("変数s1=" + s1 + "変数s2=" + s2 + "の時");
		
		System.out.print("「==」演算子で比較した結果:");
		if(s1 == s2){
			System.out.println("変数s1と変数s2は同じです.");
		}else{
			System.out.println("変数s1と変数s2は異なります.");
		}
		
		System.out.print("「equalsメソッド」を利用して比較した結果");
		if(s1.equals(s2)){
			System.out.println("変数s1と変数s2は同じです.");
		}else{
			System.out.println("変数s1と変数s2は異なります.");
		}	
	}
}

/*
 * 参照型変数で保持している値が同じであるかを比較するには「equalsメソッド」
 * を使用します.
 * 
 */