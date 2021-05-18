package Demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
  java.io.ObjectInputStream  extends InputStream
  ObjectInputStream :对象的反序列化流
  作用：
     把文件中保存的对象，以流的方式读取出来使用。
     构造方法：
      1.ObjectInputStream(InputStream in)
       创建从指定的InputStream读取的ObjectInputStream。
     参数：
     InputStream in：字节输入流
     特有的成员方法：
        Object readObject() ：从ObjectInputStream读取一个对象。
   使用步骤：
   1.创建ObjectInputStream对象，构造方法中传递字节输入流
   2.使用ObjectInputStream对象的方法readObject()读取文件中的对象
   3.释放资源
   4.使用读取出来的对象
   注意事项：
   readObject()声明抛出ClassNotFoundException（class文件找不到异常）
   当不存在对象的class文件时抛出此异常
   反序列化的前提：
     1.类必须实现Serialization
     2.必须存在类对应的class文件
 */
public class Demo01ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1.创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ojs = new ObjectInputStream(new FileInputStream("2021.5.18\\a.txt"));
        // 2.使用ObjectInputStream对象的方法readObject()读取文件中的对象
        Object o = ojs.readObject();
        //3.释放资源
        ojs.close();
        // 4.使用读取出来的对象
        System.out.println(o);
        Person p = (Person)o;
        System.out.println(p.getName()+p.getAge());
    }
}
