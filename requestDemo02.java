import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo02")
public class requestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //get获取请求参数
      //根据请求参数的值获取请求参数
        String username = request.getParameter("hoppy");
       // System.out.println("get");
       // System.out.println(username);
        //跟据参数名称获取参数值的数组
        String[] hoppys = request.getParameterValues("hoppy");
       // for (String hobby:hoppys){
         //   System.out.println(hobby);
        //}
        //获取所有请求参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println(value);
            System.out.println("=====================");
        }
        //获取所有请求参数名称和值
        Map<String, String[]> parameterMap = request.getParameterMap();
       //遍历
        Set<String> keySet = parameterMap.keySet();
        for (String name:keySet){
        //获取健获取值
        String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value:values){
                System.out.println(values);
            }
            System.out.println("==================");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //post获取请求参数
        //根据请求参数的值获取请求参数
        String username1 = request.getParameter("hoppy");
        System.out.println("post");
        System.out.println(username1);


        //一样就写一份，简化代码
       // this.doGet(request,response);
    }
}
