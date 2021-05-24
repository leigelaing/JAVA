package web.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet("/ajaxServlet")
public class AJaxServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //1.获取请求参数：
        String username = request.getParameter("username");
        //2.打印username
        System.out.println(username);
        //3.响应
        response.getWriter().write("hello:"+username);
    }
}
