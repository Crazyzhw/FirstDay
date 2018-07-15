package day04.mytest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMain1 {
	public static void main(String[] args) {
		task1_2();
	}

	public static Map<String, List<Message>>  task1_2() {
		Map<String, List<Message>> map = Mytest01.getMap();
		Map<String, List<Message>> map1 = new LinkedHashMap<String, List<Message>>();
		try (
			BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\JAVA资料\\案例分析day04\\MYTEST\\用户评分均值.txt"));
				){
		Set<Entry<String, List<Message>>> entrySet = map.entrySet();
		for (Entry<String, List<Message>> entry : entrySet) {
			List<Message> value = entry.getValue();
			SortUtil1.sortbyRate(value);
			List<Message> list = new ArrayList<>();
			list.add(value.get(0));
			list.add(value.get(1));
			list.add(value.get(2));
			map1.put(entry.getKey(), list);	
		}
		Set<Entry<String, List<Message>>> entrySet2 = map1.entrySet();
		for (Entry<String, List<Message>> entry : entrySet2) {
//			1.每个用户评分最高的三部电影
//			System.out.println(entry.getKey()+"---"+entry.getValue());
			bw.write("用户名称："+entry.getKey()+"-评分最高的三部电影："+entry.getValue());
			bw.newLine();
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map1;
	}
}
