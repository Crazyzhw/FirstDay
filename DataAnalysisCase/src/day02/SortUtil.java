package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortUtil {

	public static void sortByVersion(List<String> value) {
		Collections.sort(value, new Comparator<String>() {
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
	}

	public static void sortByDate(List<AppBean> list) {
		Collections.sort(list, new Comparator<AppBean>() {
			public int compare(AppBean o1, AppBean o2) {
				String date1 = o1.getDate();
				String date2 = o2.getDate();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date parse1 = null;
				Date parse2=null;
				try {
					parse1=sdf.parse(date1);
					 parse2= sdf.parse(date2);
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return parse1.before(parse2)?-1:1;
			}
		});
		
	}

}
