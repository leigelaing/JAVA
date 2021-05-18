package Demo02;
import java.io.*;

/*
  java.io.InPutStreamReader  extends Reader
   InPutStreamReader是字节流通向字符流的桥梁，它使用指定的Charset读取字节并将其解码为字符。
   继承自父类的方法：
    int read（）:  读取单个字符
   int read（char[] cbuf）: 一次读取多个字符，将字符读入数组
   void close（）：关闭该类并释放与之关联的所有资源。
   构造方法：
    1.InputStreamReader(InputStream in)
       创建一个使用默认字符集的InputStreamReader。
    2. InputStreamReader(InputStream in, String charsetName)
       创建一个使用命名字符集的InputStreamReader。
       参数：
       InputStream in：字节输入流，用来读取文件中保存的字节
       String charsetName：指定编码表名称，不区分大小写，可以是：GBK，Utf-8，.....
      注意：不指定默认为：UTF-8
      使用步骤：
      1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称。
      2.使用InputStreamReader对象中的read，读取文件
      3.释放资源。
      注意事项：
      构造方法中指定的编码表名称要和文件的编码相同，否则会发生乱码。

 */
public class Demo01InPutStreamReader {
    public static void main(String[] args) throws IOException {
     readUTF_8();
    }

    private static void readUTF_8() throws IOException {
       //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称。
 //       InputStreamReader isr = new InputStreamReader(new FileReader("写入读取文件的路径"),"UTF-8");
      //2.使用InputStreamReader对象中的read，读取文件
       int len = 0;
  //     while((len = isr.read()) != -1){
           System.out.println((char) len);
       }
        // 3.释放资源。
 //       isr.close();
    }
//}
