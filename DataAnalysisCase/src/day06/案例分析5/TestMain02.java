package day06.案例分析5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.util.Set;

/**
 * 2.根据给的手机号段归属地规则，计算出总流量最高的省份Top3
 * 
 * @author Mr.zhw
 */
public class TestMain02 {
	public static void main(String[] args) {
		Map<String, PhoneBean> map = getMap();
		Map<String, Integer> map2 = new HashMap<>();
		ComboPooledDataSource pool =new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(pool);
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day05\\http.log"));) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] split = line.split("(\t| )");
				PhoneBean phoneBean = map.get(split[0].substring(0, 7));
				int up = Integer.parseInt(split[2]);
				int down = Integer.parseInt(split[3]);
				String province = phoneBean.getProvince();
				Integer sum = map2.getOrDefault(province, 0);
				sum+=(up+down);
				map2.put(province, sum);
			}
			Set<Entry<String, Integer>> entrySet = map2.entrySet();
			ArrayList<Entry<String, Integer>> list = new ArrayList<>(entrySet);
			SortUtil.sortBySum(list);
			for (int i = 0; i < Math.min(3, list.size()); i++) {
				qr.update("insert into t_http (province,sum)values(?,?)",list.get(i).getKey(),list.get(i).getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Map<String, PhoneBean> getMap() {
		Map<String, PhoneBean> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例分析day05\\phone.txt"));) {
			String line = null;
			br.readLine();
			while ((line = br.readLine()) != null) {
				// 199 1999957 新疆 博乐 电信 833400 0909 652701
				String[] split = line.split("\t");
				PhoneBean bean = new PhoneBean();
				bean.set(split[0], split[1], split[2], split[3], split[4]);
				map.put(split[1], bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
