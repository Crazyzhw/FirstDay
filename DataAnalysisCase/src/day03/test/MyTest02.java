package day03.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyTest02 {
	public static List<WebBean> getList() {
		List<WebBean> list = new ArrayList<>();
		try(
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day03-ip地址归属地\\ip.txt"));
				){
			String  line;
			while((line=br.readLine())!=null) {
				String[] split = line.split("\\|");
				long ipStart = Long.valueOf(split[2]);
				long ipEnd = Long.valueOf(split[3]);
				String pro =split[6];
				WebBean webBean = new WebBean();
				webBean.set(ipStart, ipEnd, pro);
				list.add(webBean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
