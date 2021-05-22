package servletcontext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( "/servletContextDemo01")
public class servletContextDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ServletContext有两种获取方式
      /*
       1.获取MIME对象
       （1）通过request对象获取
            request.getServletContext();
       （2）通过HttpServlet获取
            this.getServletContext();
       */
        //（1）通过request对象获取
        ServletContext Context1 = request.getServletContext();
        //（2）通过HttpServlet获取
        ServletContext Context2 = this.getServletContext();
        System.out.println(Context1);
        System.out.println(Context2);
        System.out.println(Context1 == Context2);
        /*
        org.apache.catalina.core.ApplicationContextFacade@218b6f40
        org.apache.catalina.core.ApplicationContextFacade@218b6f40
         true
         Context1与Context2相等
          */
    }
}
