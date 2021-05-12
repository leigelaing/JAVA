package request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
 演示Request对象获取请求行数据
 */
@WebServlet("/rDemo01")
public class RequestDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
      1.获取请求行数据：
        *GET/day14/demo01？name= zhangsan HTTP/1.1
     */
        //（1）获取请求方式：GET
        // *String getMethod（）；
        String method = request.getMethod();
        System.out.println(method);
        //（2）获取虚拟目录：/day14     (重要)
        // *String getContextPath（）；
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //（3）获取Servlet路径：/demo01
        // *String getServletPath（）；
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //4）获取get方式请求参数：name=zhangsan
        // *String getQueryString（）；
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //（5）获取请求URL：/day14/demo01   （重要）
        //  * String getRequestURI（）； ///day14/demo01
        //  * StringBuffer getRequestURI（）；//http;//localhost/day14/demo01
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL1 = request.getRequestURL();
        System.out.println(requestURL1);
        //（6）获取协议及版本：HTTP/1.1
        // *String getProtcol（）；
        String protocol = request.getProtocol();
        System.out.println(protocol);
        // （7）获取客户机的IP地址：
        // *String getRemoteAddr（）；
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
