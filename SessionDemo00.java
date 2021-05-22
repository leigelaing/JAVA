package SessionDemo522;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/SessionDemo00")
public class SessionDemo00 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //使用session共享数据
        //1.获取session对象
        HttpSession session = request.getSession();
        //2.存储数据
        session.setAttribute("msg","leigeliang");
    }
}
