package CookieDemo523;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
 cookie的快速入门
 */
@WebServlet("/cookieDemo01")
public class cookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建Cookie对象
        Cookie c = new Cookie("msg","hello");
        //设置path，让当前服务器下部署的所有项目共享Cookie信息。
        c.setPath("/");
        //2.发送Cookie
        response.addCookie(c);

    }
}
