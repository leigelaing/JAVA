package Demo02;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
   Druid连接池工具类
 */
public class JDBCUtils {
    //1.定义成员变量 DataSource
    private static DataSource ds;
    static{
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.获取DataSource
            ds = DruidDataSourceFactory.createDataSource(pro);
            System.out.println(ds);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
      提供三个方法：
     */
    //1.获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    //2.释放资源
    public static void close(Statement stmt,Connection conn)  {
        if(stmt!= null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!= null){
            try {
                conn.close();//归还连接
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        //以上代码简化，调用下方的close（）方法，第一个参数直接给空值
    //   close(null,stmt,conn);
    }
    public static void close(ResultSet rs, Statement stmt, Connection conn)  {
        if(rs!= null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(stmt!= null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!= null){
            try {
                conn.close();//归还连接
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    //3.获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }
}
