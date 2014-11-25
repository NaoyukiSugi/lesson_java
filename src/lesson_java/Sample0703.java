package lesson_java;

//Cloneableインターフェースを実装します(これがないとcloneメソッドを呼び出した時に「CloneNotSupportedExceprion」が発生)
class Sample0703Copy implements Cloneable{
	String s = "nnn";
	//cloneメソッドをオーバーライドします
	protected Object clone() throws CloneNotSupportedException{
		//このオブジェクトのコピーを記述します.
		//この例だと、実はあまり意味がありません(return super.clone();でによる浅いコピーを返すだけでも同じ)
		Sample0703Copy cp = new Sample0703Copy();
		cp.s = this.s;	
		
		return cp;
	}
}


public class Sample0703 {
	public static void main(String[] args) throws CloneNotSupportedException{
		Sample0703Copy cp1 = new Sample0703Copy();
		cp1.s = "abc";
		//コピー対象オブジェクトのclone()を使用してコピー
		Sample0703Copy cp2 = (Sample0703Copy)cp1.clone();
		System.out.println("コピー直後の状態");
		System.out.println("cp1.s=" + cp1.s);
		System.out.println("cp2.s=" + cp2.s);
		cp2.s = "xyz";	//コピー先のみ更新します。
		System.out.println("コピー先のみ値を更新(abc→xyz)");
		System.out.println("cp1.s=" + cp1.s);
		System.out.println("cp2.s=" + cp2.s);
	}
}

/*
 * コピー対象クラスにコピーメソッドを用意する場合
 * 
 * 
 */