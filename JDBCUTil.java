package Demo02;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
    JDBC工具类:
    *分析：
    1.注册驱动也抽取
    2.抽取一个方法获取连接对象
        *需求：不想传递参数（因为没有得到优化效果），还应该保证工具类的通用性
        *解决方案：配置文件
        (重点：这个地方缺少properties配置文件)
        jdbc.properties在配置文件中，写以下代码：
        url =
        user =
        password =
        dirver =
        文件的读取只需要读取一次就可以拿到那些值。使用静态代码块。
    3.抽取一个方法释放资源
 */

public class JDBCUTil {
    private static String url;
    private static String user;
    private static String password;
    private static String dirver;
    /*
    获取连接的方法，返回的是连接对象
     */
    static{
        try {
            //读取资源文件，获取值。
            //1.创建Properties集合类
            Properties pro = new Properties();
            //加载文件

            //  获取src路径下的文件的方式————> 使用 ClassLoader 类加载器
            ClassLoader classLoader = JDBCUTil.class.getClassLoader();
            URL res = classLoader.getResource("写properties文件路径");
            pro.load(new FileReader("写properties文件的绝对路径"));
            String path = res.getPath();
            System.out.println(path);
            //3.获取数据
            pro.load(new FileReader(path));

            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            dirver = pro.getProperty("dirver");
           //4.注册驱动
            Class.forName(dirver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url,user,password);
    }

    /*
    释放资源的方法
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    /*
      释放资源的方法
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }
}
