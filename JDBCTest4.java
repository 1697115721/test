import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author         lsp
 * @version        V1.0  
 * @Date           2016-8-11 上午9:50:51 
 * @Description:   TODO(用一句话描述该文件做什么) 
 */
public class JDBCTest4 {
  public static void main(String[] args) {
	  Connection con=null;
	  Statement sta=null;
	  ResultSet rs=null;
	  
	  try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	  } catch (ClassNotFoundException e) {
		 e.printStackTrace();
	  }
	  try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","666888");
	   sta=con.createStatement();
	   rs=sta.executeQuery("select * from Tuserinfo");
	   while(rs.next()){
		   System.out.println(rs.getInt(1));
	   }
	  } catch (SQLException e) {
		e.printStackTrace();
	}
	  
  }
}
