package cn.edu360.javase35.day13;
//遍历map的三种方法

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<Integer,String>  map = new HashMap<>();
		map.put(1, "书");
		map.put(2, "山");
		map.put(3, "有");
		map.put(4, "路");
		map.put(5, "勤");
		map.put(6, "为");
		map.put(7, "径");
//		1.KeySet
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println("key"+integer+",value"+map.get(integer));
		}
//		2.entry
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
		System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> next = it.next();
			System.out.println("key:"+next.getKey()+",value:"+next.getValue());
		}
//	3.value
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}
		values.iterator();
		
		Object o = new Object();
		o.hashCode();
	}
	
	
}
