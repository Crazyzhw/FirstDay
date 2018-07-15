package day06.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *2.根据给的手机号段归属地规则，计算出总流量最高的省份Top3
 */
public class MyTest02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		try(
			BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day05-流量统计\\http.log"));
				) {
			String line;
			while((line=br.readLine())!=null) {
				String[] split = line.split("(\t| )+");
				String phone = split[0].substring(0,7);
				PhoneBean bean =WebUtil.getPhoneBean(phone);
				int up = Integer.parseInt(split[2]);
				int down =Integer.parseInt(split[3]);
				Integer sum = map.getOrDefault(bean.getProvince(),0 );
				sum=sum+up+down;
//				System.out.println(sum);
				map.put(bean.getProvince(), sum);
			}
			Set<Entry<String, Integer>> set = map.entrySet();
			List<Entry<String,Integer>> list = new ArrayList<Entry<String, Integer>>(set);
			WebUtil.sortByCount(list);
			for (Entry<String, Integer> entry : list) {
				System.out.println(entry);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
