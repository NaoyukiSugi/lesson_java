package lesson_java;


//独自例外クラス
class Exception1203 extends Exception {
 Exception1203() { super(); }
 Exception1203(String s) { super(s); }
}

//独自例外の呼び出しクラス
public class Sample1203 {
 public static void main (String[] args) {
     try {
         thrower(args);
         System.out.println("例外は発生しませんでした。");
     }catch(Exception1203 e) {
         e.printStackTrace();
     }
 }
 static int thrower(String[] ary) throws Exception1203 {
     if (ary.length == 0) {
         throw new Exception1203("Exception1203がスローされました。");
     }
     return 0;
 }
}


/*
 * 明示的に例外をスローさせる場合
 * 
 * throw 例外オブジェクト
 */