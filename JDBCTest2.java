import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author         lsp
 * @version        V1.0  
 * @Date           2016-8-11 上午9:11:25 
 * @Description:   TODO(用一句话描述该文件做什么) 
 */
public class JDBCTest2 {
	public static void main(String[] args) {
             Connection con=null;
             Statement sta=null;
             ResultSet rs=null;
             List <TUserInfo> list=new ArrayList<TUserInfo>();
             //加载驱动
             try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
             
             try {
            	//创建数据库连接
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","666888");
				//创建Statement 对象
				sta=con.createStatement();
				//通过Statement 对象执行SQL语句
				 rs=sta.executeQuery("select * from TUserInfo");
				 while(rs.next()){
					 TUserInfo u=new TUserInfo();
					 u.setId(rs.getInt(1));
					 u.setName(rs.getString(2));
					 u.setAge(rs.getInt(3));
					 list.add(u);
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
             
             
             System.out.println("打印查询出的数据");
             for(TUserInfo user:list){
            	 System.out.println(user.toString());
             }
	}
       
	       
}          
          