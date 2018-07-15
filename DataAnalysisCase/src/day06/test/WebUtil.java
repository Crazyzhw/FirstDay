package day06.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class WebUtil {
	private static 	List<PhoneBean> list =null;
	static {
		list= WebUtil.getPhoneBeanList();
	}
	public static List<PhoneBean> getPhoneBeanList() {
		List<PhoneBean> list = new ArrayList<>();
		try (
			BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day05-流量统计\\phone.txt"));
				){
			String line;
			while((line=br.readLine())!=null) {
				String[] split = line.split("(	| )+");
				String num =split[1];
				String province =split[2];
				String city =split[3];
				String isp =split[4];
				PhoneBean bean = new PhoneBean();
				bean.set(num, province, city, isp);
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static String getWeb(String string) {
			String[] split = string.split("(/)+");
		return split[1];
	}
	public static void sortByCount(List<Entry<String, Integer>> list) {
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
	}
	public static PhoneBean getPhoneBean(String phone) {
		for (PhoneBean phoneBean : list) {
			if(phoneBean.getNum().equals(phone)) {
				return phoneBean;
			}
		}
		return null;
	}

}
