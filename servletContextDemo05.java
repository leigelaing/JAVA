package servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet( "/servletContextDemo05")
public class servletContextDemo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过HttpServlet获取ServletContext对象
        ServletContext Context = this.getServletContext();
        //获取文件的服务器路径
        String realPath = Context.getRealPath("/a.txt");//web目录下资源访问
        System.out.println(realPath);
        File file = new File(realPath);
        String b = Context.getRealPath("/WEB-INF/b.txt");//WEB-INF目录下的资源访问
        System.out.println(b);
        String c = Context.getRealPath("/WEB-INF/classes/c.txt");//src目录下的资源访问
        System.out.println(c);
    }
}
