package Demo02;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    文件的复制

 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C://1.jpg");
        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("D://1.jpg");
        //一次读取一个字节，写入一个字节
        //3.使用字节输入流对象的read方法

        int len = 0;
        while((len = fis.read())!=-1){
            fos.write(len);
        }
        //5.资源释放
        //先关闭写的
        fos.close();
        fis.close();
    }
}
