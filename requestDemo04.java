import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo04")
public class requestDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo888888被访问了......");
        //转发到demo9资源路径
        /*
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo05");
        requestDispatcher.forward(request,response);
        */
        //存储数据到request域中
        request.setAttribute("msg","雷葛亮");

       request.getRequestDispatcher("/requestDemo05").forward(request,response);
    }
}
