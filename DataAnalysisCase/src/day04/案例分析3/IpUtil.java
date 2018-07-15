package day04.案例分析3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IpUtil {
	public static void main(String[] args) {
		for (IpBean string : list) {
			System.out.println(string);
		}
		}
	private static List<IpBean> list ;
	static {
		list =getIpList();
	}
	
	public static long ipts (String ip) {
		if(ip==null) {
			return 0L;
		}else {
			String[] split = ip.split("\\.");
			Long newIp =0l;
			int length = split.length-1;
			for(int i=0;i<=length;i++) {
				newIp |=Long.parseLong(split[i])<<(length-i<<3);
			}
			return newIp;
		}
		
		
	}

	private static List<IpBean> getIpList() {
		List<IpBean> list = new ArrayList<>();
		try (
				BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA资料\\案例资料\\day03-ip地址归属地\\ip.txt"));
				){
			String line;
			//1.0.1.0|1.0.3.255|16777472|16778239|亚洲|中国|福建|福州||电信|
			while((line=br.readLine())!=null) {
				String[] split = line.split("\\|");
				long startIp = Long.parseLong(split[2]);
				long endIp = Long.parseLong(split[3]);
				String pro =split[6];
				String city =split[7];
				String operator =split[8];
				IpBean bean =new IpBean() ;
				bean.set(startIp, endIp, pro, city, operator);
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public static IpBean getIpbean(long ip) {
		int start =0;
		int end =list.size()-1;
		while(start<=end) {
			int middle =(start+end)>>1;
			IpBean ipBean = list.get(middle);
			if(ip>=ipBean.getStartIp()&&ip<=ipBean.getEndIp()) {
				return ipBean;
			}else if(ip<ipBean.getStartIp()) {
				end =middle-1;
			}else if(ip>ipBean.getEndIp()) {
				start =middle+1;
			}
		}
		return null;
	}

	public static List<Entry<String, Integer>> mapSort(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue()-o1.getValue();
			}
		});
		return list;
	}
}
