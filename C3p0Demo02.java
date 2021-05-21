package Demo01;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/*
 c3p0的演示
 */
public class C3p0Demo02 {
    public static void main(String[] args) throws SQLException {
      /*
        //1.创建数据库连接池对象(使用默认)
        ComboPooledDataSource ds = new ComboPooledDataSource();

        //2.获取连接
        //验证最大可以获取10个连接对象，如果超过10个就会报错，延迟3秒自动报错
        for (int i = 0; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);
            if(i == 5){
                conn.close();//不是释放资源，而是归还到连接池
            }
        }
        */
        testNameConfig();
    }
    public static void testNameConfig() throws SQLException {
        //1.创建数据库连接池对象(不使用默认)
        ComboPooledDataSource ds = new ComboPooledDataSource("otherc3p0");
        //2.获取连接
        //验证最大可以获取10个连接对象，如果超过10个就会报错，延迟3秒自动报错
        for (int i = 0; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);

        }
    }
}
