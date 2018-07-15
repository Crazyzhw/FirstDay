package day06.案例分析5;

/**
 * 1.根据给的用户上网日志记录数据，计算出总流量最高的网站Top3(网站例如：v.baidu.com，weibo.com)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestMain01 {
	public static void main(String[] args) throws Exception {
		ComboPooledDataSource pool =new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(pool);
		Map<String, Integer> map = getMap();
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<>(set);
		SortUtil.sortBySum(list);
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			qr.update("insert into t_http (http,sum)values(?,?)",list.get(i).getKey(),list.get(i).getValue());
		}
	}

	private static Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<>();
		 try (
			 BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day05\\http.log"));
				 ){
			 String line;
			 while((line=br.readLine())!=null) {
				 String[] split = line.split("(\t| )");
				String url =SortUtil.getUrl(split[1]);
				int up = Integer.parseInt(split[2]);
				int down = Integer.parseInt(split[3]);
				Integer sum = map.getOrDefault(url, 0);
				sum+=(up+down);
				map.put(url, sum);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return map;
	}
}	
