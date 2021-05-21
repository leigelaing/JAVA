package Demo02;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
  使用Druid工具类
 */
public class DruidDemo02 {
    public static void main(String[] args) {
        /*
         完成一个添加的操作，给db4 的user表添加一条记录
         */
   //1.获取连接
        Connection conn =null;
        PreparedStatement pstmt= null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
           //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给？赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //6.释放资源
            JDBCUtils.close(pstmt,conn);
        }
    }
}
