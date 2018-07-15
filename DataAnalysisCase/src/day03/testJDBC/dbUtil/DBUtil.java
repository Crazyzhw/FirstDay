package day03.testJDBC.dbUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;





public class DBUtil {
	private static String classDriver;
	private static String url;
	private static String userName;
	private static String password;
	static {
		get();
	}
	public static Connection getCon()  {
		try {
			Connection con= DriverManager.getConnection(url, userName, password);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void  get() {
		Properties p =new Properties();
		try {
			p.load(DBUtil.class.getClassLoader().getResourceAsStream("mysql.properties"));
			 url = p.getProperty("url");
			 classDriver = p.getProperty("classDriver");
			 userName = p.getProperty("userName");
			 password = p.getProperty("password");
			 Class.forName(classDriver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet res,Statement statement,Connection con) {
		if(res!=null) {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
