package day06.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 1.根据给的用户上网日志记录数据，计算出总流量最高的网站Top3(网站例如：v.baidu.com，weibo.com)
 *
 */

public class MyTest01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		try (
			BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day05-流量统计\\http.log"));
				){
			String line;
			while((line=br.readLine())!=null) {
				String[] split = line.split("(\t|\\s)");
				int up = Integer.parseInt(split[2]);
				int down =Integer.parseInt(split[3]);
				String web=WebUtil.getWeb(split[1]);
				Integer sum = map.getOrDefault(web, 0);
				sum=sum+up+down;
				map.put(web, sum);
			}
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			List<Entry<String,Integer>> list = new ArrayList<>(entrySet);
			WebUtil.sortByCount(list);
			for (Entry<String, Integer> entry : list) {
				System.out.println(entry);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
