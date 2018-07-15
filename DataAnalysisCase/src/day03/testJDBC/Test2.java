package day03.testJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import day03.testJDBC.bean.UserBean;
import day03.testJDBC.dbUtil.DBUtil;

public class Test2 {
	public static void main(String[] args) {
//		testInsert();
		testSerch();
		
	}

	private static void testSerch() {
		Connection con = DBUtil.getCon();
		QueryRunner qr = new QueryRunner();
		String sql = "select * from t_user1 where id>?";
		try {
			//需要保证bean的属性值和表的字段值一致，并且要提供get和set方法
			List<UserBean> query = qr.query(con, sql, new BeanListHandler<UserBean>(UserBean.class), 2);
			for (UserBean userBean : query) {
				System.out.println(userBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(null, null, con);
		}
	}

	private static void testInsert() {
		Connection con = DBUtil.getCon();
		QueryRunner  qr = new QueryRunner();
		try {
			int i = qr.update(con,"delete from t_user1 where name ='你哈'");
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(null, null, con);
		}
	}
}
