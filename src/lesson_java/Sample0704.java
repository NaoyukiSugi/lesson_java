package lesson_java;

import java.io.*;

// Serializableインターフェースが実装（シリアライズ可能）されている必要があります。
class Sample0704Copy implements Serializable {
String s = "nnn";
}

public class Sample0704 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sample0704Copy cp1 = new Sample0704Copy();
        cp1.s = "abc";
        // シリアライズを利用したコピー。 --------------------------------------------------------------------------
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(cp1);
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteOut.toByteArray()));
        Sample0704Copy cp2 = (Sample0704Copy)in.readObject();
        // ---------------------------------------------------------------------------------------------------------
        System.out.println("コピー直後の状態 ");
        System.out.println("cp1.s = " + cp1.s);
        System.out.println("cp2.s = " + cp2.s);

        cp2.s = "xyz";  // コピー先のみ更新します。
        System.out.println("コピー先（cp2）のみ値を更新（abc→xyz）");
        System.out.println("cp1.s = " + cp1.s);
        System.out.println("cp2.s = " + cp2.s);
    }
}




/*
 * 	シリアライズを利用する場合 
 */