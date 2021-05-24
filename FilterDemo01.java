package com.filter;
import javax.servlet.*;
import java.io.IOException;
//@WebFilter("/*")  //访问所有资源之前，都会执行该过滤器。
public class FilterDemo01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterdemo01被执行了....");
        //是否放行的操作
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
    @Override
    public void destroy() {
    }
}
