package day05.案例分析4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain05 {
	public static void main(String[] args) {
		Map<String, List<RateBean>> map = TestMain01.getMap();
		Map<String, List<Integer>> map1 =new HashMap<>();
		Map<String, Double> map2 = new HashMap<>();
		Set<Entry<String, List<RateBean>>> entrySet = map.entrySet();
		for (Entry<String, List<RateBean>> entry : entrySet) {
			List<RateBean> value = entry.getValue();
			for (RateBean rateBean : value) {
				List<Integer> list = map1.getOrDefault(rateBean.getMovie(), new ArrayList<Integer>());
				list.add(rateBean.getRate());
				map1.put(rateBean.getMovie(), list);
			}
		}
		Set<Entry<String, List<Integer>>> set = map1.entrySet();
		for (Entry<String, List<Integer>> entry : set) {
			List<Integer> value = entry.getValue();
			double avg1 = SortUtil.getAvg1(value);
			map2.put(entry.getKey(), avg1);
		}
		Set<Entry<String, Double>> entrySet2 = map2.entrySet();
		List<Entry<String, Double>> list = new ArrayList<>(entrySet2);
		SortUtil.sortByAvg(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
