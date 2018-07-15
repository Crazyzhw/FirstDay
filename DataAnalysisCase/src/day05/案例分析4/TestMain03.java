package day05.案例分析4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain03 {
	public static void main(String[] args) {
		Map<String, Double> map1= new HashMap<>();
		Map<String, List<RateBean>> map = TestMain01.getMap();
		Set<Entry<String, List<RateBean>>> entrySet = map.entrySet();
		for (Entry<String, List<RateBean>> entry : entrySet) {
			List<RateBean> value = entry.getValue();
			double avg =SortUtil.getAvg(value);
			map1.put(entry.getKey(), avg);
		}
		Set<Entry<String, Double>> set = map1.entrySet();
		List<Entry<String,Double>> list = new ArrayList<>(set);
		SortUtil.sortByAvg(list);
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			System.out.println(list.get(i));
		}
	}
}
