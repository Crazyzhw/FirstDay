package cn.edu360.javase35.day13;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "学");
		map.put(9, "海");
		map.put(3, "无");
		map.put(8, "涯");
		map.put(5, "苦");
		map.put(6, "做");
		map.put(7, "舟");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.remove(3));
		System.out.println(map);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("苦"));
		map.clear();
		System.out.println(map.isEmpty());
	}
}
