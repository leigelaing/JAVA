package CookieDemo523;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
 cookie的快速入门
 */
@WebServlet("/cookieDemo04")
public class cookieDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建Cookie对象
        Cookie c1 = new Cookie("msg","setMaxAge");
        //设置cookie的存活时间
        //c1.setMaxAge(30);//将cookie持久化保存到硬盘上，30秒后自动删除cookie文件
        //c1.setMaxAge(-1);//使用默认值
        //c1.setMaxAge(0);//删除数据
        //3.发送Cookie
        response.addCookie(c1);
    }
}
