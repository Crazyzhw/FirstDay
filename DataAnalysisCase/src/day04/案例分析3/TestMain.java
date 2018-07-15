package day04.案例分析3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;

import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String url ="jdbc:mysql://localhost/bigdata35?characterEncoding=utf-8&useSSL=false";
		String user="root";
		String password ="123456";
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\\\JAVA资料\\\\案例资料\\\\day03-ip地址归属地\\\\access.log"));
				){
			String line ;
			while((line=br.readLine())!=null) {
				String[] split = line.split("\\|");
				long ip = IpUtil.ipts(split[1]);
				IpBean ipBean =IpUtil.getIpbean(ip);
				String pro =ipBean.getPro();
				Integer count = map.getOrDefault(pro, 0);
				count++;
				map.put(pro, count);
			}
			List<Entry<String, Integer>> list=IpUtil.mapSort(map);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			QueryRunner qr =new QueryRunner();
			qr.update(conn,"create table pro(id int  primary key auto_increment,pro varchar(20),count int);");
			for (Entry<String, Integer> entry : list) {
				System.out.println(entry);
				String pro =entry.getKey();
				int count =entry.getValue();
				int i = qr.update(conn,"insert into pro (pro,count) values(?,?)", pro,count);
				System.out.println(i);
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
