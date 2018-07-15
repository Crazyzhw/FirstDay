package day03.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyTestMain {
	public static void main(String[] args) {
		List<Long> ipList = MyTest01.getIPList();
		System.out.println(ipList.size());
		List<WebBean> list = MyTest02.getList();
			Map<String, Integer> pro=new HashMap<>();
		for ( long l : ipList) {
			for(int i =0;i<list.size();i++) {
				WebBean webBean = list.get(i);
				if(l>=webBean.getIpStrat()&&l<=webBean.getIpEnd()) {
					   Integer in = pro.getOrDefault(webBean.getPro(), 0);
					   in+=1;
					   pro.put(webBean.getPro(), in);
				}
			}
			
		}
		Set<Entry<String, Integer>> entrySet = pro.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}
	
}
