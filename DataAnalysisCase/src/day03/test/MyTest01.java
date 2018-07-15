package day03.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyTest01 {
	public static List<Long> getIPList() {
		List<Long> webList =new ArrayList<>();
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day03-ip地址归属地\\access.log"));
				){
			String line;
			while((line =br.readLine())!=null) {
				String[] split = line.split("\\|");//要转义
				String web = split[1];
				Long w=IpUtil.IpTs(web);
				webList.add(w);
			}
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return webList;
	}
}
