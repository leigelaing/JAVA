package servletcontext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletcontext.ResponseDemo03")
public class ResponseDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取字符输出流
        /*
        response获取的流对象将来不用去刷新这个流，因为response在完成一次相应之后就会自动销毁。
        同时流也会自动关闭
         */
        //获取流之前，设置流的默认编码：ISO-8859-1 设置为 GBK。
        response.setCharacterEncoding("GBK");
        //告诉浏览器，服务器发送的消息体数据的编码，建议浏览器也使用该编码解码。
       // response.setHeader("content-type","text/html;charset=utf-8");
        //上面一行代码的简单形式：用来设置编码
         response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        //2.输出数据
       // pw.write("hello  leigeliang");
        //pw.write("<h1> hello </h1>");
        pw.write("爱情是狗娘");
        /*
        中文乱码问题：编解码使用的字符集不一致
        浏览器默认使用字符集为  GBK（gb2312）；
        服务器中的流对象不是new出来的，而是获取出来的
        tomcat服务器：创建的reponse对象，tomcat使用的编码为 ISO-8859-1
        乱码就正常了
        解决方案：
         获取流之前，设置流的默认编码：ISO-8859-1 设置为 GBK。


         新的问题：你不知道浏览器默认是什么编码，怎么办。
         解决方法：已知服务器的编码字符集：将服务器的编码字符集告诉浏览器
          response.setContentType("text/html;charset=utf-8");
       */

    }
}
