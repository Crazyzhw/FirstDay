package day05.案例分析4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain04 {
	public static void main(String[] args) {
		Map<String, List<RateBean>> map = TestMain01.getMap();
		Map<String, Integer> map1 = new HashMap<>();
		Set<Entry<String, List<RateBean>>> entrySet = map.entrySet();
		for (Entry<String, List<RateBean>> entry : entrySet) {
			List<RateBean> value = entry.getValue();
			for (RateBean rateBean : value) {
				Integer in = map1.getOrDefault(rateBean.getMovie(), 0);
					in++;
				map1.put(rateBean.getMovie(), in);	
			}
			
		}
		Set<Entry<String, Integer>> entrySet2 = map1.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<>(entrySet2);
		SortUtil.sortByCount(list);
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			System.out.println(list.get(i));
		}
	}
}
