package com.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       //对request对象请求消息增强
        System.out.println("filterDemo02....执行了");
       //放行
        //chain.doFilter(seq,sesp);
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filterDemo02....回来了");
    }
    @Override
    public void destroy() {
    }
}
