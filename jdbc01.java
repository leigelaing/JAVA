package demo01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
    JDBC的快速入门

 */
public class jdbc01 {
    public static void main(String[] args) throws Exception {
        // 1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
         //3.获取数据库连接对象（Connection）
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dept", "root", "root");
         // 4.定义SQL语句
         String sql = "update account set balance = 500 where id = 1";
         // 5.获取执行SQL语句的对象Statement
        Statement stmt = con.createStatement();
        // 6.执行SQL，接收返回结果
        int  count = stmt.executeUpdate(sql);
        // 7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        con.close();
    }
}

