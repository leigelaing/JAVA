package CookieDemo523;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
 cookie的快速入门
 */
@WebServlet("/cookieDemo02")
public class cookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3.获取Cookie 对象
        Cookie[] cs = request.getCookies();
       //获取数据，遍历Cookies
        if(cs != null){
            for(Cookie c:cs){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+"------"+value);
            }
        }
    }
}
