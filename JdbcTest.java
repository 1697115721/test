import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author         lsp
 * @version        V1.0  
 * @Date           2016-8-10 下午10:58:06 
 * @Description:   TODO(数据库连接) 
 */
public class JdbcTest {
    public static void main(String[] args) {
    	Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//1、加载驱动
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				//2、创建JDBC连接
				try {
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "666888");
				//3、创建Statement对象
				stmt = conn.createStatement();
				//4、执行SQL语句，返回结果
				rs = stmt.executeQuery("select ename from emp");
				//5、操作结果集
					while (rs.next()) {
						System.out.println(rs.getString(1));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					//6、关闭连接
					try {
						if (null != stmt) {
							stmt.close();
						}
						if (null != conn) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
	}
}
