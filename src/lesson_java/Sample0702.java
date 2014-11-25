package lesson_java;

class Sample0702Copy{
	String s = "nnn";
}


public class Sample0702 {
	public static void main(String[] args){
		Sample0702Copy cp1 = new Sample0702Copy();
		cp1.s = "abc";
		//「=」によるコピー
		Sample0702Copy cp2 = cp1;
		System.out.println("コピー直後の状態");
		System.out.println("cp1.s=" + cp1.s);
		System.out.println("cp2.s=" + cp2.s);
		cp2.s = "xyz";	//コピー先のみ更新する
		System.out.println("コピー先(cp2)のみの更新(abc→xyz)");
		System.out.println("cp1.s=" + cp1.s);
		System.out.println("cp2.s=" + cp2.s);		
	}
}
