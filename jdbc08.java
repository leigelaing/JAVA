package Demo01;
import java.sql.*;

/*
   练习：
     查询empt表的数据将其封装为对象，然后装载集合，返回。
   分析：
     1.定义empt类
     2.定义方法 public List<empt> findAll(){}
     3.实现方法 select*from empt;
 */
public class jdbc08 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection con = null;
        ResultSet count = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取数据库连接对象（Connection）
            con = DriverManager.getConnection("jdbc:mysql:///leigeliang", "root", "root");
            //3.定义SQL
            String sql = "select * from account ";
            //4.获取执行SQL语句的对象Statement
            stmt = con.createStatement();
            //5.执行SQL，接收返回结果
            count = stmt.executeQuery(sql);//影响的行数
            //6.处理结果
            //6.1让游表向下移动一行
            while(count.next()){
                //循环判断结果集是否有数据
                //6.2获取数据
                int id = count.getInt(1);
                String name = count.getString("name");
                double balance = count.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7.释放资源
            //为了避免空指针异常，空指针不能调用函数。
            if (count != null) {
                try {
                    count.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
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
}
