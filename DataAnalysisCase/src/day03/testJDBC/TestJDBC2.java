package day03.testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestJDBC2 {
	public static void main(String[] args) {
		String name= "小红红'or 'true''";
		test1(name);
		System.out.println("-------");
		test2(name);
	}

	private static void test1(String name) {
		String url ="jdbc:mysql://localhost/bigdata35?characterEncoding=utf-8&useSSL=false";
		String user="root";
		String password ="123456";
		try {
			//隐式驱动
			//推荐是这种预编译    1：安全，防止sql注入问题  2：高效
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			String sql ="select * from t_user1 where name =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String tname = result.getString("name");
				int age = result.getInt("age");
				System.out.println(id+"\t"+tname+"\t"+age);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test2(String name) {
		String url ="jdbc:mysql://localhost/bigdata35?characterEncoding=utf-8&useSSL=false";
		String user="root";
		String password ="123456";
		String sql ="select *from t_user1 where name='"+name+"'" ;
		try {
			//注册驱动
			DriverManager.registerDriver(new Driver());
			//连接到数据库
			Connection con = DriverManager.getConnection(url, user, password);
			//获得对象
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				int id = result.getInt("id");
				String tname = result.getString("name");
				int age = result.getInt("age");
				System.out.println(id+"\t"+tname+"\t"+age);
			}
//			String name = "小牛'or 1=1'";  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
