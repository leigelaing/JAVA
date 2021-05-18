package Demo02;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
JDK7的新特性：
         在try的后边可以增加一个(),在括号中可以定义流对象。
         那么这个流对象的作用域就在try中有效
         try中的代码执行完毕后，会自动把流对象释放，不用写Finally
         格式：
         try(定义流对象（可以定义多个流对象）){
         可能出现异常的代码
         }catch(异常类的变量 变量名){
         异常的处理逻辑
         }
 */
public class Demo01JDK7 {
    public static void main(String[] args) {
        try(//1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
            FileInputStream fis = new FileInputStream("C://1.jpg");
            //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
            FileOutputStream fos = new FileOutputStream("D://1.jpg");){
            //一次读取一个字节，写入一个字节
            //3.使用字节输入流对象的read方法

            int len = 0;
            while((len = fis.read())!=-1){
                fos.write(len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
