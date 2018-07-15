package day05.案例分析4;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain02 {
	public static void main(String[] args) {
		Map<String, List<RateBean>> map = TestMain01.getMap();
		Set<Entry<String, List<RateBean>>> entrySet = map.entrySet();
		for (Entry<String, List<RateBean>> entry : entrySet) {
			List<RateBean> value = entry.getValue();
			double avg =SortUtil.getAvg(value);
			System.out.println(entry.getKey()+"----"+String.format("%.2f", avg));
		}
	}
}
