package servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
 /*
   重定向
 */
@WebServlet("/servletcontext.ResponseDemo01")
public class ResponseDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servletcontext.ResponseDemo01.....");
        //访问/ResponseDemo01资源  自动跳转到/ResponseDemo02资源
        //1.设置状态码为302
       // response.setStatus(302);
        //2. 设置头为loction
       // response.setHeader("location","/demo05/servletcontext.ResponseDemo02");
        /*
        重定向方法二(使用一个简单的函数)
        */
        response.sendRedirect("/demo05/servletcontext.ResponseDemo02");

    }
}
