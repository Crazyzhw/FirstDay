package day05.案例分析4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class SortUtil {

	public static void sortByRate(List<RateBean> value) {
			Collections.sort(value,new Comparator<RateBean>() {
				@Override
				public int compare(RateBean o1, RateBean o2) {
					// TODO Auto-generated method stub
					return o2.getRate()-o1.getRate();
				}
			} );
	}

	public static double getAvg(List<RateBean> value) {
		double sum =0;
		for (int i = 0; i < value.size(); i++) {
			sum+=value.get(i).getRate();
		}
		double avg =sum/value.size();
		return avg;
	}

	public static void sortByAvg(List<Entry<String, Double>> list) {
		Collections.sort(list, new Comparator<Entry<String, Double>>() {

			@Override
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				return o2.getValue()-o1.getValue()>0?1:-1;
			}
		});
		
	}

	public static void sortByCount(List<Entry<String, Integer>> list) {
			Collections.sort(list, new Comparator<Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue()-o1.getValue();
				}
			});
		
	}

	public static double getAvg1(List<Integer> value) {
		double sum=0;
		for (Integer integer : value) {
			sum+=integer;
		}
		return sum/value.size();
	}

}
