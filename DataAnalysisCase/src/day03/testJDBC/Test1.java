package day03.testJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import day03.testJDBC.dbUtil.DBUtil;

public class Test1 {
	public static void main(String[] args) throws SQLException {
		Connection con = DBUtil.getCon();
		Statement statement = con.createStatement();
		int i = statement.executeUpdate("insert into t_user1 (name)values ('你哈')");
		System.out.println(i);
		DBUtil.close(null, statement, con);
	}
}
