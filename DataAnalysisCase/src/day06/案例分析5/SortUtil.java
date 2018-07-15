package day06.案例分析5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortUtil {

	public static String getUrl(String string) {
		Pattern p =Pattern.compile("(\\w+\\.)?(\\w+\\.){1}(\\w+)");
		Matcher matcher = p.matcher(string);
		while(matcher.find()) {
			String url = matcher.group();
			return url;
		}
		return null;
	}

	public static void sortBySum(List<Entry<String, Integer>> list) {
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	
				return o2.getValue()-o1.getValue();
			}
		});
		
	}

}
