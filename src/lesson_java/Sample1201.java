package lesson_java;

public class Sample1201 {
    public static void main (String[] args) {
        // 「IndexOutOfBoundsException」は実行時例外なのでスローされる可能性がありますが例外処理は強制されません。
        String className = args[0];

        try {
            // 検査例外の「ClassNotFoundException」がスローされる可能性があるので例外処理が強制されます。
            System.out.println(Class.forName(className) + "は存在しています。"); 
            System.out.println("例外は発生しませんでした。"); 
        }catch(ClassNotFoundException e) {
            System.out.println("例外が発生しました。");
            e.printStackTrace();
        }
    }
}


/*
 *
 * 例外処理の対象となるものは「Exception」,「RuntimeException」からの派生クラスになります
 * 
 *
 * 例外処理の構文は次のパターンに分類される
 * 1.スローされた例外をキャッチして処理を行う
 * 2.スローされた例外をキャッチせずそのままスローする
 * 3.明示的に例外をスローさせる
 * 
 * 
 * 1.スローされた例外をキャッチして処理を行う場合の書式
 * try{
 * 	例外がスローされる可能性がある処理;
 * }catch(例外1の型	変数){
 * 	例外1をキャッチしたときの処理
 * 	例外2をキャッチしたときの処理
 * 			・
 * 			・
 * 			・
 * }finally{
 * 	必ず実行される処理1;
 * }
 * 
 * 
 * try節で処理中に例外が発生すると、以降の処理は行われずに、直ちに処理が移行します
 */