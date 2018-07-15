package day03.testJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import day03.testJDBC.bean.UserBean;

public class TestPool {
	public static void main(String[] args) {
		testPool1();
//		testPool2();
	}

	public static void testPool2() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner();
		try {
			Connection con = cpds.getConnection();
			int i = qr.update(con,"delete from t_user1 where name ='haha'");
			System.out.println(i);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testPool1() {
		ComboPooledDataSource   cpds = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cpds);
		try {
//			int i = qr.update("insert into t_user1 (name)values('haha')");
			String sql ="select * from t_user1 where age=?";
			UserBean query = qr.query(sql, new BeanHandler<UserBean>(UserBean.class),18);
			System.out.println(query);
//			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
