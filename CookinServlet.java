package Demo02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 （1）可以采用cookin来完成
 （2）在服务器中的servlet判断是否有一个名为lasttime的cookin
    * 有：不是第一次访问。
         & 响应数据：欢迎回来，您上次的访问时间为：显示时间字符串
         & 写回cookin：lasttime = 时间字符串
    * 没有：是第一次访问。
         & 响应数据：您好！欢迎首次访问
         & 写回cookin：lasttime = 时间字符串
 */
@WebServlet("/cookinServlet")
public class CookinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //设置响应的消息体的格式以及编码：
        response.setContentType("text/html;charse=utf-8");

    //1.获取所有的cookin
        Cookie[] cookies = request.getCookies();
        boolean flag = false;//没有cookie
    //2.遍历Cookin数组
      if(cookies!=null && cookies.length > 0){
          for(Cookie cookie:cookies){
              //3.获取cookin的名称
              String name = cookie.getName();
              //4.判断cookin的名称是否是lastTime
              if("lastTime".equals(name)){
                  //有，不是第一次访问
                  flag = true;//有lastTime的cookie
                  //设置cookin的value
                  //获取当前时间字符串，重新设置Cookin的值。重新发送Cookin
                  Date date = new Date();//获取当前时间
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
                  String strdate = sdf.format(date);
                  //解决编码问题
                  System.out.println("编码前："+strdate);
                  //URL编码
                  strdate = URLEncoder.encode(strdate,"UTF-8");
                  System.out.println("编码后："+strdate);
                   cookie.setValue(strdate);
                   //设置cookie的存活时间
                  cookie.setMaxAge(60*60*24);//一天
                   response.addCookie(cookie);
                  //响应数据：
                  //获取cookin的value，时间
                  String value = cookie.getValue();
                  System.out.println("解码前"+value);
                  //URL解码：
                  value = URLEncoder.encode(value,"UTF-8");
                  System.out.println("解码后"+value);
                  response.getWriter().write("<h1>欢迎回来，您上次的访问时间为："+value+"</h1>");
                     break;
              }
          }
      }
      if(cookies == null || cookies.length == 0 || flag == false){
          //没有 第一次访问
          //设置cookin的value
          //获取当前时间字符串，重新设置Cookin的值。重新发送Cookin
          Date date = new Date();//获取当前时间
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
          String strdate = sdf.format(date);
          //解决编码问题
          System.out.println("编码前："+strdate);
          //URL编码
          strdate = URLEncoder.encode(strdate,"UTF-8");
          System.out.println("编码后："+strdate);
          Cookie cookie = new Cookie("lastTime",strdate);
          //设置cookie的存活时间
          cookie.setMaxAge(60*60*24);//一天
          response.addCookie(cookie);
          response.getWriter().write("<h1>您好！，您首次访问</h1>");

      }
    }
}
