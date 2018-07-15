package day05.案例分析4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;

import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestMain01 {
	public static void main(String[] args) throws Exception {
		ComboPooledDataSource pool = new ComboPooledDataSource();
		QueryRunner runner =new QueryRunner(pool);
		String sql ="insert into t_movie_uid (movie,rate,timeStamp,uid)values(?,?,?,?)";
		Map<String, List<RateBean>> map = getMap();
		Set<Entry<String, List<RateBean>>> entrySet = map.entrySet();
		for (Entry<String, List<RateBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RateBean> value = entry.getValue();
			SortUtil.sortByRate(value);
//			System.out.println(key);
			Object[][] s=new Object [3][4];
			for (int i = 0; i < Math.min(3, value.size()); i++) {
				RateBean bean = value.get(i);
				Object [] s1= {bean.getMovie(),bean.getRate(),bean.getTimeStamp(),bean.getUid()};
				s[i]=s1;
			}
			int[] batch = runner.batch(sql, s);
			System.out.println(batch);
		}
	}

	public static Map<String, List<RateBean>> getMap() {
		
		Map<String, List<RateBean>> map = new LinkedHashMap<String, List<RateBean>>();
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day04-电影排行\\rating.txt"));
				){
			String line;
			while((line=br.readLine())!=null) {
				RateBean rateBean = JSON.parseObject(line, RateBean.class);
				List<RateBean> list = map.getOrDefault(rateBean.getUid(),new ArrayList<RateBean>());
				list.add(rateBean);
				map.put(rateBean.getUid(), list);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
