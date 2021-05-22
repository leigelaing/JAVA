package servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/servletContextDemo02")
public class servletContextDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.通过HttpServlet获取ServletContext对象
        ServletContext Context = this.getServletContext();
        //2.定义文件名称
         String filename = "a.jpg";
        //3.获取MIME类型
        String mimeType = Context.getMimeType(filename);
        System.out.println(mimeType);//image/jpeg
    }
}
