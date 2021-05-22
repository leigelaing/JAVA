package servletcontext;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/servletcontext.ResponseDemo04")
public class ResponseDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      //1.获取字节输出流
        ServletOutputStream sos = response.getOutputStream();
      //2.输出数据  获取字节数组
        //sos.write("hello".getBytes());
       //getBytes()使用GBK编码
        sos.write("雷葛亮".getBytes("UTF-8"));
    }
}
