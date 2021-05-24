package Servletdemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class contextInitialized implements ServletContextListener {
    /**
     * 监听ServletContext对象创建的。ServletContext对象服务器启动后自动创建。
     * 在服务器启动后自动调用。
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext被创建了");
    }

    /**
     * 在服务器关闭后，ServletContext对象被销毁。当服务器正常关闭后该方法被调用。
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext被销毁了");
    }
}
