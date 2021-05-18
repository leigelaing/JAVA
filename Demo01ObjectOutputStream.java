package Demo02;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream  extends OutputStream;
ObjectOutputStream  :对象的序列化流
作用：把对象以流的方式写入到文件中保存
构造方法：
   1.ObjectOutputStream(OutputStream out)
     创建一个写入指定的OutputStream的ObjectOutputStream。
   参数：
   OutputStream out：字节输出流
 特有的成员方法：
   void writeObject(Object obj) 将指定的对象写入ObjectOutputStream。
 使用步骤：
   1.创建ObjectOutputStream对象，构造方法中传递字节输出流
   2.使用ObjectOutputStream对象的方法writerObject，把对象写入到文件中。
   3.释放资源。
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        // 1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("2021.5.18\\a.txt"));
      // 2.使用ObjectOutputStream对象的方法writerObject，把对象写入到文件中。
        oops.writeObject(new Person("aaa",15));
     //3.释放资源。
        oops.close();
    }
}
