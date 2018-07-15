package day04.mytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//4.最热门的3部电影id和评价次数
public class MyTest3 {
	public static void main(String[] args) {
		  List<Entry<String, Integer>> list = new ArrayList<>();
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\案例分析day04\\MYTEST/热门电影.txt"));
				){
		
		Map<String, List<Message>> map = Mytest01.getMap();
		Map<String, Integer> map1= new LinkedHashMap<>();
		Set<Entry<String, List<Message>>> entrySet = map.entrySet();
		for (Entry<String, List<Message>> entry : entrySet) {
			List<Message> value = entry.getValue();
				for (Message message : value) {
					Integer in = map1.getOrDefault(message.getMovie(), 0);
					in+=1;
					map1.put(message.getMovie(), in);
				}
		}
		Set<Entry<String, Integer>> entrySet2 = map1.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
//			System.out.println(entry.getKey()+"--"+entry.getValue());
			list.add(entry);
			
		}
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
			bw.write(entry.getKey()+"--"+entry.getValue());
			bw.newLine();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


