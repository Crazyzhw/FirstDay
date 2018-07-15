package day03.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestJDBC {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost/bigdata35?characterEncoding=utf-8&useSSL=false";
		String user="root";
		String password ="123456";
		String sql ="select *from t_user1 where age >18" ;
		try {
			//注册驱动
			DriverManager.registerDriver(new Driver());
			//连接到数据库
			Connection con = DriverManager.getConnection(url, user, password);
			//获得对象
			Statement statement = con.createStatement();
//			int i = statement.executeUpdate("insert into t_user1(name)values('小红')");
			//执行sql语句
			//插入
//			int i= statement.executeUpdate("insert into t_user1(name,sex,age)values('小黑','男',23)");
			//删除
//			int i = statement.executeUpdate("delete from t_user1 where name ='小黑'");
			//更改 
//			int i = statement.executeUpdate("update t_user1 set id=18 where name ='小白'");
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				int age = result.getInt("age");
				System.out.println(id+"\t"+name+"\t"+age);
			}
			String name = "小牛'or 1=1'";  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
