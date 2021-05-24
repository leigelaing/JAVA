package com.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//浏览器直接请求资源时，该过滤器会被执行。
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//只有转发访问index.jsp时，该过滤器才会被执行。
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//浏览器直接访问请求index.jsp或者转发访问index.jsp该过滤器才会被执行。
@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,
        DispatcherType.FORWARD})
public class FilterDemo05 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilerDemo05...");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
    @Override
    public void destroy() {
    }
}
