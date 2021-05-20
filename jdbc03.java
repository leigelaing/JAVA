package Demo01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
   练习：
   1.account表，添加一条记录 insert语句
   2.account表，修改记录
   3.account表，删除记录
 */
public class jdbc03 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection con = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取数据库连接对象（Connection）
            con = DriverManager.getConnection("jdbc:mysql:///leigeliang", "root", "root");
            //3.定义SQL
            String sql = "delete from account where id = 3";
            //4.获取执行SQL语句的对象Statement
            stmt = con.createStatement();
            //5.执行SQL，接收返回结果
            int count = stmt.executeUpdate(sql);//影响的行数
            //6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("成功");
            } else {
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            //为了避免空指针异常，空指针不能调用函数。
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }

                }

            }

        }
    }
}
