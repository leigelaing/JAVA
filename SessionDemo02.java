package SessionDemo522;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/SessionDemo02")
public class SessionDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //使用session获取数据
        //1.获取session
        HttpSession session = request.getSession();
        System.out.println(session);
         //期望客户端关闭后，session也能相同，办法如下
        Cookie c = new Cookie("JSESSIOMID",session.getId());
        c.setMaxAge(60*60);
        response.addCookie(c);
    }
}
