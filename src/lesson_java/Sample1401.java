package lesson_java;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


//このクラスで「compare」メソッドを定義する為、「Comparator」インターフェースを実装しています。
public class Sample1401 implements Comparator<String> {
    private static String[] animal = {"Cat", "Dog", "Frog", "Duck"};

    public static void main(String[] args) {
        testHashSet();       //「HashSet」の動作確認処理の呼び出します。
        testLinkedHashSet(); //「LinkedHashSet」の動作確認処理の呼び出します。
        testTreeSet();       //「TreeSet」の動作確認処理の呼び出します。
    }
	
    //「HashSet」の動作確認処理
    private static void testHashSet() {
        HashSet<String> hs = new HashSet<String>();
        for(int i=0; i<animal.length; i++) {
            hs.add(animal[i]);
        }
        hs.add("Cat"); // 重複する要素を追加します。
        hs.add(null);  // ｎullを追加します。
        System.out.println("HashSet:" + hs);
    }

    //「LinkedHashSet」の動作確認処理
    private static void testLinkedHashSet() {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        for(int i=0; i<animal.length; i++) {
            lhs.add(animal[i]);
        }
        lhs.add("Cat"); // 重複する要素を追加します。
        lhs.add(null);  // ｎullを追加します。
        System.out.println("LinkedHashSet:" + lhs);
    }

    //「TreeSet」の動作確認処理
    private static void testTreeSet() {
        TreeSet<String> ts1 = new TreeSet<String>();
        // ソート順序を変更した「Comparator」クラスの実装を引数に指定します。
        TreeSet<String> ts2 = new TreeSet<String>(new Sample1401());
        for(int i=0; i<animal.length; i++) {
            ts1.add(animal[i]);
            ts2.add(animal[i]);
        }
        ts1.add("Cat");   // 重複する要素を追加します。
        // ts1.add(null); // ｎullを追加すると例外(ソート時にNullPointerException)が発生します。
        System.out.println("TreeSet（デフォルト）:" + ts1);
        System.out.println("TreeSet(降順に変更):" + ts2);
    }

    //「compare」の定義（ソート順序を降順に変更）
    public int compare(String s1, String s2) {
        return s1.compareTo(s2)*-1;
    }

}




/*
 * HashSetの書式
 * HashSet<要素の型> 変数 = new HashSet<要素の型>();
 * 
 * 
 */