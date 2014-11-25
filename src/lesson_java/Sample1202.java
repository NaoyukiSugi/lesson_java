package lesson_java;

public class Sample1202 {
	public static void main(String[] args) throws ClassNotFoundException{
		//「IndexoutBoundsException」は実行時例外なのでスローされる可能性がありますが例外処理は強制されません
		String className = args[0];
		//検査例外の「ClassNotFoundException」がスローされる可能性があるので例外処理が強制されます。
		System.out.println(Class.forName(className) + "は存在しています");
		System.out.println("例外は発生しませんでした");
	}
}

/*スローされた例外をキャッチせず、そのままスローする場合
 * 
 * 
 *メソッド throws 例外オブジェクトリスト{
 *	処理;
 *}
 */