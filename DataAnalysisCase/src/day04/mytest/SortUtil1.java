package day04.mytest;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;

import day01.Average;

public class SortUtil1 {

	public static void sortbyRate(List<Message> value) {
		Collections.sort(value, new Comparator<Message>() {
			public int compare(Message o1, Message o2) {
				return o2.getRate() - (o1.getRate());
			}
		});

	}

	public static void sortByAver(List<Average> list) {
		Collections.sort(list, new Comparator<Average>() {
			@Override
			public int compare(Average o1, Average o2) {
				double aver1 = o1.getAver().doubleValue();
				double aver2 = o2.getAver().doubleValue();
				if (aver1 > aver2) {
					return -1;
				} else if (aver1 < aver2) {

					return 1;
				} else {
					return 0;
				}

			}

		});
	}

	public static void sortByAver2(List<Entry<String, Double>> list) {
		Collections.sort(list, new Comparator<Entry<String, Double>>() {

			@Override
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				Double d1 = o1.getValue();
				Double d2 = o2.getValue();
				if (d1 > d2) {
					return -1;
				} else if (d1 < d2) {
					return 1;
				} else {
					return 0;
				}
			}
		});

	}
}
